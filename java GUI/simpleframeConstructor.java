import javax.swing.*;
import java.awt.*;

//creating JFRame using constructor
public class simpleframeConstructor  extends JFrame{

    simpleframeConstructor(){

        setTitle("JFRAme using COnstructor");
        setSize(400 , 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       JButton b1 =  new JButton("Button1");
       setLayout(new FlowLayout());
       add(b1);
        setVisible(true);
    }

    public static void main(String[] args) {

        simpleframeConstructor s =  new simpleframeConstructor();
    }
}
