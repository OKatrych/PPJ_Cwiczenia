package cw19;

public class Main {
    public static void main(String[] args) {
      /*  Dzem dz = new Dzem();
        Dzem dz1 = new Dzem(9.0);
        Dzem dz2 = new Dzem("Malinowy",8.0);
        System.out.println(dz);
        System.out.println(dz2);
 //============================================//
        Sloik sl = new Sloik(dz2);
        System.out.println(sl);
        sl.show();  */
 //============================================//
        String ala1 = "Ala ma kota ";
        String ala2 = "a kot ma Ale ";
        String ala3 = " Ale Ale ";

        Wyraz w1 = new Wyraz(ala1);
        w1.setNastepnyWyraz(new Wyraz(ala2));
        w1.setNastepnyWyraz(new Wyraz(ala3));
        w1.show();

    }
}
