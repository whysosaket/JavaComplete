import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TextField {
    public static void main(String[] args) {
        mFrame mf= new mFrame();

    }
}

class mFrame extends JFrame implements ActionListener{

    JButton button;
    JTextField textField;
    mFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);
        //button.setHorizontalAlignment(JButton.TRAILING);

        textField  = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Ariel",Font.BOLD,20));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.white);
        textField.setText("username");

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(textField.getText());
        }
    }
}