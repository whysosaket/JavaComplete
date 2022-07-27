import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public static boolean bool=false;
    static JButton b;
    static int count;
    public static void main(String[] args) {
        MyButton main= new MyButton();
        count=0;
        b= new JButton();
        b.setBounds(150,220,100,50);
        b.addActionListener(e -> {
            System.out.println("Lambda Expression in Java ");
            count++;
            MyButton.updateText();
            if (count==50){
                JOptionPane.showMessageDialog(null,"Kya karr rha hai yarr tu????");
            }
            else if(count==69) {
                JOptionPane.showMessageDialog(null, "Noice!!!!! I see you as a man of culture");
                System.exit(0);
            }
        });      // this is lambda expression
        b.setText("Lambda");                        // this can be used to replace that action listener task
        b.setFont(new Font("Comic Sans", Font.BOLD,15));
        b.setForeground(Color.cyan);
        b.setBackground(Color.GRAY);
        b.setBorder(BorderFactory.createEtchedBorder());
        b.setEnabled(bool);
        b.setFocusable(false);

        main.add(b);

    }
    public static void buttonAction(){
        bool=!bool;
        b.setEnabled(bool);
    }
}
class MyButton extends JFrame implements ActionListener {

    JButton button;
    static JLabel label;

    MyButton(){
        button= new JButton();
        button.setBounds(150,150,100,50);
        button.addActionListener(this);
        button.setText("Click Me");
        button.setFocusable(false);         // to remove the focus box from around the text in the button
        button.setFont(new Font("Comic Sans", Font.BOLD,15));
        button.setForeground(Color.cyan);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        label = new JLabel();
        label.setText("Counter (Lambda): "+Buttons.count);
        label.setVisible(false);
        label.setBounds(140,50,200,20);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setResizable(false);
        this.setTitle("Buttons");
        this.setLayout(null);
        this.setVisible(true);
        this.setBackground(Color.black);                            // this doesn't work
        this.add(button);
        this.add(label);


    }
    public static void updateText(){
        label.setText("Counter (Lambda): "+Buttons.count);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            Buttons.buttonAction();
            JOptionPane.showMessageDialog(null,"The Button Lambda is Enabled: "+Buttons.bool);
            label.setVisible(Buttons.bool);
        }
    }
}