package DrawComponents;

import math.Vector2;
import math.Rectangle;
import model.World;
import timers.AbstractWorldTimer;
import timers.UpdateWorldTimer;
import utils.ScreenConverter;
import utils.ScreenPoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class DrawPanel extends JPanel implements ActionListener,
        MouseListener, MouseMotionListener, MouseWheelListener {

    private ScreenConverter sc;
    private World w;
    private AbstractWorldTimer uwt;
    private Timer drawTimer;

    public DrawPanel() {
        w = new World();
        sc = new ScreenConverter(new Rectangle(0, 10, 10, 10), 800, 600);


        this.addMouseListener(this);
        (uwt = new UpdateWorldTimer(w, 10)).start();
        drawTimer = new Timer(140, this);
        drawTimer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        w.draw((Graphics2D)bi.getGraphics(), sc);

        Graphics gi = bi.getGraphics();
        gi.setColor(Color.WHITE);
        g.drawImage(bi, 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        if (e.getX() <= w.getFire().getX1() + 30 && e.getX() >= w.getFire().getX1() - 30 && e.getY() <= w.getFire().getY1() + 20 && e.getY() >= w.getFire().getY3() - 10) {
//            w.getFire().setActivate(!w.getFire().isActivate());
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        w.getExternalForce().setPosition(new Vector2(e.getX(), e.getY()));
//        int direction = 0;
//        if (e.getButton() == MouseEvent.BUTTON1)
//            direction = 1;
//        else if (e.getButton() == MouseEvent.BUTTON3)
//            direction = -1;
//        w.getExternalForce().setValue(10*direction);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        w.getExternalForce().setValue(0);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
//        w.getExternalForce().setPosition(sc.s2r(new ScreenPoint(e.getX(), e.getY())));
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        w.getExternalForce().setPosition(sc.s2r(new ScreenPoint(e.getX(), e.getY())));
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

    }
}

