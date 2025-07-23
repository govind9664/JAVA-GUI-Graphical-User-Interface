import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;

public class KeyBindingDemo {
    JFrame frame;
    JLabel label;
    Action upAction;
    Action leftAction;
    Action downAction;
    Action rightAction;

    KeyBindingDemo() {
        frame = new JFrame("Key Binding Demo");
        label = new JLabel();
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // absolute layout

        label = new JLabel();
        label.setBackground(Color.red);
        label.setOpaque(true); // display background
        label.setBounds(100, 100, 100, 100);

        upAction = new UpAction();
        leftAction = new LeftAction();
        downAction = new DownAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        frame.add(label);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class LeftAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class DownAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class RightAction extends AbstractAction {
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

    public static void main(String[] args) {
        new KeyBindingDemo();
    }
}
