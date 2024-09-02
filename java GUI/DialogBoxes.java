import javax.swing.*;
public class DialogBoxes {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"Hi there");
//        JOptionPane.showConfirmDialog(null,"Are youb sure ?");
//        JOptionPane.showInputDialog(null,"Enter any number");
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value ;of a: = "));
        int b;
        b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the value of B:"));
        int c = a + b;
        JOptionPane.showMessageDialog(null,"The sum of a and b  is: "+c);
        JOptionPane.showConfirmDialog(null , "Do you want to continue.");

    }


}
