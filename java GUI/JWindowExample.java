import  javax.swing.*;
public class JWindowExample {
    public static void main(String[] args) {
        JWindow window = new JWindow();
        JLabel label = new JLabel("JWindow Example", SwingConstants.CENTER);
        window.getContentPane().add(label);
        window.setSize(300, 200);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
