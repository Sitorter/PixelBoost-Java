import UI.Main_page;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.*;

public class Main {

    public static JFrame okno;

    public Main() {
        Main_page mp = new Main_page();
        okno = new JFrame();
        okno.setTitle("PixelBoost");
        okno.setLayout(null);
        okno.setResizable(false);
        okno.setUndecorated(true);
        okno.setShape(new RoundRectangle2D.Double(0, 0, 800, 500, 50, 50));
        okno.setSize(1000, 600);
        okno.setLocation(100,100);
        okno.setVisible(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.add(mp.pasek);







        mp.close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                okno.dispose();
            }
        });
        mp.minim.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                okno.setState(JFrame.ICONIFIED);
            }

        });

    }

    public static void main(String[] args) {
        new Main();

    }

}