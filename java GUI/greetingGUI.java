import  java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

import static java.lang.System.exit;

class UserGUI extends JFrame implements ActionListener {
    private JTextField t;
    private JButton b;
    private JLabel l ;
    UserGUI(){
        setTitle("Greeting message simple GUI!");
        setSize(200, 300);
        setLocation(10,20);
        setLayout(new FlowLayout());
        JPanel p =  new JPanel();
        t = new JTextField(20);
        t.setEditable(true);
        l =  new JLabel("");
        l.setBackground(Color.CYAN);
        l.setSize(20, 10);
        b = new JButton("Submit");
        p.setLayout(new FlowLayout());
        p.add(t);
        p.add(b);
        p.add(l);


        add(p);

        b.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
//         JOptionPane.showMessageDialog(null , "Welcome to our website !" + t.getText() );
//         exit(0);
        //another waye using label;
//
          l.setText("Welcome to our website! " + t.getText());



    }
}




public class greetingGUI {
    public static void main(String[] args) {
        UserGUI u =  new UserGUI();
    }
}
