import javax.swing.*;

public class JDialogExample {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Parent Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
        JDialog dialog = new JDialog(frame, "This is a dialog box", true);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(dialog.EXIT_ON_CLOSE);
    }
}
