package cw25;

import java.util.LinkedList;

public class Main {
    static Student s1 = new Student("Sasha","Katrycz",66);
    static Student s2 = new Student("Vital","Syrotinskij",55);
    static Student s3 = new Student("Bomz","Bomzarskij",2);
    public static LinkedList<Student> lista = new LinkedList<>();

    public static void main(String[] args) {
        lista.push(s1);
        lista.push(s2);
        lista.push(s3);
        sortL();
        System.out.println(lista.pop());
        System.out.println(lista.pop());
        System.out.println(lista.pop());
    }
    public static void sortL(){
        Student[] s = new Student[lista.size()];
        for (int i = 0; i < s.length; i++) {
            s[i] = lista.pop();
        }
        s = inserSort(s);

        for (Student st: s) {
            lista.push(st);
        }
    }
    public static Student[] inserSort(Student[] arr){
        int i;
        int j;
        Student newValue;
        for (i = 0; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1].getnIndex() > newValue.getnIndex()) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
        return arr;
    }
}
