import  javax.swing.*;
import java.awt.*;
public class intermediateContainer extends JFrame {
        intermediateContainer(){
            setSize(300,300);
            setTitle("inermediate container");
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
    public static void main(String[] args) {
        intermediateContainer obj = new intermediateContainer();
        JButton b1= new JButton("Button 1");
        JButton b2= new JButton("Button 2");
        JButton b3= new JButton("Button 3");

        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.setLayout(new FlowLayout());
        obj.add(panel);


    }

}
