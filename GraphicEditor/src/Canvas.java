
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 *
 * @author
 */
public class Canvas extends JPanel implements MouseListener, MouseMotionListener {

    int xCoord, yCoord, oldXCoord, oldYCoord;
    int StrokeSize = 10;
    PaintingTool[] tools = new PaintingTool[2];

    Canvas() {
        addMouseMotionListener(this);
        addMouseListener(this);
        tools[0] = new Pen();
        tools[1] = new Eraser();
    }

    @Override
    public void paintComponent(Graphics g) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        drawPoint(e.getX(), e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        oldXCoord = e.getX();
        oldYCoord = e.getY();
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

    public void drawPoint(int x, int y) {
        xCoord = x;
        yCoord = y;
        Graphics2D g = (Graphics2D) getGraphics();
        tools[0].Paint(oldXCoord, oldYCoord, xCoord, yCoord, g);
        oldXCoord = xCoord;
        oldYCoord = yCoord;
    }
}
