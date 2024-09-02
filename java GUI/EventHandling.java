import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EventHandling extends JFrame implements ActionListener, KeyListener{
    JButton b1 = new JButton("Click me");

    EventHandling(){
        setTitle("This is for event handling");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        b1.addActionListener(this);
        add(b1);
        addKeyListener(this);

    }
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("you pressed " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void actionPerformed(ActionEvent e){
//        System.out.println("Button is clicked");
    String command = e.getActionCommand();

        System.out.println("Action command" + command);


        JOptionPane.showMessageDialog(null,"You entered the button");
    }



    public static void main(String[] args) {
EventHandling frame = new EventHandling();
    }


}
