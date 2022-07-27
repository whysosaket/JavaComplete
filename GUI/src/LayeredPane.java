import javax.swing.*;
import java.awt.*;

public class LayeredPane {
    public static void main(String[] args) {
        /*
        *   JLayeredPane = a swing container that provides
        *                  a third dimension for positioning components
        *                  ex. depth, z-Axis
        */

        JLabel label1= new JLabel();
        label1.setBounds(50,50,180,180);
        label1.setOpaque(true);
        label1.setBackground(Color.red);

        JLabel label2= new JLabel();
        label2.setBounds(100,100,180,180);
        label2.setOpaque(true);
        label2.setBackground(Color.green);

        JLabel label3= new JLabel();
        label3.setBounds(150,150,180,180);
        label3.setOpaque(true);
        label3.setBackground(Color.blue);



        JLayeredPane layeredPane= new JLayeredPane();
        layeredPane.setSize(new Dimension(420,420));

        // to set position in the z-axis, we add
        // Integer.valueOf(0) in here to add depth
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("Layered Pane");
        frame.add(layeredPane);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);



        frame.setVisible(true);

    }
}
