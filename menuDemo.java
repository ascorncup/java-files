
package swingPack;
import javax.swing.*;
import java.awt.*;

public class menuDemo {
    private static Object JFrame;

    public static void main(String[] args) {
        JFrame f =new JFrame("Menu display");
        f.setSize(300,300);
        f.setLayout(null);
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        file.setMnemonic('F');
        JMenu edit = new JMenu("Edit");
        edit.setMnemonic('E');
        JMenu submenu = new JMenu("Tools");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");
        JOptionPane.showConfirmDialog(save,"Are you sure?");
        submenu.add(cut);
        submenu.add(copy);
        submenu.add(paste);
        file.add(open);
        file.add(save);
        edit.add(submenu);
        mb.add(file);
        mb.add(edit);
        f.setJMenuBar((mb));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);
        
        
    }
}
