
import javax.swing.*;

public class swingExample extends JFrame {
    swingExample() {
        setTitle("Swing Example");
        JButton b = new JButton("click me");
        b.setBounds(30, 100, 80, 30);// setting button position
        add(b);// adding button into frame
        setSize(300, 300);// frame size 300 width and 300 height
        setLayout(null);// no layout manager
        setVisible(true);// now frame will be visible, by default not visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        swingExample f = new swingExample();
    }
}
