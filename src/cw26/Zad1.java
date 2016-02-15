package cw26;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Zad1 {
    public void fileInpStr(){
        try(FileInputStream in = new FileInputStream("res//Test.txt")){
            int res;
            while((res = in.read()) != -1)
                System.out.print((char)(res));
        }catch (IOException ex){
            System.out.println("Błąd");
        }
    }
    public void fileReader(){
        try(BufferedReader bf = new BufferedReader(new FileReader("res//Test.txt"))) {
            String res;
            while ((res = bf.readLine()) != null){
                System.out.print(res);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
