
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author
 */
public class GraphicEditor extends JFrame {

    public GraphicEditor() {
        this.setBackground(Color.white);
        this.setLayout(new BorderLayout());
        add(new Canvas(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GraphicEditor window = new GraphicEditor();
        window.setTitle("Paint app");
        window.setSize(900, 400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
