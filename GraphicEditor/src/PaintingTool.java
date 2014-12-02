
import java.awt.Graphics2D;

/**
 * @author
 */
public abstract class PaintingTool {

    int stroke;

    public PaintingTool() {
        stroke = 2;
    }

    public PaintingTool(int stroke) {
        this.stroke = stroke;
    }

    public abstract void Paint(int oldXCoord, int oldYCoord, int xCoord, int yCoord, Graphics2D g);

    public void setStrokeSize(int size) {
        stroke = size;
    }
}
