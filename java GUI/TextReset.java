import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Reset extends JFrame implements ActionListener {
    private JButton b1;
    private JTextField t;

    Reset() {
        setTitle("Text Reset GUI");
        setSize(300, 150); // Adjusted size for better display
        setLocation(100, 100); // Adjusted position for visibility
        setLayout(new FlowLayout());

        b1 = new JButton("Reset");
        t = new JTextField(20); // Adjusted width for better fit

        b1.addActionListener(this);

        add(t);
        add(b1);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t.setText("");
        }
    }

    public static void main(String[] args) {
        Reset r  =  new Reset();
    }
}
