
import java.awt.Graphics2D;

/**
 *
 * @author 
 */
public class Pen extends PaintingTool{

    @Override
    public void Paint(int oldX, int oldY, int x, int y, Graphics2D g) {
     g.drawLine(oldX, oldY, x, y);
    }
}
