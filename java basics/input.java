public class input
{
public static void main(String[] args)
{
char c;
System.out.println("Enter a character");
c = (char)System.in.read();
System.in.read();
System.out.println("You entered " + c);
}
}