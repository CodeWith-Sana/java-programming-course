import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class LayoutMangers extends JFrame{
  LayoutMangers(){
      setTitle("LayoutMangers");
      setSize(900,500);
      setVisible(true);

//      setLayout(new FlowLayout(FlowLayout.LEFT,100,200));
//      setLayout(new BorderLayout());
//      setLayout(new GridLayout(2,3));




      setDefaultCloseOperation(EXIT_ON_CLOSE);

  }


    public static void main(String[] args) {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
//        setbackground colors
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.BLUE);
        p4.setBackground(Color.GREEN);
        p5.setBackground(Color.CYAN);
//set size
//        p1.setPreferredSize(new Dimension(200, 500));
//        p3.setPreferredSize(new Dimension(200, 500));
//        p4.setPreferredSize(new Dimension(200, 100));
//        p5.setPreferredSize(new Dimension(200, 100));

      LayoutMangers frame = new LayoutMangers();
      p6.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
//        BorderLayout
//        frame.add(p1, BorderLayout.EAST);
//        frame.add(p2, BorderLayout.CENTER);
//        frame.add(p3,BorderLayout.WEST);
//        frame.add(p4, BorderLayout.NORTH);
//        frame.add(p5, BorderLayout.SOUTH);
//        BoxLayout
      p6.setLayout(new BoxLayout(p6,BoxLayout.X_AXIS));
        p6.add(p1);
        p6.add(p2);
        p6.add(p3);
        p6.add(p4);
        p6.add(p5);
        frame.add(p6);







    }



}
