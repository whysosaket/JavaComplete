import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooser {
    public static void main(String[] args) {
        // JFileChooser = GUI mechanism that helps the user to choose a file

        new FileChooserDemo();


    }
}

class FileChooserDemo extends JFrame implements ActionListener {

    JButton button;

    FileChooserDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(420,200));

        button= new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){

            JFileChooser fileChooser= new JFileChooser();
            //fileChooser.showOpenDialog(null); // select file to open

            //to change a default directory
            fileChooser.setCurrentDirectory(new File("C:\\"));

            int response=fileChooser.showOpenDialog(null);
            //we can even use save dialogue box

            /*
            * The above line returns an integer variable as response,
            * say 0 for opening a file or 1 for closing or cancelling
            */

            if(response== JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());  // to get chosen file path
                System.out.println(file);
            }

        }

    }
}