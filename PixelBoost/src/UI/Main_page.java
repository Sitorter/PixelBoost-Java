package UI;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


public class Main_page {
    public static JPanel pasek;
    public static JButton close;
    public static JButton minim;
    public static JLabel napis;

    public Main_page(){

        final EmptyBorder emptyBorder = new EmptyBorder(BorderFactory.createRaisedBevelBorder().getBorderInsets(close));
        final EmptyBorder emptyBorder2 = new EmptyBorder(BorderFactory.createRaisedBevelBorder().getBorderInsets(minim));

        close = new JButton();
        close.setBounds(735,0,50,35);
        close.setBackground(new Color(15,15,15));
        close.setText("X");
        close.setFont(new Font("Impact", Font.PLAIN, 22));
        close.setForeground(Color.white);
        close.setFocusPainted(false);
        UIManager.put("Button.select", new Color(15,15,15));
        close.setBorder(emptyBorder);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close.setForeground(new Color(255,103,217));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                close.setForeground(Color.white);
            }
        });




        minim = new JButton();
        minim.setBounds(685,0,50,35);
        minim.setBackground(new Color(15,15,15));
        minim.setText("-");
        minim.setFont(new Font("Impact", Font.PLAIN, 22));
        minim.setForeground(Color.white);
        minim.setFocusPainted(false);
        UIManager.put("Button.select", new Color(15,15,15));
        minim.setBorder(emptyBorder2);
        minim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minim.setForeground(new Color(255,103,217));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                minim.setForeground(Color.white);
            }
        });


        napis = new JLabel("Pixel Boost");
        napis.setFont(new Font("Impact", Font.PLAIN, 22));
        napis.setBounds(25,0,9999,35);
        napis.setForeground(new Color(255,103,217));


        pasek = new JPanel();
        pasek.setBounds(0,0,1000,35);
        pasek.setBackground(new Color(15,15,15));
        pasek.setLayout(null);


        pasek.add(close);
        pasek.add(minim);
        pasek.add(napis);



    }
}
