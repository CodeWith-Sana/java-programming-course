import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class AddingComponents extends JFrame {
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    AddingComponents(){
        super("Adding component to the Frame");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(b1);
        pane.add(b2);

//        setTitle("Adding components to the Frame");


    }
    public static void main(String[] args) {


    AddingComponents fr = new AddingComponents();




    }


}
