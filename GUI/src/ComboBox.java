import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        new framee();
    }
}

class framee extends JFrame implements ActionListener {

    JComboBox comboBox;

    framee(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // the passed array or list should be in reference data type
        String [] animals= {"dog","cat","horse","cat"};

        //adding duplicate items in the list creates a reference of the time it was first created
        //but with the remove method, it will delete only the first instance that the item appeared

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //commands for ComboBox
        //comboBox.setEditable(true);                 // this make items editable in the menu
        //System.out.println(comboBox.getItemCount());    //prints number of components
        comboBox.addItem("tiger");                      //adds a new item to the list
        comboBox.insertItemAt("lion",0);    // adds a new item to the list a certain index
        comboBox.setSelectedIndex(2);                   // sets the initial item as default when the program is run
        comboBox.removeItem("cat");             //removes a certain item from the list
        comboBox.removeItemAt(1);
        //comboBox.removeAllItems();                    // removes all the items from the list


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedIndex() + "\t" + comboBox.getSelectedItem());
        }
    }
}
