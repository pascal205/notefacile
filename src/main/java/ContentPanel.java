import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class ContentPanel extends JPanel {
    private JTextArea text;
    public ContentPanel(){
        setBackground(new Color(40,40,40,2));
        setLayout(new BorderLayout());

        JLabel titre = new JLabel("Mon bloc-notes");
        titre.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titre.setBorder(BorderFactory.createEmptyBorder(10, 12, 10, 10));

        text = new JTextArea("Commencer à écrire ici...");
        text.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        

        text.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));

        JScrollPane scroll = new JScrollPane(text);
        scroll.setBorder(BorderFactory.createEmptyBorder(5, 12, 12, 12));
        add(scroll, BorderLayout.CENTER);
        add(titre, BorderLayout.NORTH);
    }
    public JTextArea getTextarea(){
        return this.text;
    }
}
