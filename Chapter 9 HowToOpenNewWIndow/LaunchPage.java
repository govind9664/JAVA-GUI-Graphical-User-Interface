import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame("LaunchPage");
    JButton myButton = new JButton("New Window");

    LaunchPage() {
        myButton.setBounds(100, 150, 200, 50);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }

    public static void main(String[] args) {
        new LaunchPage();
    }
}
