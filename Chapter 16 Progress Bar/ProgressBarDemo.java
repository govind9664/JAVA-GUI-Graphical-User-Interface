import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {

    // ProgressBar = A visual representation of the progress of a task
    JFrame frame;
    JProgressBar bar;

    ProgressBarDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        bar = new JProgressBar();
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setBackground(Color.WHITE);
        bar.setFont(new Font("MV Boli", Font.PLAIN, 25));
        bar.setForeground(Color.RED);
        // bar.setString("Loading...");
        frame.add(bar);
        frame.setVisible(true);

        fill();
    }

    public static void main(String[] args) {
        new ProgressBarDemo();
    }

    public void fill() {
        for (int i = 0; i <= 100; i++) {
            bar.setValue(i);

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        bar.setString("Done");
    }
}
