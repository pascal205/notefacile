import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Sidebar extends JPanel implements Require {
    FlatSVGIcon homeIcon = new FlatSVGIcon("icons/house.svg", 24, 24);
    static final Color color_inactive = new Color(45, 52, 70);
    static final Color color_active = new Color(52, 152, 219);
    private static JButton btnActif = new JButton();
    Color color = new Color(230, 235, 240);
    // @override
    public Color setColor(){
        return new Color(230, 235, 240);
    }
    public Sidebar(JTextArea text, JFrame frame, ConfigManager config){

        setBackground(new Color(45, 52, 70));
        setPreferredSize(new Dimension(200, 0));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        // JButton menuButton = new JButton("n");
        JButton accueilButton = new JButton("Accueil", chagerIcon("house.svg"));
        JButton nouveauButton = new JButton("Nouveau", chagerIcon("file-plus.svg"));
        JButton ouvrirButton = new JButton("Ouvrir", chagerIcon("folder-open.svg"));
        JButton enregistrerButton = new JButton("Enregistrer", chagerIcon("save.svg"));
        JButton parametresButton = new JButton("Paramètres", chagerIcon("settings.svg"));
        ActionListener actionBtn = e-> {JButton btnClic = (JButton) e.getSource(); setBoutonActif(btnClic);};
        // menuButton.setBackground(new Color(45, 52, 70));
        accueilButton.setToolTipText("Accueil ctrl+N");


        nouveauButton.setToolTipText("Nouveau fichier ctrl+N");
        nouveauButton.addActionListener(e->nouveau(frame, text));

        ouvrirButton.setToolTipText("Ouvrir ctrl+O");
        ouvrirButton.addActionListener(e->ouvrir(frame, text));

        enregistrerButton.setToolTipText("Enregistrer fichier ctrl+S");
        enregistrerButton.addActionListener(e->enregistrer(frame, text));
        parametresButton.addActionListener(e -> new Parametre(frame, text, config).setVisible(true));

        accueilButton.addActionListener(actionBtn);
        nouveauButton.addActionListener(actionBtn);
        ouvrirButton.addActionListener(actionBtn);
        enregistrerButton.addActionListener(actionBtn);
        parametresButton.addActionListener(actionBtn);

        // ajouterBouton(menuButton);
        ajouterBouton(accueilButton);
        ajouterBouton(nouveauButton);
        ajouterBouton(ouvrirButton);
        ajouterBouton(enregistrerButton);
        add(Box.createVerticalGlue());
        ajouterBouton(parametresButton);
    }
    

    private void ajouterBouton(JButton bouton) {
        // bouton.setAlignmentX(Component.LEFT_ALIGNMENT);
        bouton.setHorizontalAlignment(SwingConstants.LEFT);
        bouton.setVerticalAlignment(SwingConstants.CENTER);
        bouton.setVerticalTextPosition(SwingConstants.CENTER);
        bouton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        bouton.setBackground(new Color(45, 52, 70));
        bouton.setForeground(Color.WHITE);
        bouton.setFont(new Font("Segoe UI Emoji", Font.BOLD, 14));
        bouton.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        bouton.setIconTextGap(10);
        bouton.setFocusPainted(false);
        bouton.setFocusPainted(false);
        bouton.setOpaque(true);
        // bouton.setContentAreaFilled(false);
        add(bouton);
    }
    
    private void setBoutonActif(JButton nouvButton){
        if (btnActif != null) {
            btnActif.setBackground(color_inactive);    
        }
        nouvButton.setBackground(color_active);
        btnActif = nouvButton;
    }
}
