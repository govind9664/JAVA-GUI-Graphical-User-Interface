import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowLayoutDemo {
    public static void main(String[] args) {

        // Layout manager = Defines the natural layout of components within a container

        // 3 common managers = FlowLayout , BorderLayout , GridBagLayout

        // FlowLayout = A FlowLayout is a layout manager that places components in a row
        // or column. If the horizontal space in the container is too small , the flow
        // layout will wrap to the next row. If the vertical space in the container is
        // too small , the flow layout will wrap to the next column.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Set FlowLayout

        JPanel panel = new JPanel();
        panel.setPreferredSize(new java.awt.Dimension(150, 150));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        for (int i = 1; i <= 10; i++) {
            panel.add(new JButton("" + i));
        }

        frame.add(panel);

        frame.setVisible(true);

    }
}
