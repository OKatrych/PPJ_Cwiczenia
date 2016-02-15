package cw27;


import java.io.FileReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Zad1 {
    String [] keywords = {"abstract","continue","for","new","switch","assert","default","goto",
            "package","synchronized","boolean","do","if","private","this","break","double",
            "implements","protected","throw","byte","else","import","public","throws","case",
            "enum","instanceof","return","transient","catch","extends", "int","short","try",
            "char","final","interface","static","void","class","finally","long","strictfp",
            "volatile","const","float","native","super","while"};

    ArrayList<String> wszystkieWystapienia = new ArrayList<>();
    ArrayList<String> tylkoOsobne = new ArrayList<>();

    public void scanfile(){
        double count = 0;
        double ileSlow = 0;
         try(FileReader fl = new FileReader("res//Test.txt")){
             StreamTokenizer tk = new StreamTokenizer(fl);
             while (tk.nextToken() != StreamTokenizer.TT_EOF){
                if(tk.ttype == StreamTokenizer.TT_WORD){
                    ileSlow++;
                    if (scanKeywords(tk.sval)){
                        count++;
                    }
                 }
             }
         }catch (Exception ex){
             ex.printStackTrace();
         }
        double v = (count/ileSlow);
        System.out.println((int)(count) +" slow , krotnosc : " + v);
        //System.out.println(wszystkieWystapienia);
        //System.out.println(tylkoOsobne);
        System.out.println();
        ilePowtorow();
    }

    public boolean scanKeywords(String s){
        for (String arr : keywords) {
            if (arr.equals(s)){
                if (!(czyWystapia(s))){
                    tylkoOsobne.add(s);
                }
                wszystkieWystapienia.add(s);
                return true;
            }
        }
        return false;
    }

    public boolean czyWystapia(String s){
        for (String arr : wszystkieWystapienia) {
            if (arr.equals(s))
                return true;
        }
        return false;
    }

    public void ilePowtorow(){
        int k = 0;
        for(int i=0; i< tylkoOsobne.size();i++) {
            for(int j=i; j< wszystkieWystapienia.size();j++) {
                if(tylkoOsobne.get(i).equals(wszystkieWystapienia.get(j))) {
                    k++;
                }
            } System.out.println(tylkoOsobne.get(i) + " wystepuje " + k +" raz ");
            k=0;
        }
    }
}

