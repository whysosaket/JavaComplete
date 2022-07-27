import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerInterface {
    public static void main(String[] args) {
        new MouseListenerDemo();
    }
}

class MouseListenerDemo extends JFrame implements MouseListener {
    ImageIcon smiley = new ImageIcon("smiley.png");
    ImageIcon thumbsup = new ImageIcon("thumbsup.png");
    ImageIcon wink = new ImageIcon("wink.png");

    JLabel label;

    MouseListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        label= new JLabel();
        label.addMouseListener(this);
        defaultLabel();

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    void defaultLabel(){

        //this.setSize(smiley.getIconWidth()+100,smiley.getIconHeight()+100);
        label.setIcon(smiley);
        //label.setSize(smiley.getIconWidth(),smiley.getIconHeight());

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    //invoked when mouse is clicked over a component (both pressed and released)
        //System.out.println("Mouse is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    // invoked when mouse is pressed over a component
        label.setIcon(thumbsup);
        System.out.println("Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    // invoked when mouse is released over a componenet
        //System.out.println("Mouse was released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    //invoked when mouse enter a component
        label.setIcon(wink);
        System.out.println("Mouse Entered the Label");
    }

    @Override
    public void mouseExited(MouseEvent e) {
    //invoked when mouse exits a component
        defaultLabel();
        System.out.println("Mouse Exited the Label");
    }
}