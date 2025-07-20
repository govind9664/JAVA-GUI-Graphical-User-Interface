import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorPickerDemo implements ActionListener {

    JFrame frame;
    JButton button;
    JLabel label;

    ColorPickerDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Pick Color");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel();
        label.setText("Hello World ! You are learning Java GUI Programming");
        label.setForeground(Color.black);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        label.setBackground(Color.white);
        label.setOpaque(true);

        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPickerDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
            // label.setForeground(color);

            label.setBackground(color);
        }
    }
}
