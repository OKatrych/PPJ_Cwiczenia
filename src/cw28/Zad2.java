package cw28;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad2 {
    StringBuffer sb = new StringBuffer();

    public void fileReader(){
        try(FileInputStream in = new FileInputStream("res//Test.txt")){
            int tmp;
            while ((tmp = in.read()) != -1 )
                sb.append((char)(tmp));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public boolean nawiasy(){
        int count = 0;
        Pattern w = Pattern.compile("[{]");
        Pattern l = Pattern.compile("[}]");
        Matcher m = w.matcher(sb);
        Matcher m1 = l.matcher(sb);
        while (m.find())
            count++;
        while (m1.find())
            count--;

        if (count == 0)
            return true;
        else
            return false;
    }
}
