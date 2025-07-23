import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DragPanel extends JPanel {
    private final ImageIcon icon = new ImageIcon("smileIcon.png");
    private final int WIDTH = icon.getIconWidth();
    private final int HEIGHT = icon.getIconHeight();
    private Point imageCorner = new Point(0, 0);
    private Point prevPoint = new Point(0, 0);

    public DragPanel() {
        MouseAdapter mouseHandler = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                prevPoint = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Point currentPoint = e.getPoint();
                int dx = currentPoint.x - prevPoint.x;
                int dy = currentPoint.y - prevPoint.y;
                imageCorner.translate(dx, dy);
                prevPoint = currentPoint;
                repaint();
            }
        };

        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, imageCorner.x, imageCorner.y);
    }
}
