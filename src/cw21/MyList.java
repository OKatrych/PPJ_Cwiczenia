package cw21;

import java.util.Arrays;

public class MyList {
    private Kontener first;
    private int size = 0;
    private int nbOfDel = 0;
    private Kontener[] arr;
    public MyList(){
        first = null;
    }

    public void add(Kontener kn) throws MagazynPelnyEx {
        if (size == 5) throw new MagazynPelnyEx();
        if(first == null){
            size++;
            first = kn;

        }else{
            size++;
            Kontener tmp = first;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = kn;

        }
    }
    public boolean delete(Kontener kontener){
        if (first == null) return false;
        if (first.equals(kontener)){
            first = kontener.next;
            size--;
            nbOfDel++;
            return true;
        }
        Kontener tmp = first;
        while (tmp != null && tmp.next != null){
            if (tmp.next.equals(kontener)){
                tmp.next = tmp.next.next;
                size--;
                nbOfDel++;
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public Kontener get(int index) throws MagazynPustyEx {
        if (size == 0) throw  new MagazynPustyEx();
        if (index < 1 || index > size) throw new IndexOutOfBoundsException();

        Kontener tmp = first;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        Kontener tmp1 = tmp;
        //delete(tmp);
        return tmp1;
    }


    public int size(){
        return size;
    }

    public void show(){
        System.out.println();
        Kontener tmp = first;
        while (tmp != null){
            System.out.print(tmp +"-> ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
