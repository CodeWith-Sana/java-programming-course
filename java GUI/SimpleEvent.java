import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class SimpleEvent extends  JFrame implements ActionListener{
    SimpleEvent(){
        super("Simple button event");
        setSize(300, 400);

        JButton b1 =  new JButton("Click me");
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        add(b1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

   public void actionPerformed(ActionEvent e ){
          JOptionPane.showMessageDialog(null , "button is clicked");
    }

    public static void main(String[] args) {
        SimpleEvent s = new SimpleEvent();
    }
}
