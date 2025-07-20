import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.*;

public class MouseListenerDemo implements MouseListener {
    JFrame frame;
    JLabel label;

    ImageIcon smile;
    ImageIcon pain;
    ImageIcon nervous;
    ImageIcon dizzy;

    MouseListenerDemo() {

        frame = new JFrame("MouseListener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        smile = new ImageIcon("smileIcon.png");
        pain = new ImageIcon("painIcon.png");
        nervous = new ImageIcon("nervousIcon.png");
        dizzy = new ImageIcon("dizzyIcon.png");

        label = new JLabel();
        label.setIcon(smile);
        frame.addMouseListener(this);

        frame.add(label);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MouseListenerDemo();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoke when a mouse button has been clicked (Pressed and released ) on a
        // component
        System.out.println("You clicked the mouse");
        // label.setIcon(pain);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoke when a mouse button has been pressed on a component
        System.out.println("You pressed the mouse");
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoke when a mouse button has been released on a component
        System.out.println("You release the mouse");
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        System.out.println("You entered the component");
        label.setIcon(smile);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoke when the mouse exits a component
        System.out.println("You exited the components");
        label.setIcon(nervous);
    }
}
