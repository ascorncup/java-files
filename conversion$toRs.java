/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class conversion$toRs extends JFrame implements ActionListener {

JLabel l1,l2;
JTextField t1, t2;
public conversion$toRs(){
    setSize(300,300);
    setLayout(null);
    l1 = new JLabel("Dollar");
    l1.setBounds(50,100,50, 50);
    t1 = new JTextField();
    t1.setBounds(100,100,50,50);
    l2 = new JLabel("INR");
    l2.setBounds(50,150,50, 50);
    t2 = new JTextField();
    t2.setBounds(100,150,50,50);
    t2.disable();
    t1.addActionListener(this);
    Font fo = new Font("Serif",Font.BOLD,20);
    t2.setFont(fo);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e){
    int d = Integer.parseInt(t1.getText());
    t2.setText(String.valueOf(d*73));
}
public static void main(String[] args) {
        conversion$toRs r = new conversion$toRs();
}
}
