package cw24;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Okno extends Frame {
    public Okno(){
        setSize(500,500);
        setVisible(true);
        setTitle("Okno");
        addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent evt){
                        dispose();
                    }
                }
        );

    }

    public void paint(Graphics g) {
        System.out.println("Teraz rysuję");

        Oval o = new Oval();   // nowe kolo

        int rozmiarOka = (getWidth()+getHeight())/3;

        //-------------------------kolo po centru----------------------------//

          //o.drawCentrOval(g,getWidth(),getHeight(),200);

        //----------------------pawieOko-------------------------------//

          //o.drawPawieOko(g,getWidth(),getHeight(),rozmiarOka);

        //------------------------10 kol-----------------------------//

          o.drawTenOvals(g,getWidth(),getHeight());
          setSize(getWidth(),getWidth());

        //------------------------proste kolo-----------------------------//

          //o.drawOval(g,getWidth(),getHeight());
    }
}
