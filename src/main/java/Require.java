import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public interface Require {
    Color setColor();
    // static Color color = new Color(230, 235, 240);
    
    default FlatSVGIcon chagerIcon(String url){
        FlatSVGIcon icon = new FlatSVGIcon("icons/" + url, 24, 24);
        icon.setColorFilter(
            new FlatSVGIcon.ColorFilter(
                c-> setColor()
            )
        );
        return icon;
    }

    default void nouveau(Component composant, JTextArea text){
        int choix =  JOptionPane.showConfirmDialog(composant, "Voulez-vous créer une note ?", "Nouvelle note",  JOptionPane.YES_NO_OPTION);
        if(choix ==  JOptionPane.YES_OPTION){
            text.setText("Commencer à écrire...");
        }
    }
    default void ouvrir(Component composant, JTextArea text){
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showOpenDialog(composant);
            if(result == JFileChooser.APPROVE_OPTION){
                File fichier = chooser.getSelectedFile();
                try{
                    String contenu = Files.readString(
                        fichier.toPath()
                    );
                    text.setText(contenu);
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(composant, "Impossible d'ouvrire le fichier");
                }
            }
    }
    default void enregistrer(Component composant, JTextArea text){
            JFileChooser chooser = new JFileChooser();
            int result = chooser.showSaveDialog(composant);
            if(result == JFileChooser.APPROVE_OPTION){
                File fichier = chooser.getSelectedFile();
                try{
                    Files.writeString(
                        fichier.toPath(),
                        text.getText()
                    );
                    JOptionPane.showMessageDialog(composant, "Fichier enregistré avec succès.");
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(composant, "Echec ! Fichier non enregistré.");
                }
            }
    }
    default void quitter(Component composant){
        int choix = JOptionPane.showConfirmDialog(composant, "Voulez-vous vraiment quitter !?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(choix == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
}
