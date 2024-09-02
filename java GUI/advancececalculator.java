import java.awt.*;
import javax.swing.*;

class CalculatordFunc extends JFrame{
    private JTextField t1;
     CalculatordFunc() {
        super("Calculator");
        setSize(300, 400);
            setLayout( new BorderLayout());
        t1= new JTextField(20);
        t1.setEditable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        String [] buttons={
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        JPanel p = new JPanel();
         p.setLayout(new GridLayout(4, 4));
         for (String text : buttons) {
             JButton button = new JButton(text);
             p.add(button);
         }
         JPanel p2 = new JPanel();
         p2.setLayout(new FlowLayout());
         p2.add(t1);
         add(t1 , BorderLayout.NORTH);
         add(p , BorderLayout.CENTER);
     }
}




public class advancececalculator {
    public static void main(String[] args) {
        CalculatordFunc obj =  new CalculatordFunc();
    }
}
