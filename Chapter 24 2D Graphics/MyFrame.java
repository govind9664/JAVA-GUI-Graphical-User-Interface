import javax.swing.*;

public class MyFrame {
    JFrame frame;
    MyPanel panel;

    MyFrame() {
        frame = new JFrame("Graphics Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MyPanel();

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
