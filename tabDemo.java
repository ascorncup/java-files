package swingPack;
import javax.swing.*;
import java.awt.*;
public class tabDemo extends JFrame{
    JTabbedPane tp;
    JLabel l1,l2;
    JPanel p1,p2,p3;
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2,r3;
    
    tabDemo(){
        setSize(600,600);
        l1 = new JLabel("Tab one");
        tp = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
        p1 = new JPanel();
        p1.add(l1);
        l2 = new JLabel("Tab two");
        p2 = new JPanel();
        p2.add(l2);
        tp.addTab("One", l1);
        ImageIcon i1 = new ImageIcon("‪C:\\Users\\USER\\Downloads\\man.gif");
        tp.addTab("Two",i1,p2);
        c1 = new JCheckBox("Reading");
        c1 = new JCheckBox("Reading");
        c2 = new JCheckBox("Watching TV");
        c3 = new JCheckBox("Gaming");
        r1 = new JRadioButton(">100000pa");
        r2 = new JRadioButton(">100000pa or <5000000pa");
        r3 = new JRadioButton(">500000pa");
        ButtonGroup bg = new ButtonGroup();//makes only one button could be selected in the group.
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        p3 = new JPanel();
        p3.add(c1);p3.add(c2); p3.add(c3);
        p3.add(r1);p3.add(r2); p3.add(r3);
        tp.addTab("Three",i1,p3,"ToolTipText");
        getContentPane().add(tp);
        //add(tp,BorderLayout.WEST);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new tabDemo();
    }
}
