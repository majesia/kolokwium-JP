package Program;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Multiplication extends Calculations{

    public Multiplication(Graphics2D buffer, int delay, int width, int height, int x, int y) {
        super(buffer,delay,width,height);
        shape=new Ellipse2D.Double(x, y , 40,40);
        buffer.setColor(Color.BLUE);
        aft=new AffineTransform();
        area=new Area(shape);
    }


    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }


}
