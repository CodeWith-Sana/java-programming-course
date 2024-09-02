import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Registration extends JFrame {
    JLabel l1 =  new JLabel("Registration form");
    JLabel l2  =  new JLabel("Name");
    JTextField t1 =  new JTextField(30);
    JTextField t2 =  new JTextField(5);
    JLabel l3 =  new JLabel("Roll_no");
    JButton b1  =  new JButton("Submit");
    public Registration(){
        super("Registration form");
        setSize(400 , 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JPanel p1 =  new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(l1);
        JPanel p2 =  new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(l2);
        p2.add(t1);
        JPanel p3 =  new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(l3);
        p3.add(t2);
        p3.add(b1);
        add(p1);
        add(p2);
        add(p3);
        setVisible(true);

    }
}
public class REgistration {
//     static JLabel l1 =  new JLabel("Registration form");
//    static JLabel l2  =  new JLabel("Name");
//    static JTextField t1 =  new JTextField(30);
//    static JLabel l3 =  new JLabel("Roll_no");
//    static JTextField t2 =  new JTextField(5);
//    static JButton b1  =  new JButton("Submit");
//     b1.addActionListener(this);

    public static void main(String[] args) {
        REgistration obj =  new REgistration();


    }
}
