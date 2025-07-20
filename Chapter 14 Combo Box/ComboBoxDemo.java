import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxDemo implements ActionListener {

    // JComboBox = a drop-down list of items
    JFrame frame;
    JComboBox<String> comboBox;

    ComboBoxDemo() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        String[] animals = { "Dog", "Cat", "Mouse", "Elephant" };

        comboBox = new JComboBox<String>(animals);
        comboBox.setFocusable(true);
        comboBox.addActionListener(this);

        comboBox.setSelectedItem("Cat");
        // comboBox.setEditable(true);
        // comboBox.addItem("Monkey");
        // comboBox.insertItemAt("Monkey", 0); // insert at index(0);
        // comboBox.removeItemAt(0);
        // comboBox.removeItem("Mouse");

        frame.add(comboBox);
        frame.pack(); // Resize the frame to fit the components
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
