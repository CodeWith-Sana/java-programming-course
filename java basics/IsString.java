import javax.swing.text.Style;

public  class IsString {
    public static void main(String[] args){
        String  name = "Sana is a good girl";
        System.out.println(name.length());
        System.out.println(name.charAt(10));
        System.out.println(name.substring(10,14));
        System.out.println(name.indexOf('g'));
        System.out.println(name.lastIndexOf('g'));
        System.out.println(name.startsWith("Sana"));
        System.out.println(name.endsWith("irl"));
        System.out.println(name.replace("Sana", "Malaika"));
    }
}
