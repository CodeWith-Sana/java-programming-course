import javax.swing.*;
import java.awt.*;



public class LayoutManagers extends JFrame {
    LayoutManagers(){
        setTitle("layout manager");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
     LayoutManagers frame = new LayoutManagers();
     frame.setLayout(new GridLayout(2,3));
        JPanel p1 = new JPanel();
        p1.setBackground(Color.black);
//        p1.setPreferredSize(new Dimension(200,500));
        JPanel p2 = new JPanel();
//        p2.setPreferredSize(new Dimension(200,500));

        p2.setBackground(Color.RED);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.cyan);
//        p3.setPreferredSize(new Dimension(200,100));

        JPanel p4 = new JPanel();
        p4.setBackground(Color.blue);
//        p4.setPreferredSize(new Dimension(200,100));

        JPanel p5 = new JPanel();
        p5.setBackground(Color.DARK_GRAY);
//        p5.setPreferredSize(new Dimension(200,100));

//        frame.add(p1,BorderLayout.EAST);
//        frame.add(p2,BorderLayout.CENTER);
//        frame.add(p3,BorderLayout.WEST);
//        frame.add(p4,BorderLayout.NORTH);
//        frame.add(p5, BorderLayout.SOUTH);
        frame.add(p1);

        frame.add(p3);
        frame.add(p4);
        frame.add(p2);
        frame.add(p5);
    }


}
