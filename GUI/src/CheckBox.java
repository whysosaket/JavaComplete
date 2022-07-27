import javax.swing.*;
import java.awt.*;

public class CheckBox {
    public static void main(String[] args) {
        new myyframe();
    }
}

class myyframe extends JFrame {

    ImageIcon cross= new ImageIcon("cross.png");
    ImageIcon tick = new ImageIcon("tick.png");


    myyframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox= new JCheckBox();
        checkBox.setText("I am a Human");
        checkBox.setFont(new Font("Consolas", Font.BOLD,20));
        checkBox.setFocusable(false);
        checkBox.setIcon(cross);
        checkBox.setSelectedIcon(tick);

        JButton button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(e-> {
            if(checkBox.isSelected())
                System.out.println("You are a human");
            else System.out.println("You are not a human");
        });

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

}