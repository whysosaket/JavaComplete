import javax.swing.*;
import java.awt.*;

public class GridLayoutManager {
    public static void main(String[] args) {

        /*
        * GridLayout = places components in grid of cells
        *              each available component takes all the space in it's cell
        *              and each cell is of same size
        */

        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(4,3,10,10));
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));

        frame.setVisible(true);
    }
}
