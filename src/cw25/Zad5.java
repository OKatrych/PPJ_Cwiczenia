package cw25;

import java.util.Arrays;

public class Zad5 {

    static String[] str = {"Ala","ma","Ala","ma"};
    static boolean result = false;
    static String[] tmp = new String[str.length];

    public static void main(String[] args) {
        permute(java.util.Arrays.asList(str), 0);
           if (result){
               System.out.println("Jest palindromem");
           }else{
               System.out.println("Nie jest palindromem");
           }

    }

    public static boolean czyPaindrom(String[] str){
        boolean tmp = false;
            for (int i = 0; i < str.length/2; i++) {
                if ((str[i].equals(str[str.length-(i+1)])))
                    tmp = true;
                else return false;
            }
        return tmp;
    }

    static void permute(java.util.List<String> arr, int k){
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            tmp = (String[]) arr.toArray();
            if (czyPaindrom(tmp)){
                result = true;
                System.out.println(Arrays.toString(tmp));
            }
        }
    }

}
