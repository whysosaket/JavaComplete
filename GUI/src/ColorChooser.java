import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {
    public static void main(String[] args) {
        new ColorChooserDemo();
    }
}

class ColorChooserDemo extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ColorChooserDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Color");
        button.addActionListener(this);

        label= new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some Text");
        label.setFont(new Font("MV Boli",Font.BOLD,100));
        label.setOpaque(true);

        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            //JColorChooser colorChooser= new JColorChooser();

            Color color= JColorChooser.showDialog(null,"Pick a color,,,,yeyeeeyeyeee", label.getBackground());

            label.setForeground(color);
        }

    }
}