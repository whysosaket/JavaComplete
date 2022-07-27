import javax.swing.*;

public class OptionPane {
    public static void main(String[] args) {
        /*
        * JOptionPane = A popup in java that sends user a message/ warning or
        *               to take an input
        */

        JOptionPane.showMessageDialog(null,"This is a message","Plain",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a message","Plain",JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a message","Plain",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a message","Plain",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is a message","Plain",JOptionPane.WARNING_MESSAGE);

        // the lower value returns 0 for yes, 1 for no and -1 for cancel
        JOptionPane.showConfirmDialog(null,"Do You Code?","Title this",JOptionPane.YES_NO_CANCEL_OPTION);

        //input dialogue box returns a string value
        JOptionPane.showInputDialog("Enter Your Name Please!!!");
        //ImageIcon image= new ImageIcon("new.png");
        String [] responses = {"Haa bey", "Noiii","nup"};
        JOptionPane.showOptionDialog(null, "Bro, Do You Code??","TITLE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,responses,0);

    }
}
