import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args) {

        // JPanel = is a GUI component that acts as a container to hold other components

        ImageIcon icon = new ImageIcon("bg.png");
        ImageIcon image1 = new ImageIcon("logo.png");

        JLabel label1= new JLabel();
        label1.setText("Hello, Java!!!");
        label1.setForeground(Color.white);
        label1.setVerticalAlignment(JLabel.TOP);                // this moves label to the top
        label1.setHorizontalAlignment(JLabel.RIGHT);

        JLabel label2= new JLabel();
        label2.setText("This is the label2");
        label2.setForeground(Color.white);
        label2.setVerticalAlignment(JLabel.BOTTOM);                // this moves label to the top
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setBounds(0,0,100,75);
        

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(230,100,100));
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());                 // we need to add this before we add label
        redPanel.add(label1);                                 //one label can only be added to one JPanel
        //redPanel.add();

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(100,100,230));
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(100,230,100));
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);                               // this forces us to take manual input for the layout
        greenPanel.add(label2);

        //greenPanel.setLayout(new BorderLayout());                   // this moves the components to the left and
        //greenPanel.add(label1);                                     // center of the panel
        


        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setIconImage(icon.getImage());
        frame.setTitle("Panels");
        frame.setSize(600,600);
        frame.setVisible(true);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);



    }
}
