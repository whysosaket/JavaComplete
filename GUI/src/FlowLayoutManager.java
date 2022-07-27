import javax.swing.*;
import java.awt.*;

public class FlowLayoutManager {
    public static void main(String[] args) {
        /*
        *  Layout Manager = Define a natural layout for components within a container
        *
        * FlowLayout = places components in rows, sized at a preferred sized
        *              if place is too small then the remaining components are sent
        *              to the next row
        */

        JFrame frame = new JFrame();
        //frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1= new JButton("1");
        JButton button2= new JButton("2");
        JButton button3= new JButton("3");
        JButton button4= new JButton("4");
        JButton button5= new JButton("5");
        JButton button6= new JButton("6");
        JButton button7= new JButton("7");
        JButton button8= new JButton("8");
        JButton button9= new JButton("9");

        JPanel panel= new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,5));
        panel.setBackground(Color.GRAY);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.add(panel);
        frame.setVisible(true);
        }
}
