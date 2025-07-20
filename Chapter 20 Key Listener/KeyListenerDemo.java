import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyListenerDemo implements KeyListener {

    JFrame frame;
    JLabel label;
    ImageIcon imageIcon;

    KeyListenerDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        frame.getContentPane().setBackground(Color.BLACK);

        imageIcon = new ImageIcon("rocketIcon.png");
        label.setIcon(imageIcon);

        frame.addKeyListener(this);

        frame.add(label);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar , char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;

            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;

            case 'd':
                label.setLocation(label.getX() + 10, label.getY());

                break;

            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down . Uses KeyCode , int
        // output
        switch (e.getKeyCode()) {
            case 37: // Left Arrow
                label.setLocation(label.getX() - 10, label.getY());
                break;

            case 38: // Up Arrow
                label.setLocation(label.getX(), label.getY() - 10);
                break;

            case 39: // Right Arrow
                label.setLocation(label.getX() + 10, label.getY());
                break;

            case 40: // Down Arrow
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = Invoked when a physical key is released.
        System.out.println("You released key char : " + e.getKeyChar());
        System.out.println("Your released key code : " + e.getKeyCode());
    }
}