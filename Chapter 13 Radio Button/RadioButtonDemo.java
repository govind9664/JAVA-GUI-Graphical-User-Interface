import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo implements ActionListener {

    JFrame frame;
    JRadioButton javaButton;
    JRadioButton pythonButton;
    JRadioButton javascriptButton;

    ImageIcon javaIcon;
    ImageIcon pythonIcon;
    ImageIcon javaScriptIcon;

    RadioButtonDemo() {

        // JRadioButton = A radio button is a button that allows the user to select one
        // of a group of options.
        frame = new JFrame("Radio Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        javaIcon = new ImageIcon("javaIcon.png");
        pythonIcon = new ImageIcon("pythonIcon.png");
        javaScriptIcon = new ImageIcon("javascriptIcon.png");

        javaButton = new JRadioButton("Java");
        pythonButton = new JRadioButton("Python");
        javascriptButton = new JRadioButton("JavaScript");

        javaButton.addActionListener(this);
        pythonButton.addActionListener(this);
        javascriptButton.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(javaButton);
        group.add(pythonButton);
        group.add(javascriptButton);

        javaButton.setIcon(javaIcon);
        pythonButton.setIcon(pythonIcon);
        javascriptButton.setIcon(javaScriptIcon);

        frame.add(javaButton);
        frame.add(pythonButton);
        frame.add(javascriptButton);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == javaButton) {
            System.out.println("Java is selected");
        } else if (e.getSource() == pythonButton) {
            System.out.println("Python is selected");
        } else if (e.getSource() == javascriptButton) {
            System.out.println("JavaScript is selected");
        }
    }
}
