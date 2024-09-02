import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Calculator extends JFrame implements ActionListener, KeyListener{
//   private JLabel l1;
    private int num1, num2 , result;
    private char op;
   private JTextField t1;
    private JButton numberButtons[];
  private JButton bp ;
    private JButton bm ;
    private JButton bml ;
    private JButton bd ;
    private JButton bc ;
    private JButton be ;
    Calculator(){
        super("CALCULATOR APP");
        setSize(300 , 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        t1 = new JTextField(20);
        t1.setEditable(false);
//
        numberButtons = new JButton[10];
        for(int i  =0 ; i<10 ; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setBackground(Color.lightGray);
            numberButtons[i].addKeyListener(this);
        }
     bp=  new JButton("+");
     bm=  new JButton("-");
     bml=  new JButton("*");
     bd=  new JButton("/");
     bc=  new JButton("clear");
     bc.setBackground(Color.RED);
     be=  new JButton("=");
        t1.addKeyListener(this);
     be.setBackground(Color.CYAN);
        bp.addActionListener(this);
        bm.addActionListener(this);
        bml.addActionListener(this);
        bd.addActionListener(this);
        bc.addActionListener(this);
        be.addActionListener(this);
     setLayout(new BorderLayout());
     JPanel p1 =  new JPanel();
     p1.setLayout(new FlowLayout());

     p1.add(t1);
     JPanel p2 =  new JPanel();
     p2.setLayout(new GridLayout(4,4));
       for(int j = 0;j < 10;j++){
           p2.add(numberButtons[j]);
       }
        p2.add(bc);
        p2.add(be);
        p2.add(bp);
        p2.add(bm);
        p2.add(bml);
        p2.add(bd);
        add(p1,BorderLayout.NORTH);
        add(p2 , BorderLayout.CENTER);
        setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
    if (Character.isDigit(keyChar)) {
        t1.setText(t1.getText() + keyChar);
    } else if (keyChar == '+') {
        num1 = Integer.parseInt(t1.getText());
        op = '+';
        t1.setText("");
    } else if (keyChar == '-') {
        num1 = Integer.parseInt(t1.getText());
        op = '-';
        t1.setText("");
    } else if (keyChar == '*') {
        num1 = Integer.parseInt(t1.getText());
        op = '*';
        t1.setText("");
    } else if (keyChar == '/') {
        num1 = Integer.parseInt(t1.getText());
        op = '/';
        t1.setText("");
    } else if (keyChar == '=' || keyChar == KeyEvent.VK_ENTER) {
        num2 = Integer.parseInt(t1.getText());
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                result = num2;
        }
        t1.setText(String.valueOf(result));
    }
}


public void keyReleased(KeyEvent e) {
    // Optional: Handle key release events if needed
}


public void keyTyped(KeyEvent e) {
    // Optional: Handle key typed events if needed
}
   public  void actionPerformed(ActionEvent e){
        for(int i  = 0 ; i< 10 ; i++){
            if(e.getSource()==numberButtons[i]){
                t1.setText(t1.getText().concat(String.valueOf(i)));

            }}
            if(e.getSource()==bp){
                num1 = Integer.parseInt(t1.getText());
                op = '+';
                t1.setText("");
            }
       if(e.getSource()==bm){
           num1 = Integer.parseInt(t1.getText());
           op = '-';
           t1.setText("");
       }
       if(e.getSource()==bml){
           num1 = Integer.parseInt(t1.getText());
           op = '*';
           t1.setText("");
       }
       if(e.getSource()==bd){
           num1 = Integer.parseInt(t1.getText());
           op = '/';
           t1.setText("");
       }
       if(e.getSource()==be){
           num2 = Integer.parseInt(t1.getText());

          switch (op){
              case '+':
                  result =  num1+num2;
                  break;
              case '-':
              {
                 result= num1-num2;

              }
              break;
              case  '*':
              result =  num1*num2;
              break;
              case  '/':
              result =  num1/num2;
              break;
              default:
                  result = num2;
          }
          if(num1<num2){
              t1.setText("-"+ String.valueOf(result));
          }
          t1.setText(String.valueOf(result));
       }
       if(e.getSource()==bc){
           t1.setText("");
       }



}
    public static void main(String[] args) {
        Calculator cl  = new Calculator();
    }
}
