// import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf; // || FlatLightLaf
// import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App implements Require{
    @Override
    public Color setColor(){
        return null;
    }
    private JFrame frame;
    String[] raccourcies = {"ctrl N", "ctrl O", "ctrl S", "ctrl Q"};
    String[] nomActions = {"nouveau", "ouvrir", "enregitrer", "quitter"};
    ActionListener[] listener = new ActionListener[4];
    public App(){
        ConfigManager config = new ConfigManager();
        frame = new JFrame();
        frame.setTitle("NoteFacile");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        try{
            ImageIcon icon = new ImageIcon(getClass().getResource("icons/noter.png"));
            // Image logoColore = recolorIcon(icon.getImage(), new Color(0, 150,255));
            frame.setIconImage(icon.getImage());
        }catch(Exception e){
            System.out.println("Icone non trouvée");
        }

        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch(Exception ex){
            System.err.println("Echec FlatDarkLaf");
        }

        ContentPanel content = new ContentPanel();
        JTextArea text = content. getTextarea();
        Sidebar sidebar = new Sidebar(text, frame, config);
        Menu menu = new Menu(text, frame);

        listener[0] = e->nouveau(frame, text);
        listener[1] = e->ouvrir(frame, text);
        listener[2] = e->enregistrer(frame, text);
        listener[3] = e->quitter(text);

        frame.add(sidebar, BorderLayout.WEST);
        frame.add(menu, BorderLayout.NORTH);
        frame.add(content, BorderLayout.CENTER);

        frame.setVisible(true);
        raccourcie();
    }

    private void raccourcie(){
        for(int i = 0; i < raccourcies.length; i++){
            ConfigRac(raccourcies[i], nomActions[i], listener[i]);
        }
    }
    private void ConfigRac(String touche, String nomAction, ActionListener action){
        InputMap im = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = frame.getRootPane().getActionMap();
        im.put(KeyStroke.getKeyStroke(touche), nomAction);
        am.put(nomAction, new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                action.actionPerformed(e);
            }
        });
    }
    private Image recolorIcon(Image img, Color newColor) {
        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.drawImage(img, 0, 0, null);
        // On garde seulement les parties non-transparentes et on les colore
        g2d.setComposite(AlphaComposite.SrcIn);
        g2d.setColor(newColor);
        g2d.fillRect(0, 0, bi.getWidth(), bi.getHeight());
    
        g2d.dispose();
        return bi;
    }

    public static void main(String[] args) throws Exception {
    
         SwingUtilities.invokeLater(()->{
           new App();
        });
    }
}
