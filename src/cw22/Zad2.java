package Cwiczenia.cw22;


public class Zad2 {
    public static void main(String[] args) {
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
            x[i] = (int)(Math.random()*100);
        }

        try {
            for (int i = 0; i < x.length+1; i++) {
                System.out.println(x[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index error");
        }

    }
}
