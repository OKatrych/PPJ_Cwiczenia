package cw17;

public class Main {
    public static void main(String[] args){


        //Zadanie 4q
        Kwadrat k1 = new Kwadrat(3);
        k1.przygotujWalec().show();
        //Zadanie 5
        Wyraz w1 = new Wyraz();
        w1.dodajZnak('r');
        w1.dodajZnak('e');
        System.out.println(w1);
        System.out.println(w1.length());


    }
}
