import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);
        ImageIcon var1 = new ImageIcon("doctor.png");
        this.setIconImage(var1.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }

    public static void main(String[] var0) {
    }
}
