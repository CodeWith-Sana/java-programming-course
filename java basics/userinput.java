// import java.util.*;
// public class userinput {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//         int a = s.nextInt();
//           // to read string input from user, we use nextLine() method instead of nextInt() or nextDouble()
//         String name = s.nextLine();
//         s.close();
//         System.out.println("Your name is: " + name);
//         System.out.println("Your age is: " + a);
        

//     }
// }
import javax.swing.*;
public class userinput
{
public static void main(String[] args)
{
String s;
s = JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null, "Your name is" + s);
String age = JOptionPane.showInputDialog("Your age is");
int a =  Integer.parseInt(age);
JOptionPane.showMessageDialog(null ,"your age is" + a);
System.exit(0);
}
}
