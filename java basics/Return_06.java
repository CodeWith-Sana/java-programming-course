package LABWORK;
import javax.swing.*;

public class Return_06 {
    public static void main(String args[])
    {
//        String s;
//        s= JOptionPane.showInputDialog("enter name");
//        JOptionPane.showMessageDialog(null,"your name is " + s);
        boolean t = true;
        System.out.println("Before the return.");

        if (t)
            return;

        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");
    }
}

