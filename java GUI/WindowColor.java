import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class ColorChange extends   JFrame  implements ActionListener{
    private JButton b1 , b2 , b3 , b4;
    private JLabel l ;
    JPanel p , p2;
    ColorChange(){

        setTitle("Background Color  Changer");
        setSize(400 ,500);
        b1 =  new JButton("Red");
        setLayout(new FlowLayout());
        b2 = new JButton("pink");
        b3 =  new JButton("black");
        b4  = new JButton("Cyan");
        l= new JLabel("By clicking below button , the background color will change");

        add(l);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
//        p2= new JPanel();
//        p2.setLayout(new FlowLayout());
//        p2.add(l );
//        p =  new JPanel();
//        p.setLayout(new FlowLayout());
//        p.add(b1);
//        p.add(b2);p.add(b3);p.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
//        add(p2 ,BorderLayout.NORTH );
//        add(p , BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
//        Color color = Color.WHITE; // Default color for both panels
//
//        if (e.getSource() == b1) {
//            color = Color.RED;
//        } else if (e.getSource() == b2) {
//            color = Color.PINK;
//        } else if (e.getSource() == b3) {
//            color = Color.BLACK;
//        } else if (e.getSource() == b4) {
//            color = Color.CYAN;
//        }
//        // Set the background color for the frame's content pane and the panels
//        getContentPane().setBackground(color);
//        p.setBackground(color);
//        p2.setBackground(color);
//    }
        if(e.getSource()==b1){
            getContentPane().setBackground(Color.RED);
        }
        if(e.getSource()==b2){
            getContentPane().setBackground(Color.PINK);
        }
        if(e.getSource()==b3){
            getContentPane().setBackground(Color.BLACK);
        }
        if(e.getSource()==b4){
            getContentPane().setBackground(Color.CYAN);
        }
    }
}


public class WindowColor {
    public static void main(String[] args) {
        ColorChange c =  new ColorChange();

    }
}
