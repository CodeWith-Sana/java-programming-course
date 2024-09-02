import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventExample extends JFrame implements KeyListener {
    Label label;

    public KeyEventExample() {
        label = new Label();
        label.setBounds(20, 50, 200, 20);
        add(label);
        addKeyListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // handle key released event
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // handle key typed event
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
