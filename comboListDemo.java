
package swingPack;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class comboListDemo extends JFrame implements ActionListener{
    JComboBox cb;
    JList jl;
    JButton b;
    JTextArea ta;
    comboListDemo(){
        setSize(500,500);
        setLayout(new GridLayout(4,1));
        String[] s ={"Mango","Orange","Apple"};
        cb = new JComboBox(s);
        String[] s1 = {"Carrot","Beans","Onion","Potato"};
        jl = new JList(s1);
        b = new JButton("Submit");
        ta = new JTextArea();
        add(cb);
        add(jl);
        add(b);
        add(ta);
        b.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    public void actionPerformed(ActionEvent e){
        String str = "Selecteed text: \nFruits: ";
        str+=cb.getSelectedItem();
        str+="\nVegetables: ";
        Object[] stg = jl.getSelectedValues();
        for(Object s1:stg){
            str+=" "+s1.toString();
        }
        ta.setText(str);
    }
    public static void main(String[] args) {
        new comboListDemo();
    }
}
