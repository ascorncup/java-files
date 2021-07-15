/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingPack;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author USER
 */
public class labelDemo {
    public static void main(String[] args) {
        JFrame f =new JFrame("My first swing program.");
        f.setLayout(new FlowLayout());
        f.setSize(300,300);
        JLabel l1 = new JLabel("name");
        ImageIcon i = new ImageIcon("");
        JLabel l2 = new JLabel(i);
        f.add(l1);
        f.add(l2);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
