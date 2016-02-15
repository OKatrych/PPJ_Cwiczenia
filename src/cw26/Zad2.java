package cw26;

import java.io.FileInputStream;
import java.io.IOException;

public class Zad2 {
    public void fileIStr(){
        StringBuffer str = new StringBuffer();
        try(FileInputStream in = new FileInputStream("res//1.txt")){
            int tmp;
            while ((tmp = in.read()) != -1 )
                str.append((char)(tmp));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.print(str);
    }
}
