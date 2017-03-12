package paint;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lisa on 11.3.17.
 */
public class MainPanel extends JPanel{

    public void paint(Graphics g){
        new Square().draw(g);
    }
}
