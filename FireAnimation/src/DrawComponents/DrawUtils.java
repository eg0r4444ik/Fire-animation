package DrawComponents;

import java.awt.*;
import java.awt.geom.GeneralPath;

import static java.lang.Math.sqrt;

public class DrawUtils {

    public static void drawSpark(Graphics2D g, Color color, int x, int y){
        g.setColor(color);
//        g.fillRect(x, y, 1, 1);
//        g.setColor(new Color(243, 225, 71, 50));
        g.fillOval(x,y,5,5);
    }

}