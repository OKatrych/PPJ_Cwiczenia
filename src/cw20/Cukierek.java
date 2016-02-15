package cw20;

public class Cukierek {

    private int waga;
    private int rodzaj;

    public Cukierek(int rodzaj,int waga){
        this.rodzaj = rodzaj;
        this.waga = waga;
    }

    public void show(){
        System.out.println("waga: "+ waga);
    }

    public int getRodzaj() {
        return rodzaj;
    }
    public int getWaga(){
        return waga;
    }

    @Override
    public String toString() {
        return "Cukierek{" +
                "waga=" + waga +
                ", rodzaj=" + rodzaj +
                '}';
    }
}
