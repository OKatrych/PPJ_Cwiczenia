package cw21;

import java.util.Arrays;

public class Stack {
    Kontener konStack[] = new Kontener[5];
    int top;

    Stack(){
        top = -1;
    }
    void push(Kontener item){
        if (top == 4){
            System.out.println("Stack is full");
        }else {
            if (top == -1){    //jesli stos pusty to dodajemy element
                konStack[++top] = item;
            }else{
                Kontener arr[] = new Kontener[5];   //nowa tablica dla elementow stosa
                for (int i = 0; i < 5; i++) {
                    if (top!=-1)   //jesli stos pusty to niepotrebnym jest
                    arr[i] = pop();  //wylolanie elementa
                    if (item.getDniPrzydatnosci() < arr[i].getDniPrzydatnosci()){   //sprawdzam czy nasz element mniejszy od elementa w stosie
                        konStack[++top] = arr[i]; //jesli tak to zwracam ostatni wylolany element stosa
                        arr[i] = null;
                        konStack[++top] = item; // i zapisuje nad nim nasz element
                        break;
                    }else if(top == -1){  // jesli stos pusty to
                        konStack[++top] = item;  //zapisuje nasz element
                        break;
                    }
                }
                int count = 0;   //ile elementów stosa ma tablica
                int j = 0;
                while (arr[j++]!=null)
                    count++;

                for (int i = 0; i < count; i++) {
                   konStack[++top] = arr[count-i-1];  // zwracam wsystkie elementy stosa
                }
            }
        }
    }
    Kontener pop(){
        if (top < 0){
            System.out.println("Stack is empty");
            return null;
        }else {
            return konStack[top--];
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "konStack=" + Arrays.toString(konStack) +
                '}';
    }
}