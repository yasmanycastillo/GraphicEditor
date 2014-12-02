
import java.awt.Graphics2D;

/**
 *
 * @author
 */
public class Pen extends PaintingTool {

    @Override
    public void Paint(int oldX, int oldY, int xCoord, int yCoord, Graphics2D g) {
        g.drawLine(oldX, oldY, xCoord, yCoord);
    }
}
