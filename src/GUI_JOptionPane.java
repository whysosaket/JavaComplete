import javax.swing.*;
//basically popUP
public class GUI_JOptionPane {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter Your Name!!");
        JOptionPane.showMessageDialog(null,"Your Name is "+name);

        //this JOptionPane return a String Value so we need to parse it in order to store in some primitive value
        try {
            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age!"));
            JOptionPane.showMessageDialog(null, "Your age is " + age);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "There Has Been Some Error!!");
        }

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height!"));
        JOptionPane.showMessageDialog(null, "Your height is "+height);

    }
}
