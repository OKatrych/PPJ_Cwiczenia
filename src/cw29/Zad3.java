package cw29;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad3 {
    static StringBuffer sb = new StringBuffer();
    static String[][] result = new String[209][3];

    public static void main(String[] args) {
        scanFile("res//serverLog.txt");
        regexToArray();
        Calendar[] calendar = getCalendar();

        for (Calendar c: calendar) {
            System.out.println("YEAR : " + "[ " +c.get(1) +" ]" +" MOUNTH : " + "[ " + c.get(2) + " ]" + " WeekOfYear : " +"[ "+ c.get(3)+" ]" +
                    " WeekOfMounth : " + "[ " +c.get(4) +" ]" +" DayOfMounth : " + "[ " + c.get(5) + " ]" + " DayOfYear : " +"[ "+ c.get(6)+" ]"+" DayOfWeek : "  +"[ "+ c.get(7)+" ]");

        }

        print();

    }

    public static void scanFile(String file){
        try(BufferedReader inputStream = new BufferedReader(new FileReader(file))){
            String l;
            while ((l = inputStream.readLine()) != null) {
                sb.append(l);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void regexToArray(){
        String[] regex3 = {"[0-9]{1,2}/[0-9]{2}/[0-9]{4}"
                          ,"[0-9]{1,2}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}"
                          ,"> [ -~]+"};
        Pattern pattern;
        Matcher matcher;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            pattern = Pattern.compile(regex3[i]);
            matcher = pattern.matcher(sb);

            while (matcher.find()){
                if (matcher.find()) {
                    result[count++][i] = sb.substring(matcher.start(), matcher.end());
                }
            }
            count = 0;
        }
    }

    public static Calendar[] getCalendar(){
        Date dateTmp;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Calendar[] calendar = new Calendar[result.length];
        String date;

        try {
            for (int i = 0; i < result.length; i++) {
                Calendar calendarTmp = Calendar.getInstance();
                date = result[i][0];
                dateTmp = df.parse(date);
                calendarTmp.setTime(dateTmp);
                calendar[i] = calendarTmp;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return calendar;
    }

    public static void print(){
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" || ");
            }
            System.out.println();
        }
    }
}