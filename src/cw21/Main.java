package cw21;
import cw20.*;
public class Main {
    public static void main(String[] args) {

        Kontener k1 = new Kontener(3);
        Kontener k2 = new Kontener(4);
        Kontener k3 = new Kontener(1);
        Kontener k4 = new Kontener(77);
        Kontener k5 = new Kontener(5);
        k1.data(Fabryka.make(1),30);
        k2.data(Fabryka.make(2),0);
        k3.data(Fabryka.make(3),3);
        k4.data(Fabryka.make(4),899);
        k5.data(Fabryka.make(5),5);
        Magazyn m1 = new Magazyn();



        m1.myListaAdd(k1); // index "1"
        m1.myListaAdd(k2); // index "2"
        m1.myListaAdd(k3); // index "3"
        m1.myListaAdd(k4); // index "4"
        m1.myListaAdd(k5); // index "5"


        m1.myListaGet(1);
        m1.myListaGet(2);
        m1.myListaGet(3);
        m1.myListaGet(4);
        m1.myListaGet(5);

        System.out.println("Rozmiar listy do usuniecia elementa : " + m1.myListaSize());

        m1.myListaDel(k2);
        // po usunięciu elementa z indeksem "2" ,element z indexem "3" otrzymal indeks "2" , "4"->"3" , "5"->"4"

        System.out.println("Rozmiar listy po usunieciu elementa : " + m1.myListaSize());

        m1.myListaShow();


    }
}