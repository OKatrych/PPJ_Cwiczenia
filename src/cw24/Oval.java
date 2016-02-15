package cw24;

import java.awt.*;

public class Oval{
    Color c;
    private int currentColor = 0;
    private Color[] colors = {
            Color.black,
            Color.blue,
            Color.green,
            Color.yellow,
            Color.cyan
    };
    public void drawCentrOval(Graphics g, int width , int height, int rozmiarKola){
        g.setColor(getC());
        g.fillOval((width / 2) - (rozmiarKola / 2), (height / 2) - (rozmiarKola / 2), rozmiarKola, rozmiarKola);
    }

    public void drawPawieOko(Graphics g, int width , int height, int rozmiarOka){
        int j = 1;
        for (int i = 0; i < 10 ; i++) {
            g.setColor(getC());
            g.fillOval((width / 2) - (rozmiarOka / 2), (height / 2) - (rozmiarOka / (j*2)), rozmiarOka/j, rozmiarOka/j);
            j = j*2;
        }
    }
    public void drawTenOvals(Graphics g, int width , int height){
        int rozmiarOka = width/10;
        int x = 0;
        int y = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                g.setColor(getC());
                g.fillOval(x,y,rozmiarOka, rozmiarOka);
                x = j*(width/10);
            }
            y = i*(height/10);
            x=0;
        }

    }
    public Color getC(){
        if (currentColor >= colors.length)
            currentColor = 0;
        c = colors[currentColor++];
        return c;
    }
    public void drawOval(Graphics g, int width , int height){
        int rozmiarOka = width/10;
        int x = 0;
        int y = 0;
        g.setColor(getC());
        g.fillOval(x,y,rozmiarOka, rozmiarOka);
    }
}
