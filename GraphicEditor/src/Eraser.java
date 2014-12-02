import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author
 */
public class Eraser extends PaintingTool {

    @Override
    public void Paint(int oldXCoord, int oldYCoord, int xCoord, int yCoord, Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(xCoord, yCoord, stroke * 5, stroke * 5);
    }
}
