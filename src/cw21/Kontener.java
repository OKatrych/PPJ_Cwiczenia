package cw21;
import cw20.*;

public class Kontener {
    Kontener next;
    private Cukierek ladunek;
    private double masaLadunku;
    private int dniPrzydatnosci;

    public Kontener(double masaLadunku){
        this.masaLadunku = masaLadunku;
        next = null;
    }
    public void data(Cukierek c, int dniPrzydatnosci){
        ladunek = c;
        this.dniPrzydatnosci = dniPrzydatnosci;
        //System.out.println(c + " Dni przydatności: " + dniPrzydatnosci);
    }
    public boolean sprawdzPrzydatnosc(){
        if (this.dniPrzydatnosci > 0) return true;
        else return false;
    }

    public int getDniPrzydatnosci() {
        return dniPrzydatnosci;
    }

    @Override
    public String toString() {
        return "Kontener{" +
                "ladunek=" + ladunek +
                ", dniPrzydatnosci=" + dniPrzydatnosci +
                '}';
    }
}
