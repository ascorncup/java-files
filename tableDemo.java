import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class tableDemo extends JFrame {
    JTable tb;
    JScrollPane sp;

    tableDemo(){
        setSize(300,300);
        setVisible(true);
        String[] heading={"Reg No","Name","Class"};
        String[][] data={{"1001","Akhil","Int MCA"},{"Ms202","Raghu","BCA F"}};

        tb=new JTable(data,heading);
        add(tb);

       sp=new JScrollPane(tb);
       
       sp.setBounds(20,60,200,200);
       add(sp);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        tabledemo table=new tabledemo();
    }
}
