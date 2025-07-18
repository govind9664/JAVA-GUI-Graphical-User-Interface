import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class java_GUI {
    public static void main(String[] args) {

        // JFrame = a GUI window to add component to

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("JFrame title goes here"); // Set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of
        // application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420); // set the x-dimension , and y-dimension of frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("doctor.png"); // create an ImageIcon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(Color.green); // Change color of
        // background
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // Second way
        // to change the background color

        // new MyFrame();
    }
}