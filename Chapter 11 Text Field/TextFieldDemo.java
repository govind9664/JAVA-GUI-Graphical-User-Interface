import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo implements ActionListener {

    JFrame frame = new JFrame("TextField Demo");
    JButton button = new JButton();
    JTextField textField = new JTextField();

    TextFieldDemo() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");

        frame.add(textField);
        frame.add(button);

        frame.pack(); // Resize the frame to fit the components
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            // textField.setEditable(false);
            System.out.println(textField.getText());
        }
    }
}
