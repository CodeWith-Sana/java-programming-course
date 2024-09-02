import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class CardLayout extends JFrame {
    CardLayout(){
        setTitle("CardLayout");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }


    public static void main(String[] args) {

        CardLayout frame = new CardLayout();
        JPanel cardPanel  = new JPanel();
        cardPanel.setLayout(new java.awt.CardLayout());


        JPanel card1 = new JPanel();
        card1.setBackground(Color.black);
        card1.add(new JButton("Card 1 Button"));


        JPanel card2 = new JPanel();
        card2.setBackground(Color.RED);
        card2.add(new JButton("Card 2 Button"));

        cardPanel.add(card1);
        cardPanel.add(card2);


        frame.add(cardPanel);

        JButton switchButton = new JButton("Switch Card");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.awt.CardLayout cl = (java.awt.CardLayout) cardPanel.getLayout();
                cl.next(cardPanel);
            }
        });

        frame.add(switchButton, BorderLayout.SOUTH);

    }


}
