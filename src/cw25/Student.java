package cw25;

public class Student {
    private String imie;
    private String nazwisko;
    private int nIndex;

    public Student(String imie, String nazwisko, int nIndex) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nIndex = nIndex;
    }

    public int getnIndex() {
        return nIndex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nIndex=" + nIndex +
                '}';
    }
}
