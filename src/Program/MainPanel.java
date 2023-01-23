package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class MainPanel extends JPanel implements ActionListener, MouseListener {

    BufferedImage buffer;
    Graphics2D screenG;
    static Graphics2D bufferG;
    private static Timer timer = null;
    public MainPanel() {
        setLayout(null);
        setBackground(Color.pink);
        timer = new Timer(70, this);
        addMouseListener(this);
    }

    public void initialize() {
        buffer = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        bufferG = (Graphics2D) buffer.getGraphics();
        bufferG.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        screenG = (Graphics2D) getGraphics();
        screenG.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    }

    public static void addFig(int x, int y){
        if(MainWindow.kind==0){
            createAdd(x, y);
        }

        if(MainWindow.kind==1){
            createMultiplication(x, y);
        }
    }

    public static void createAdd(int x, int y){
        Calculations adding = new Add(bufferG,70,40,50, x, y);
        timer.addActionListener(adding);
        new Thread(adding).start();

    }

    public static void createMultiplication(int x, int y){
        Calculations multiplications = new Multiplication(bufferG,100,40,50,x ,y);
        timer.addActionListener(multiplications);
        new Thread(multiplications).start();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        addFig(e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
