package Program;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

public abstract class Calculations implements Runnable, ActionListener {

    protected Graphics2D buffer;
    private int delay;
    private int width;
    private int height;
    protected Shape shape;
    protected Area area;
    protected AffineTransform aft;
    public Calculations(Graphics2D buf, int del, int w, int h) {
        delay = del;
        buffer = buf;
        width = w;
        height = h;
    }
    protected Shape nextFrame() {
        Rectangle bounds = area.getBounds();
        int x =(int)MouseInfo.getPointerInfo().getLocation().getX();
        int y =(int)MouseInfo.getPointerInfo().getLocation().getY();

        if(bounds.getX()<=x && bounds.getX()+width >=x &&bounds.getY()<=y && bounds.getY()+width >=y){
            MainWindow.stan.setText("Stan: ");
            buffer.setColor(Color.BLACK);
        }

        return area;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void run() {
        shape = nextFrame();
    }
}
