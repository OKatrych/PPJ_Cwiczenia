package cw17;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    public void show(){
        System.out.println("Pole powierzchni tego kwadratu : " + bok*bok);
        System.out.println("Objętość sześcianu zbudowanego na podstawie tego kwadratu : " + bok*bok*bok);
    }
    public Walec przygotujWalec(){
        int promien = bok / 2;
        Walec walec = new Walec(promien,bok);
        return  walec;
    }

}

