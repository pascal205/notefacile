import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.Border;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Menu extends JMenuBar implements Require {
    // @override
    public Color setColor(){
        return new Color(0, 0, 0);
    }
    public Menu(JTextArea text, JFrame frame){
        Color color = new Color(0, 0, 0);
        String nomDev = "Pascal AMETEPE";
       
        setOpaque(true);
        setBackground(Color.WHITE);
        JMenu menuFichier = new JMenu("Fichier");
        JMenu menuEdition = new JMenu("Edition");
        JMenu menuAide = new JMenu("Aide");
        JPopupMenu popup = new JPopupMenu();
        FlatSVGIcon iconN = chagerIcon("file-plus.svg");
        JMenuItem[] fichierItems = {new JMenuItem("Nouveau", iconN), new JMenuItem("Ouvrir", chagerIcon("folder-open.svg")), new JMenuItem("Enregistrer", chagerIcon("save.svg")), new JMenuItem("Quitter", chagerIcon("log-out.svg"))};
        JMenuItem[] editionItems = {new JMenuItem("Copier", chagerIcon("copy.svg")), new JMenuItem("couper", chageIcon("cut.png")), new JMenuItem("Coller", chagerIcon("clipboard-copy.svg")), new JMenuItem("Tout sélectionner", chagerIcon("square-mouse-pointer.svg"))};
        JMenuItem[] popupItems = {new JMenuItem("Copier", chagerIcon("copy.svg")), new JMenuItem("couper", chageIcon("cut.png")), new JMenuItem("Coller", chagerIcon("clipboard-copy.svg")), new JMenuItem("Tout sélectionner", chagerIcon("square-mouse-pointer.svg"))};
        JMenuItem[] aideItems = {new JMenuItem("A propos", chagerIcon("circle-alert.svg"))};
        String[] raccourcies = {"ctrl N", "ctrl O", "ctrl S", "ctrl Q"};
        String[] nomActions = {"nouveau", "ouvrir", "enregitrer", "quitter"};
        ActionListener[] listener = new ActionListener[4];
        listener[0] = e->nouveau(frame, text);
        listener[1] = e->ouvrir(frame, text);
        listener[2] = e->enregistrer(frame, text);
        listener[3] = e->quitter(text);
        ActionListener[] edition = new ActionListener[4];
        edition[0] = e->text.copy();
        edition[1] = e->text.cut();
        edition[2] = e->text.paste();
        edition[3] = e->text.selectAll();


        for(int i = 0; i < fichierItems.length; i++){
            if(i == 1){
                fichierItems[i].setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
            }
            fichierItems[i].addActionListener(listener[i]);
        };

        /* Edition */
        for(int i = 0; i < editionItems.length; i++){
            editionItems[i].addActionListener(edition[i]);
            popupItems[i].addActionListener(edition[i]);
        }
        editionItems[0].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        editionItems[1].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        editionItems[2].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        editionItems[3].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        // EditionItems[0].addActionListener(e->text.copy());
        // EditionItems[1].addActionListener(e->text.cut());
        // EditionItems[2].addActionListener(e->text.paste());
        // EditionItems[3].addActionListener(e->text.selectAll());

        aideItems[0].addActionListener(e->{
            JOptionPane.showMessageDialog(frame, "NoteFacile est un logiciel de prise de notes simple et efficace.\n\nVersion 1.0\n\nDéveloppé par: " + nomDev, "A propos", JOptionPane.INFORMATION_MESSAGE);
        });

        for (JMenuItem fichierItem : fichierItems) {
            menuFichier.add(fichierItem);

        }
        for (JMenuItem editionItem : editionItems) {
            menuEdition.add(editionItem);
        }
        for (JMenuItem popupItem : popupItems) {
            popup.add(popupItem);
        }
        for (JMenuItem aideItem : aideItems) {
            menuAide.add(aideItem);
        }
        

        text.setComponentPopupMenu(popup);
        add(menuFichier);
        add(menuEdition);
        add(menuAide);
    }
    private ImageIcon chageIcon(String url){
        int x = 30;
        int y = 30;
        ImageIcon imageOrigin = new ImageIcon(getClass().getResource("/icons/" + url));
        Image image = imageOrigin.getImage();
        // Image nouvimage = image.getScaledInstance(x, y, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
    // public void buttonadd(JButton button){
    //     // label.setMaximumSize(new Dimension(120, Integer.MAX_VALUE));
    //     // label.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
    //     button.setBackground(Color.WHITE);
    //     button.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
    //     button.setFocusPainted(false);
    //     add(button);
    // }

    /* private void ConfigRac(JFrame frame, String touche, String nomAction, ActionListener action){
        InputMap im = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am = frame.getRootPane().getActionMap();
        im.put(KeyStroke.getKeyStroke(touche), nomAction);
        am.put(nomAction, new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                action.actionPerformed(e);
            }
        });
    } */
}
