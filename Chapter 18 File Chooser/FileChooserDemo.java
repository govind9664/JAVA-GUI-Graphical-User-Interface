import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class FileChooserDemo implements ActionListener {

    // JFileChooser = A component that allows the user to choose a file or a folder
    JFrame frame;
    JButton button;

    FileChooserDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Select File");
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FileChooserDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser(); // Create a JFileChooser object
            // int response = fileChooser.showOpenDialog(null); // select a file to open
            int response = fileChooser.showSaveDialog(null); // select file to save

            if (response == JFileChooser.APPROVE_OPTION) { // If the user selected a file
                File file = fileChooser.getSelectedFile(); // Get the selected file
                System.out.println(file.getPath()); // Print the file path
            }
        }
    }
}
