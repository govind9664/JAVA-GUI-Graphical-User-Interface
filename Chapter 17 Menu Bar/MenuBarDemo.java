import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuBarDemo implements ActionListener {

    // JMenBar = a bar at the top of the window that contains menu items
    JFrame frame;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu viewMenu;
    JMenu helpMenu;

    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon newIcon;
    ImageIcon openIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MenuBarDemo() {
        frame = new JFrame("Menu Bar Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        // JMenu = A menu in the menu bar
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        helpMenu = new JMenu("Help");

        // Adding menu items to menu
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        newIcon = new ImageIcon("newIcon.png");
        openIcon = new ImageIcon("openIcon.png");
        saveIcon = new ImageIcon("saveIcon.png");
        exitIcon = new ImageIcon("exitIcon.png");

        newItem.setIcon(newIcon);
        openItem.setIcon(openIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Adding shortcuts to menu
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for edit
        viewMenu.setMnemonic(KeyEvent.VK_V); // Alt + V for view
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for help

        // Adding Shortcuts to menu items
        newItem.setMnemonic(KeyEvent.VK_N); // N for new
        openItem.setMnemonic(KeyEvent.VK_O); // O for open
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        JMenuItem aboutItem = new JMenuItem("About");

        JMenuItem contactInfo = new JMenuItem("Contact Info");
        JMenuItem emailInfo = new JMenuItem("Emain Info");
        JMenuItem messageInfo = new JMenuItem("Message Info");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        viewMenu.add(aboutItem);

        helpMenu.add(contactInfo);
        helpMenu.add(emailInfo);
        helpMenu.add(messageInfo);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MenuBarDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            System.out.println("New is selected");
        } else if (e.getSource() == openItem) {
            System.out.println("Open is selected");
        } else if (e.getSource() == saveItem) {
            System.out.println("Save is selected");
        } else if (e.getSource() == exitItem) {
            System.out.println("Exit is selected");
            System.exit(0);
        }
    }
}
