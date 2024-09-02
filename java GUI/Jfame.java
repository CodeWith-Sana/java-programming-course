import javax.swing.*;
import java.awt.*;

public class Jfame extends JFrame{
    JLabel label1 = new JLabel("label 1");
    JButton b1 = new JButton("button 1");
Jfame(){
    setTitle("Container through constructor");
    setSize(300,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    Container pane = getContentPane();
    pane.setLayout(new FlowLayout());
    pane.add(label1);
    pane.add(b1);
//    this.add(pane);

}


    public static void main(String[] args) {
//        System.out.println("");
//        JFrame frame = new JFrame();
//        frame.setTitle("sample ");
//        frame.setSize(300,300);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Jfame frame = new Jfame();
//        JDialog dialogbox = new JDialog(frame,"Modal",true);
//        dialogbox.setDefaultCloseOperation(EXIT_ON_CLOSE);
//    dialogbox.setSize(200,100);
//    dialogbox.setVisible(true);

//        JWindow window =new JWindow();
//        window.setSize(400,400);
//        window.setVisible(true);

//        Adding Components


}

}
