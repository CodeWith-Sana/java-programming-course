public class JFrame extends javax.swing.JFrame {
     JFrame(){
         super("Frame through constructor");
//         setTitle("Frame through constructor");

         setSize(500,300);

         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setVisible(true);

     }


    public static void main(String[] args) {
//
//        JFrame fr = new JFrame("Frame created through PSVM");
//        fr.setSize(300,300);
//        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
//        fr.setVisible(true);
        JFrame frame = new JFrame();




    }


}
