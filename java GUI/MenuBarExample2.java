import java.awt.*;
import javax.swing.*;


public class MenuBarExample2 extends JFrame{

        MenuBarExample2(){
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBackground(Color.CYAN);
            JMenu menu = new JMenu("File");
            JMenu menu1 = new JMenu("Edit");
            JMenuItem item1 = new JMenuItem("New");
            JMenuItem item2 = new JMenuItem("Open");
            JMenuItem item3 = new JMenuItem("Exit");
            menu.add(item1);
            menu.add(item2);
            menu.add(item3);
            menuBar.add(menu);
            menuBar.add(menu1);
            this.setJMenuBar(menuBar);
            setTitle("Menu Bar");
            setSize(500,500);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


        }


    public static void main(String[] args) {
//        System.out.println("Hello world");
        MenuBarExample2 frame = new MenuBarExample2();
    }
}
