package cw25;

import java.util.Arrays;

public class Zad2 {
    public static char[][] arr = new char[10][10];
    public static char e = 'e';


    public static void main(String[] args) {
        //addToArr();
        addToRecArr(0);
        showArr();
    }

    public static void addToArr(){
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (y == 0 || x == 0 || y == arr.length-1 || x == arr.length-1)
                    arr[y][x] = e;
                if ((y == 1 || x == 1 || y == arr.length-2 || x == arr.length-2)&&(arr[y][x]== 0))
                    arr[y][x] = (char) (e-1);
                if ((y == 2 || x == 2 || y == arr.length-3 || x == arr.length-3)&&(arr[y][x]== 0))
                    arr[y][x] = (char) (e-2);
                if ((y == 3 || x == 3 || y == arr.length-4 || x == arr.length-4)&&(arr[y][x]== 0))
                    arr[y][x] = (char) (e-3);
                if ((y == 4 || x == 4 || y == arr.length-5 || x == arr.length-5)&&(arr[y][x]== 0))
                    arr[y][x] = (char) (e-4);
            }
        }
    }
    public static void addToRecArr(int i){
        if (i == arr.length/2)
            return;
        for (int y = i; y < arr.length-i; y++) {
            for (int x = i; x < arr[y].length-i; x++) {
                arr[y][x] = (char)(e-i);
            }
        }
        addToRecArr(i+1);
    }
    public static void showArr(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
