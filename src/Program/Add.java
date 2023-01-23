package Program;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Add extends Calculations{

    public Add(Graphics2D buffer, int delay, int width, int height, int x, int y) {
        super(buffer,delay,width,height);
        shape=new Rectangle2D.Double(x,y,50,50);
        buffer.setColor(Color.BLUE);
        aft=new AffineTransform();
        area=new Area(shape);
    }

    @Override
    public void run() {
        try {
        Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
    }


}
