package cw21;


import java.util.ArrayList;

public class ArrayLista {
        ArrayList <Kontener> lista  = new ArrayList<>();

    public void przyjmijKontener(Kontener kontener) throws MagazynPelnyEx{
        if(lista.size() < 5) {
            lista.add(kontener);
        }else{
            throw new MagazynPelnyEx();
        }
    }
    public Kontener pobierzKontener() throws MagazynPustyEx {
        if (lista.size() < 1){
            throw new MagazynPustyEx();
        }else{
            Kontener tmp;
            tmp = lista.get(0);
            lista.remove(0);
            return tmp;
        }
    }
}