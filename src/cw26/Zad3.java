package cw26;

import java.io.FileReader;
import java.io.StreamTokenizer;

public class Zad3 {
    public void fileReader(){
        StringBuffer sb = new StringBuffer();
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
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.print(sb);
    }
}
