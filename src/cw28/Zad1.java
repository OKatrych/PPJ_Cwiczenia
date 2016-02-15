package cw28;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {
    StringBuffer sb = new StringBuffer();

    public void fileReader(){
        try(FileReader fl = new FileReader("res//1.txt")) {
            StreamTokenizer streamTokenizer = new StreamTokenizer(fl);
            int count = 0;
            while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF || ++count!=200){
                if(streamTokenizer.ttype == StreamTokenizer.TT_NUMBER){
                    String tmp = streamTokenizer.nval+" ";
                    sb.append(tmp);
                }else if(streamTokenizer.ttype == StreamTokenizer.TT_WORD){
                    String tmp = streamTokenizer.sval+" ";
                    sb.append(tmp);
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public void ileWyrLicz(){
        int slow = 0;
        int liczb = 0;

        Pattern w = Pattern.compile("\\b\\p{L}+\\b");
        Pattern l = Pattern.compile("\\b[0-9]\\b");
        Matcher m = w.matcher(sb);
        Matcher m1 = l.matcher(sb);
        while (m.find())
            slow++;
        while (m1.find())
            liczb++;

        System.out.println("Slow : " + slow + " Liczb : " + liczb);
    }
}
