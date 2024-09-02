import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JLabel l1  =  new JLabel("Name");
    JTextField t1 =  new JTextField(30);
        JButton b1  = new JButton("Submit");
    public Main(){
        setTitle("Sign in page");
       setSize(500 , 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pane  =  getContentPane();pane.setLayout(new FlowLayout());
        pane.add(l1);
        pane.add(t1);
        pane.add(b1) ;
        setVisible(true);


    }
    public static void main(String[] args) {


        Main main = new Main();
    }
}


