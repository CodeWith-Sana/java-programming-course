import javax.swing.*;
import java.awt.*;


public class Checkboxexample extends JFrame{
    Checkboxexample(){
        setTitle("CHeckbox and radio example");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JPanel pane1 =  new JPanel();
        JLabel l1 = new JLabel("CheckBox");
        JLabel l2= new JLabel("Hobbies");
        JCheckBox cb =  new JCheckBox("reading", false);
        JCheckBox cb2 =  new JCheckBox("writing" , false);
        JCheckBox cb3 =  new JCheckBox("painting" );
        JPanel pane2  = new JPanel();
        pane2.add(l1 );
        add(pane2);
        pane1.add(l2 );
        pane1.add(cb );
        pane1.add(cb2 );
        pane1.add(cb3);
        add(pane1);
        JLabel l3  =  new JLabel("Radio Buttons");
        JLabel l4  =  new JLabel("Religion");
        JRadioButton rb =  new JRadioButton( "Muslim");
        JRadioButton r2 =  new JRadioButton("Non-Muslim");
        JPanel pane3 = new JPanel();
        pane3.add(l3);
        pane3.add(l4);
        pane3.add(rb);
        pane3.add(r2);
        add(pane3);



    }

    public static void main(String[] args) {
        Checkboxexample obj =  new Checkboxexample();
    }
}
