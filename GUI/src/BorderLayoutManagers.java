import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutManagers {
    public static void main(String[] args) {

        /*
        * Layout Manager = defines the natural layout for components within a container
        *   3 common managers
        *
        * BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
        *                All extra spaces is placed in the center area
        */

        JFrame frame= new JFrame();
        frame.setLayout(new BorderLayout(10,5));        // the constructors here are for margins
        frame.setSize(420,420);
        frame.setTitle("Border Layout Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4= new JPanel();
        JPanel panel5= new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //-----------------------SUB-PANELS-------------------------//
        JPanel panel6= new JPanel();
        JPanel panel7= new JPanel();
        JPanel panel8= new JPanel();
        JPanel panel9= new JPanel();
        JPanel panel10= new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.darkGray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout());

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);

        //------------------END-OF-SUBPANELS--------------------//


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);
    }
}
