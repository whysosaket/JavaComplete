import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons {
    public static void main(String[] args) {
        new miFrame();
    }
}

class miFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton NoodlesButton;
    JRadioButton BurgerButton;

    ImageIcon cross= new ImageIcon("cross.png");
    ImageIcon tick = new ImageIcon("tick.png");

    miFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("RadioButtons");
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("Pizza");
        pizzaButton.setIcon(cross);
        pizzaButton.setSelectedIcon(tick);

        NoodlesButton = new JRadioButton("Noodles");
        NoodlesButton.setIcon(cross);
        NoodlesButton.setSelectedIcon(tick);


        BurgerButton = new JRadioButton("Burger");
        BurgerButton.setIcon(cross);
        BurgerButton.setSelectedIcon(tick);


        pizzaButton.addActionListener(this);
        NoodlesButton.addActionListener(this);
        BurgerButton.addActionListener(this);

        // in order to use them as a group we need to add these to a group
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(NoodlesButton);
        group.add(BurgerButton);

        this.add(pizzaButton);
        this.add(NoodlesButton);
        this.add(BurgerButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You are getting a pizza");
        }
        else if(e.getSource()== NoodlesButton){
            System.out.println("You are getting Noodles");
        }
        else if(e.getSource()==BurgerButton){
            System.out.println("You are getting a Burger");
        }
    }
}