import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider {
    public static void main(String[] args) {
        new SliderDemo();
    }
}

class SliderDemo extends JFrame implements ChangeListener {

    JPanel panel= new JPanel();
    JLabel label= new JLabel();
    JSlider slider= new JSlider(0,100,50);          // minimum, maximum, initial value
    JLabel title= new JLabel("TEMPERATURE");

    SliderDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);

        slider.setBounds(60,100,300,70);

        // this below is for small divisors
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        // this is for the bigger ticks
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);

        // this is for the numbers
        slider.setPaintLabels(true);
        slider.setFont(new Font("Consolas",Font.PLAIN,13));
        slider.addChangeListener(this);

        // for setting the orientation, vertical or horizontal
        //slider.setOrientation(SwingConstants.VERTICAL); // we could pass in 1, for case vertical
        //slider.setOrientation(SwingConstants.HORIZONTAL);   // and for horizontal case, we could pass in 0

        //setting label
        label.setText("Degree Celsius: "+slider.getValue());
        label.setBounds(150,200,300,40);
        label.setFont(new Font("Consolas",Font.BOLD,14));
        label.setForeground(Color.white);

        title.setBounds(150,50,300,40);
        title.setFont(new Font("MV Boli",Font.BOLD,20));
        title.setForeground(Color.cyan);

        panel.setBounds(0,0,420,420);
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        panel.add(slider);
        panel.add(title);
        panel.add(label);

        this.add(panel);
        this.setSize(420,420);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Degree Celsius: "+slider.getValue());
        label.setBounds(150,200,300,40);
        label.setFont(new Font("Consolas",Font.BOLD,14));
        label.setForeground(Color.white);

        if(slider.getValue()>80) label.setForeground(Color.red);
        else if(slider.getValue()<20) label.setForeground(Color.blue);
    }
}