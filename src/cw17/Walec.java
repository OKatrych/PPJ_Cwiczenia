package cw17;

public class Walec {
    private int promien;
    private int wysokosc;

    public Walec(int promien , int wysokosc){
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public int getPromien() {
        return promien;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void show(){
        final double PI = Math.PI;
        double pl = PI*(promien*promien);
        System.out.println("Pole powierzchni podstawy :" + pl);
        System.out.println("Objętość walca :" + pl * wysokosc);
    }

}
