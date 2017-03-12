package paint;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lisa on 11.3.17.
 */
public class MainWindow extends JFrame {


    public static void main(String[] args) {
        JFrame frm = new JFrame();
        MainPanel pn = new MainPanel();

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().add(BorderLayout.CENTER, pn);
        frm.setSize(800,400);
        frm.setVisible(true);
    }

}
