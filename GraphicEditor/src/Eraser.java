
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author
 */
public class Eraser extends PaintingTool{

    @Override
    public void Paint(int oldX, int oldY, int x, int y, Graphics2D g) {
       // g.setColor(g.getBackground());
    	g.setColor(Color.black);
        g.fillRect(x, y, stroke*5, stroke*5);
    }    
}