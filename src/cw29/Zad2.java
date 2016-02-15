package cw29;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Zad2 {
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        scanFile("res//telFormat.txt");
        sprawdzNumery();
    }

    public static void scanFile(String file){
        try(BufferedReader inputStream = new BufferedReader(new FileReader("res//telFormat.txt"))){
            String l;
            while ((l = inputStream.readLine()) != null) {
                arrayList.add(l);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println(arrayList);
    }

    public static void sprawdzNumery(){
        String pat = "(\\+[0-9]{2,5}\\(([0-9\\.]{1,3})\\)[0-9]{7,9})|(([0-9]{1,4})( |-|_)([0-9]{3})(( |-|_)([0-9]{3})))|([0-9]{4}-[0-9]{3})";
        Pattern pattern = Pattern.compile(pat);
        for (String number: arrayList) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()){
                System.out.println("______________");
                System.out.println(number);
            }
        }
    }


}
