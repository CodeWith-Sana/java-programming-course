import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

import static java.lang.System.exit;

class MenuFunc extends JFrame implements ActionListener {
 JMenuItem p1 , p2 , p3;


    MenuFunc(){
        setTitle("Menu Bar GUI");
        setSize(300, 400);
        setLayout(new FlowLayout());
        JMenuBar menu =  new JMenuBar();
        JMenu home =  new JMenu("Home");
        JMenu   product =  new JMenu("Products");
        JMenu about =  new JMenu("About US");
        JMenu contact =  new JMenu("Contact Us");
        getContentPane().setBackground( Color.cyan );
        p1 =  new JMenuItem("open file");
         p2 =  new JMenuItem("close file");
        p3 =  new JMenuItem("search file");
        p1.addActionListener(this);
        p2.addActionListener(this);
        p3.addActionListener(this);
        product.add(p1);
        product.add(p2);
        product.add(p3);
        menu.add(home);
        menu.add(product);
        menu.add(about);
        menu.add(contact);
        add(menu);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==p1) {
            System.out.println("open is clicked");
            JDialog dialog = new JDialog();
            dialog.setSize(200 , 200);
            dialog.setTitle("open window is clicked");
            dialog.setVisible(true);
            dialog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
       else
           if(e.getSource()==p2){
               System.out.println("close is clicked");
                exit(0);
           }
           else if(e.getSource()==p3) {
               Object source = e.getSource();
               if (source instanceof JButton) {
                   JButton button = (JButton) source;
                   System.out.println("Button " + button.getText() + " was clicked.");
               }
           }


    }
}



public class MenuFrame {
    public static void main(String[] args) {
        MenuFunc m =  new MenuFunc();
    }
}
