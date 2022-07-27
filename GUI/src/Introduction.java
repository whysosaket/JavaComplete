import javax.swing.*;
import java.awt.*;

public class Introduction {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components
        // there are two methods to create a frame
        // the first is just to make a frame object
        // and the next is to create a child class of JFrame

        JFrame frame= new JFrame(); //creates a frame (but frame is hidden, so we need to set visibility to true)
        frame.setTitle("First GUI in Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // to exit out of the application

        frame.setResizable(false);              //to fix size
        frame.setSize(420,420);     //set x,y dimensions
        frame.setVisible(true);                 //makes the frame visible

        //used to make a logo
        ImageIcon image = new ImageIcon("new.png");
        frame.setIconImage(image.getImage());           //sets the image icon

        //methods to write colours in java
        frame.getContentPane().setBackground(new Color(0x123456));
        //frame.getContentPane().setBackground(new Color(123,50,250));
        //frame.getContentPane().setBackground(Color.darkGray);
    }
}
