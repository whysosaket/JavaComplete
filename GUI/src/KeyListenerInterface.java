import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerInterface {
    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}

class KeyListenerDemo extends JFrame implements KeyListener {
    ImageIcon spaceship = new ImageIcon("spaceship.png");
    JLabel label;
    KeyListenerDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.addKeyListener(this);

        this.getContentPane().setBackground(Color.black);


        label = new JLabel();
        label.setIcon(spaceship);
        label.setBounds(200,200,42,52);

        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is typed. GIVES a CHAR output(USES A KEYCHAR)




    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical key is pressed (USES KEYCODE)
        switch (e.getKeyCode()){
            case 37-> label.setLocation(label.getX()-5,label.getY());
            case 40-> label.setLocation(label.getX()+5,label.getY());
            case 38-> label.setLocation(label.getX(),label.getY()+5);
            case 39-> label.setLocation(label.getX(),label.getY()-5);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // key released = called when a button is released
        System.out.println("You released the Key char: "+e.getKeyChar());
        System.out.println("You released the Key Code: "+e.getKeyCode());
    }
}