package cw25;

import java.util.Arrays;

public class Zad1 {
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        selSort(arr);
        inserSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length/2;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

    public static void inserSort(int[] arr){
        int i, j, newValue;
        for (i = arr.length/2; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
    }
}
