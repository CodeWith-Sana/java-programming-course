import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class IntermediateContainers extends JFrame{


    IntermediateContainers(){
        super("Frame with Jpanel");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);



    }

    public static void main(String[] args) {
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JTextArea tA  =new JTextArea("Enter some text");
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(b1);
        panel1.add(b2);

        JPanel panel2 = new JPanel();
        for ( int i = 0; i<20; i++){
            JLabel label = new JLabel("This is a Label " + i);
            System.out.println(" ");
            panel2.add(label);
        }
        JScrollPane scrollp2 = new JScrollPane(panel2);

//        JSplitPane splitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
//        splitpane.setLeftComponent(panel1);
//        splitpane.setRightComponent(scrollp2);
        JTabbedPane tpane  =  new JTabbedPane();
        tpane.add(panel1);
        tpane.add(scrollp2);




        IntermediateContainers frame = new IntermediateContainers();
//        frame.add(splitpane);
        frame.add(tpane);

    }

}
