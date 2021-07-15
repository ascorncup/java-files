
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class buttonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 180, 20);
        JButton b = new JButton("Click Here");
        b.setMnemonic('c');// shortcut key alt+c
        b.setBounds(50, 100, 95, 30);
        ImageIcon icon = new ImageIcon("C:\\Users\\USER\\Downloads\\google.png");
        JButton b1 = new JButton(icon);
        b1.setBounds(50, 150, 100, 50);
        Border br = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        JButton b2 = new JButton("Different Border");
        b2.setBounds(50, 230, 95, 30);
        b2.setBorder(br);
        b2.setBackground(Color.YELLOW);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("You have clicked plain button.");
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("You have clicked image.");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("You have clicked border button.");
            }
        });
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}