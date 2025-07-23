import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class AnimationPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    int x = 0;
    int y = 0;
    int xVelocity = 2;
    int yVelocity = 1;

    AnimationPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("backgroundImage.png").getImage();

        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, null);
        g2d.drawImage(enemy, x, y, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }

        x += xVelocity;

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }

        y += yVelocity;

        repaint();
    }
}

class MyFrame extends JFrame {
    MyFrame(JPanel panel) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setSize(500, 500);
        this.setVisible(true);
    }
}

public class AnimationDemo {
    public static void main(String[] args) {
        JPanel animationPanel = new AnimationPanel();
        new MyFrame(animationPanel);
    }
}
