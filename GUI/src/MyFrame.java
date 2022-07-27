import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    //make a constructor then add the methods in that constructor
    MyFrame(){
        
        this.setTitle("First GUI in Java");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // to exit out of the application

        this.setResizable(false);              //to fix size
        this.setSize(420,420);     //set x,y dimensions
        this.setVisible(true);                 //makes the this visible

        //used to make a logo
        ImageIcon image = new ImageIcon("new.png");
        this.setIconImage(image.getImage());           //sets the image icon

        //methods to write colours in java
        this.getContentPane().setBackground(new Color(0x123456));
    }

}
