import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class label {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text ,an image ,or both
        ImageIcon image = new ImageIcon("babyBoy.png");
        Border border = BorderFactory.createLineBorder(Color.green, 2);
        JLabel label = new JLabel(); // Create a label
        label.setText("Bro , You want to Learn Java GUI"); // Set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // Set text LEFT , CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // Set text TOP , CENTER, BOTTOM of image icon
        label.setForeground(new Color(0X00FF00)); // Set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // Set font of text
        label.setIconTextGap(-20); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // Display background here
        label.setBorder(border); // Set border of label (no image+text)
        label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);// Set horizontal position of icon+text within label
        // label.setBounds(100, 100, 250, 250); // Set x, y position within frame as
        // well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
