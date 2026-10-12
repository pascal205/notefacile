import javax.swing.*;
import java.awt.*;

public class Parametre extends JDialog {
    public Parametre(JFrame parent, JTextArea textArea, ConfigManager config) {
        super(parent, "Paramètres", true);
        setSize(350, 250);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(5, 2, 10, 10));
        // Taille police
        add(new JLabel("Taille police:"));
        JSpinner fontSizeSpinner = new JSpinner(new SpinnerNumberModel(
            Integer.parseInt(config.get("fontSize")), 8, 72, 1));
        add(fontSizeSpinner);
        // Police
        add(new JLabel("Police:"));
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox<String> fontBox = new JComboBox<>(fonts);
        fontBox.setSelectedItem(config.get("fontName"));
        add(fontBox);
        // Thème
        add(new JLabel("Thème:"));
        JComboBox<String> themeBox = new JComboBox<>(new String[]{"light", "dark"});
        themeBox.setSelectedItem(config.get("theme"));
        add(themeBox);
        // Wrap
        add(new JLabel("Retour auto ligne:"));
        JCheckBox wrapCheck = new JCheckBox("", Boolean.parseBoolean(config.get("wrap")));
        add(wrapCheck);
        // Boutons
        JButton saveBtn = new JButton("Enregistrer");
        JButton cancelBtn = new JButton("Annuler");
        add(saveBtn);
        add(cancelBtn);
        saveBtn.addActionListener(e -> {
            int size = (int) fontSizeSpinner.getValue();
            String fontName = (String) fontBox.getSelectedItem();
            String theme = (String) themeBox.getSelectedItem();
            boolean wrap = wrapCheck.isSelected();
            // Appliquer direct
            textArea.setFont(new Font(fontName, Font.PLAIN, size));
            textArea.setLineWrap(wrap);
            if (theme.equals("dark")) {
                textArea.setBackground(Color.DARK_GRAY);
                textArea.setForeground(Color.WHITE);
            } else {
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLACK);
            }
            // Sauvegarder
            config.set("fontSize", String.valueOf(size));
            config.set("fontName", fontName);
            config.set("theme", theme);
            config.set("wrap", String.valueOf(wrap));
            config.save();
            dispose();
        });
        cancelBtn.addActionListener(e -> dispose());
    }
}
