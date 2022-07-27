import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image or both

        ImageIcon image= new ImageIcon("bg.png");
        ImageIcon image1= new ImageIcon("glass.png");
        Border border= BorderFactory.createLineBorder(Color.magenta,5); //we need to set this to ou label

        //we can even pass on a instance
        //JLabel label= new JLabel("Hello GUI World");
        JLabel label= new JLabel();             // creates a label(but we need to add it to our frame)
        label.setText("DaDaDaDa..... It's the MFKing");       //set text for a label
        label.setHorizontalTextPosition(JLabel.CENTER);         //set text left, center or right
        label.setVerticalTextPosition(JLabel.TOP);           //set text to top center or bottom of image icon
        label.setIcon(image1);                   // used to add image to a Jlabel;
        label.setForeground(new Color(255,200,234));
        label.setFont(new Font("MV Boli", Font.BOLD, 50));  //set font of text
        label.setIconTextGap(20);
        label.setBackground(new Color(0x123456));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);          //set vertical position of icon + text within the label
        label.setHorizontalAlignment(JLabel.CENTER);        //set horizontal position of icon + text within the label
        //label.setBounds(0, 0, 720, 600);        // this fixes our label to a certain position



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        //frame.setSize(720,600);
        //frame.setLayout(null);                // can use this to prevent our label from taking all the frame area
        frame.setTitle("JLabels");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setVisible(true);

        frame.add(label);           // we need to add this component to our frame in order to set it visible
        frame.pack(); // this method just packs all the stuff that we have inside the frame
        // but make sure to add this after adding the layer


    }
}
