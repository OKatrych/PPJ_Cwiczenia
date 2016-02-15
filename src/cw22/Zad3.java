package Cwiczenia.cw22;


public class Zad3 {

    public static void main(String[] args) {
        int x = 0;
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}