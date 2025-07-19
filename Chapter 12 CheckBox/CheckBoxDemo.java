import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxDemo implements ActionListener {
    public static JFrame frame;
    public static JCheckBox checkBox;
    public static JButton button;
    public static ImageIcon icon1;
    public static ImageIcon icon2;

    public static void main(String[] args) {
        // JCheckBox = a button that can be checked or unchecked to toggle a state

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        icon1 = new ImageIcon("CheckRight.png");
        icon2 = new ImageIcon("CheckWrong.png");

        checkBox = new JCheckBox();
        checkBox.setText("I 'am not a Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Comic Sans", Font.BOLD, 25));
        checkBox.setIcon(icon1);
        checkBox.setSelectedIcon(icon2);

        button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.addActionListener(new CheckBoxDemo());

        frame.add(button);
        frame.add(checkBox);
        frame.pack(); // Resize the frame to fit the components
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (checkBox.isSelected()) {
                System.out.println("You are not a robot");
            } else {
                System.out.println("You are a robot");
            }
        }
    }
}
