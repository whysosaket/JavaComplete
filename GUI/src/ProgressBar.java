import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBar {
    public static void main(String[] args) {
        new ProgressBarDemo();
    }
}

class ProgressBarDemo extends JFrame implements ActionListener {


    JProgressBar progressBar= new JProgressBar(0,100);
    JButton button = new JButton("Start");

    ProgressBarDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);

        progressBar.setValue(0);                               //sets initial value of the progress bar
        progressBar.setBounds(60,60,300,40);
        progressBar.setStringPainted(true);                     // shows a number in the progressBar

        button.setBounds(175,140,70,30);
        button.setFocusable(false);
        button.addActionListener(this);


        this.setLayout(null);
        this.add(button);
        this.add(progressBar);
        this.setVisible(true);

        fillBar();

    }

    public void fillBar(){
        while(progressBar.getValue()<progressBar.getMaximum()){
            progressBar.setValue(progressBar.getValue()+1);
            try {
                Thread.sleep(50);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        progressBar.setString("Completed");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            button.setEnabled(false);
            fillBar();
        }
    }
}