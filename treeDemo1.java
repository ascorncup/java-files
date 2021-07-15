
package swingPack;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;


import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class treeDemo1 extends JFrame{
    JTree t;

    treeDemo1(){
        setSize(300,300);
        setTitle("Tree program");
        setLayout(new FlowLayout());
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("JavaApplication1");
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
        treeDemo1 tree=new treeDemo1();
    }
    
}