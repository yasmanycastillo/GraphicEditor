
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

    public abstract void Paint(int oldX, int oldY, int x, int y, Graphics2D g);
    
    public void setStrokeSize(int size){
        stroke = size;
    }
}
