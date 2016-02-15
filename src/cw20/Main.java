package cw20;

public class Main {
    public static void main(String[] args) {

        System.out.println(Fabryka.make(1));
        System.out.println(Fabryka.make(2));
        System.out.println(Fabryka.make(3));
        System.out.println(Fabryka.make(4));
        System.out.println(Fabryka.make(2));
        Fabryka.showCukierek();
    }
}
