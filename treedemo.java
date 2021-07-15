package swingpack;


import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class treedemo extends JFrame{
    JTree t;

    treedemo(){
        setSize(300,300);
        setTitle("Tree program");
        setLayout(new FlowLayout());
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("JavaApplication");
        DefaultMutableTreeNode c1=new DefaultMutableTreeNode("SwingPrograms");
        DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Multithreading");
        DefaultMutableTreeNode c22=new DefaultMutableTreeNode("Two threads ");
        c2.add(c22);
        c1.add(c2);
        root.add(c1);
        t=new JTree(root);
        add(t);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        treedemo tree=new treedemo();
    }
    
}
