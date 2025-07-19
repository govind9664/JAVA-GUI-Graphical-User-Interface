import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayoutDemo {
    public static void main(String[] args) {

        // Layout Manager = Defines the natural layout of components within a container

        // 3 common managers = FlowLayout , BorderLayout , GridBagLayout

        // GridLayout = A GridLayout is a layout manager that places components in a
        // grid of rows and columns. Each component takes all the available space within
        // its cell. And each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        frame.setLayout(new GridLayout(3, 3, 10, 10));

        for (int i = 1; i < 10; i++) {
            frame.add(new JButton("" + i));
        }
        frame.setVisible(true);
    }
}
