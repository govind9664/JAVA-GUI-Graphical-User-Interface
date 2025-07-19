import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {

        // JOptionPane = A dialog box that displays a message or a question to the user

        // JOptionPane.showMessageDialog = Show a message dialog box

        // JOptionPane.showMessageDialog(null, "This is some usefull message for you",
        // "Title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Here is some usefull message for you",
        // "Title",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "You Know that", "Title",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Your computer is infected by VIRUS!!",
        // "Title",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!",
        // "Title",
        // JOptionPane.ERROR_MESSAGE);

        // int answer;
        // answer = JOptionPane.showConfirmDialog(null, "Bro , You want to Learn Java
        // GUI Programming",
        // "Confirm Dialog Box",
        // JOptionPane.YES_NO_CANCEL_OPTION);

        // System.out.println(answer);

        // JOptionPane.showInputDialog("What is your name ?");
        String[] response = { "Pro Coder", "Begginer Coder", "Not Coder" };
        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(null, "Bro , You are a pro Coder!", "Option Dialog Box",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, response, 0);
    }
}
