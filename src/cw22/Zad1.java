package Cwiczenia.cw22;

public class Zad1 {
    public static void main(String[] args) {
        sposob1();
        sposob2();
    }
    public static void sposob1(){
        String str = "1234sf";
        String str2 = "";
        int x;
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if (tmp >= '0' && tmp <= '9' ){
                str2+= str.charAt(i);
            }
        }
        x = Integer.parseInt(str2);
        System.out.println(x);
    }

    //-----------------------------------sposob 2(try/catch)--------------------------------------------//

    public static void sposob2(){
        String str = "1f23g4sf";
        String tmp = "";
        int x;
        for (int i = 0; i < str.length(); i++) {
            if (czyInt(str.charAt(i)))
                tmp += str.charAt(i);
        }
        x = Integer.parseInt(tmp);
        System.out.println(x);
    }
    public static boolean czyInt(char x){
        try {
            Integer.parseInt(Character.toString(x));

        }catch (Throwable ex){
              return false;
        }
        return true;
    }
}