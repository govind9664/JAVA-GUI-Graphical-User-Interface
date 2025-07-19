import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class layeredPaneDemo {
    public static void main(String[] args) {

        // JLayeredPane = Swing container that allows components to be layered on top of
        // each other. Swing containter that provides a third dimension for positioning
        // components ex: z-index, depth, or priority

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(100, 100, 100, 100);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(150, 150, 100, 100);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(200, 200, 100, 100);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);

        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        // layeredPane.add(label1, Integer.valueOf(0));
        // layeredPane.add(label2, Integer.valueOf(2));
        // layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame("JLayerPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
