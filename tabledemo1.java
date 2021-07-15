import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class tabledemo1 extends JFrame {
    JTable tb;
    JScrollPane sp;

    tabledemo1(){
        setSize(300,300);
        setVisible(true);
        Vector heading=new Vector();
        heading.add("Reg No");
        heading.add("Name");
        heading.add("Class");

        Vector details=new Vector();
        Vector row1=new Vector();
        row1.add("1001");
        row1.add("akhil");
        row1.add("BCA E");
        Vector row2=new Vector();
        row2.add("1002");
        row2.add("Vishnu");
        row2.add("BCA F");
        Vector row3=new Vector();
        row3.add("1003");
        row3.add("Rahul");
        row3.add("BCA E");


        details.add(row1);
        details.add(row2);
        details.add(row3);
        tb=new JTable(details,heading);
        tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        add(tb);

       sp=new JScrollPane(tb);
       sp.setBounds(20,60,200,200);
       add(sp);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        tabledemo1 tab=new tabledemo1();
    }
}