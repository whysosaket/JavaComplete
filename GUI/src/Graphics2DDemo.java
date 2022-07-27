import javax.swing.*;
import java.awt.*;

public class Graphics2DDemo {
    public static void main(String[] args) {
        new Graphics2DFrame();
    }
}

class Graphics2DFrame extends JFrame {


    Graphics2DFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setSize(500,500);


        this.add(new Graphics2DPanel());


        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    /*
    public void paint(Graphics g){
        //Graphics 2D is a subclass of Graphics class
        //It comes with more functionality, than the regular graphics class
        Graphics2D g2d = (Graphics2D) g;

        /*
        this is a line drawn from top left corner to the bottom right
        but this line will not necessarily be at the top corner because,
        for dimentions say 500*500, it includes the title bar
        SO THE SOLUTION IS TO:
        create a panel and then draw on the panel and then add that to the frame

        g2d.drawLine(0,0,500,500);
    }
    */
}

class Graphics2DPanel extends JPanel{
    Image image;
    Graphics2DPanel(){
        this.setPreferredSize(new Dimension(700,650));
        this.setBackground(Color.black);
        image = new ImageIcon("xyz.png").getImage();
        //this.setOpaque(true);

    }

    public void paint(Graphics g){
        //Graphics 2D is a subclass of Graphics class
        //It comes with more functionality, than the regular graphics class
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.blue);
        g2d.setStroke(new BasicStroke(5));      //sets the stroke size and type
        //g2d.drawLine(0,0,500,500);                    //we can even draw other shapes
        g2d.drawRect(30,30,200,100);

        //we can even fill the shapes -- but these are just painted over other
        //for different color, just change the pain color before implementing
        g2d.setPaint(Color.pink);
        g2d.fillRect(33,33,195,95);

        //any newly created graphics will overlap the previously created graphics
        //for drawing a circle we use drawOval method
        g2d.setPaint(Color.red);
        g2d.fillOval(280,60,50,50);

        //DRAWING AN ARC, SAY POKEBALL,
        //for the upper arc of the pokeball
        g2d.fillArc(100,250,150,150,0,180);

        //for the lowerCircle
        g2d.setPaint(Color.white);
        g2d.fillArc(100,250,150,150,180,180);

        //Drawing the straight black line in the ball
        g2d.setPaint(Color.black);
        g2d.drawLine(102,325,248,325);

        //Drawing plainwhite circle in the middle of the ball
        g2d.setPaint(Color.white);
        g2d.fillOval(151,300,50,50);

        //Drawing the black outline of the pokeball
        g2d.setPaint(Color.black);
        g2d.drawOval(151,300,50,50);

        //drawing the final black circle in the middle of the white ball
        g2d.drawOval(166,315,20,20);

        //--------------END OF THE DRAWING OF THE POKEBALL

        //We can also draw a String
        g2d.setPaint(Color.cyan);
        g2d.setFont(new Font("Ink Free",Font.BOLD,30));
        g2d.drawString("Pika--Pika!!!",290,310);

        //Drawing a polygon
        /*
        * To draw a polygon we pass in array of integer as points as in where to put the points
        * also the length of the array is equal to the number of vertices of the polygon
        */

        g2d.setPaint(Color.yellow);
        //declaring the point of the polygon
        int[] xPoints = {300,450,165};
        int[] yPoints = {400,450,500};
        g2d.drawPolygon(xPoints,yPoints,3);

        //we can even draw images using graphics 2d,
        //g2d.drawImage(image,0,0,null);

    }
}