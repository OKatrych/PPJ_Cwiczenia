package cw18;
import cw17.*;
public class Main {
    public static void main(String[] args) {
        Walec w1 = new Walec(4,16);
        Kwadrat k1 = new Kwadrat(6);
        KulaW kw1 = new KulaW(w1);
        KulaW kw2 = new KulaW(k1);

        System.out.println(kw1);

        System.out.println(kw2);
    }


}
