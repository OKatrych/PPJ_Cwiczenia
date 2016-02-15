package cw27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Zad3 {
public void scanFile(){
    StringBuffer sb = new StringBuffer();
    Scanner sc = new Scanner(System.in);
    System.out.println("Sciezke zrodla : ");
    String zrodlo = sc.nextLine();
    System.out.println("Sciezke wyniku : ");
    String wynik = sc.nextLine();
    System.out.println(zrodlo +" "+ wynik);
    sc.close();


    try(FileInputStream in = new FileInputStream(zrodlo); Formatter f = new Formatter(wynik)){
        int res;
        int count = 0;
        while((res = in.read()) != -1){
            char znak = (char)(res);
            if (znak == '{') {
                String tmp = "{\n"+spacja(++count);
                sb.append(tmp);
            }else if (znak == '}'){
                String tmp = "\n"+spacja(--count)+"}";
                sb.append(tmp);
            }else {
                sb.append(znak);
            }
        }
        f.format(sb.toString());

    }catch (IOException ex){
        ex.printStackTrace();
    }

}
    public String spacja(int count){
        String sp = "";
        for (int i = 0; i < count; i++) {
            sp+= "    ";
        }
        return sp;
    }
}

