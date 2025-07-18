import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class button implements ActionListener {
    JButton button;
    JLabel label;

    public button() {
        button = new JButton();
        label = new JLabel(); // Initialize the label before using it
        ImageIcon icon = new ImageIcon("smile.png");
        label.setIcon(icon);
        label.setBounds(225, 250, 150, 150);
        label.setVisible(false);

        button.setBounds(200, 100, 150, 50);
        button.addActionListener(this);
        button.setText("click here");
        button.setFocusable(false);
        // button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-20);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
        frame.add(label);
    }

    public static void main(String[] args) {
        new button();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Smile please");
            // button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
