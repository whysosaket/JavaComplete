import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar {
    public static void main(String[] args) {
        new MenuBarDemo();
    }
}

class MenuBarDemo extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;

    MenuBarDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout(FlowLayout.LEADING,5,0));

        menuBar= new JMenuBar();

        // actually making the menu
        JMenu file= new JMenu("Files");
        JMenu tools= new JMenu("Tools");
        JMenu help= new JMenu("Help");

        //setting mnemonic keys for menu
        file.setMnemonic(KeyEvent.VK_F);                // hold "Alt + Key" to do Action
        tools.setMnemonic(KeyEvent.VK_T);               // hold "Alt + Key" to do Action
        help.setMnemonic(KeyEvent.VK_H);                // hold "Alt + Key" to do Action

        //setting up the menuItems
        load= new JMenuItem("load");
        save= new JMenuItem("save");
        exit= new JMenuItem("exit");


        //adding actionListeners to the menu
        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        //we can even add the shortCut keys for these Items
        load.setMnemonic(KeyEvent.VK_L);        //click the assigned keys to action
        save.setMnemonic(KeyEvent.VK_S);        //click the assigned keys to action
        exit.setMnemonic(KeyEvent.VK_E);        //click the assigned keys to action


        //adding all the items in Files Menu
        file.add(load);
        file.add(save);
        file.add(exit);

        // adding main menus in the menubar
        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
        this.setJMenuBar(menuBar);          //setting menubar in the program
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==load){
            System.out.println("You are loading a file");
        }
        else if (e.getSource()==save){
            System.out.println("You are saving a file");
        }
        else if (e.getSource()==exit){
            System.exit(0);
        }
    }
}