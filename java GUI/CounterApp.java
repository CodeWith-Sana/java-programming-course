import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CounterApp extends  JFrame implements ActionListener {
    private JButton b1 ;
    private JButton b2;
    private int a  = 0;
    private JLabel l1;
    CounterApp(){
        setTitle("Counter App");
        setSize(400 ,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pane  =new JPanel();
        setLayout(new BorderLayout());
         l1 =new JLabel(String.valueOf(a));
         b1 = new JButton("Increment");
        b2  =  new JButton("Decrement");
        b1.addActionListener(this);
        b2.addActionListener(this);
        pane.add(l1 );
        JPanel pane1 = new JPanel();
        pane1.setLayout(new FlowLayout());
        pane1.add(b1 );
        pane1.add(b2);
        add(pane ,BorderLayout.NORTH);
        add(pane1, BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== b1){
            a++;
//            System.out.println(a);
            l1.setText(String.valueOf(a));
        }
        if(e.getSource()== b2){
            if(a>0){
                a--;
                l1.setText(String.valueOf(a));

            }

        }
    }

    public static void main(String[] args) {
        CounterApp c  =  new CounterApp();
    }
}
