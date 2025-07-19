import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    JFrame frame = new JFrame("New Window");
    JLabel label = new JLabel("Hello Welcome to JAVA GUI Programming");

    NewWindow() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.BOLD, 20));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NewWindow();
    }
}
