package cw17;

public class Wyraz {

    private static String znakArr ;
    private static int length ;


    public Wyraz (){
        length = 0;
        znakArr = "";
    }
    public void dodajZnak(char znak){
        length ++;
        znakArr += Character.toString(znak);

    }
    public String toString(){
        return znakArr;
    }
    public int length(){
        return length;
    }


}
