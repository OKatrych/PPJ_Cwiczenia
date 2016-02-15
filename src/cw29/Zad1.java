package cw29;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {
    private static String str = "Jan III Sobieski herbu Janina (ur. 17 sierpnia 1629 w Olesku, " +
            "zm. 17 czerwca 1696 w Wilanowie) – król Polski i wielki ksiaze litewski od 1674, " +
            "hetman wielki koronny od 1668, hetman polny koronny od 1666, marszałek wielki koronny" +
            " od 1665, chorazy wielki koronny od 1656.";


    public static void main(String[] args) {
        testStr(str);
    }



    public static void testStr(String text){
        Pattern[] pattArr = new Pattern[5];
        String[] naglowki = new String[5];
        try{
            naglowki[0] = "Words : ";
            pattArr[0] = Pattern.compile("\\b\\p{L}+\\b");
            naglowki[1] = "Dates [dd mounth YYYY]: ";
            pattArr[1] = Pattern.compile("[0-3][0-9] (stycz|lut|mar|kwie|maj|czerw|lip|sier|wrześ|październik|listopad|grud)\\p{L}+ [0-9]{4}");
            naglowki[2] = "Year [YYYY] : ";
            pattArr[2] = Pattern.compile("\\b[0-9]{4}\\b");
            naglowki[3] = "Uppercase letters : ";
            pattArr[3] = Pattern.compile("\\b\\p{Lu}\\p{Ll}+\\b");
            naglowki[4] = "Dot : ";
            pattArr[4] = Pattern.compile("\\.");
        }
        catch(Exception e){
            System.out.println("Invalid regex pattern");
        }

        int i = 0;
        for(Pattern patern : pattArr){
            Matcher match = patern.matcher(text);
            int count = 0;
            while(match.find()){
                count++;
            }
            System.out.println(naglowki[i]+count);
            i++;
        }

    }

}
