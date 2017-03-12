package paint;

import java.awt.*;

/**
 * Created by lisa on 11.3.17.
 */
public class Square {
    public void draw(Graphics graphics){
        graphics.drawRect(10, 10, 100, 100);
        graphics.setColor(new Color(0x841A3E));
        graphics.fillRect(10, 10, 100, 100);
    }
}
