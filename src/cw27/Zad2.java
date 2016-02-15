package cw27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zad2 {
    public void scanFile(){
        try(BufferedReader bf = new BufferedReader(new FileReader("res//Test.txt"))) {
            int count = 0;
            int znak;
            while ((znak = bf.read()) != -1){
                char zn = (char) znak;
                if (zn == '{')
                    count++;
                if (zn == '}')
                    count--;
                if (count < 0)
                    break;
            }
            if (count == 0)
                System.out.println("Poprawno");
            else
                System.out.println("Nie poprawno");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
