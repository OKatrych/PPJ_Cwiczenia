package cw20;

public class Zad1 {
    int x;
    char z;
    String str;

    public Zad1() {
        this.x = 0;
        this.z = 'z';
        this.str = null;
    }

    public Zad1(int x, char z, String str) {
        this.x = x;
        this.z = z;
        this.str = str;
    }

    public Zad1(Zad1 zad1) {
        this(zad1.x,zad1.z,zad1.str);
    }

    @Override
    public String toString() {
        return "Zad1{" +
                "x=" + x +
                ", z=" + z +
                ", str='" + str + '\'' +
                '}';
    }
}
