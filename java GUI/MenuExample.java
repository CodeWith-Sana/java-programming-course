import javax.swing.*;
import java.awt.event.*;

public class MenuExample extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openItem, saveItem, exitItem;

    public MenuExample() {
        // Create a menu bar
        menuBar = new JMenuBar();

        // Create a menu
        fileMenu = new JMenu("File");

        // Create menu items
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Add action listeners
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Add menu items to the menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // Add the menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        // Set frame properties
        setTitle("Menu Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Open":
                System.out.println("Open selected");
                break;
            case "Save":
                System.out.println("Save selected");
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
