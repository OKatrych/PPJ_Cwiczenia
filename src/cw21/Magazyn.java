package cw21;


public class Magazyn {
    ArrayLista arrayLista = new ArrayLista();
    MyList myList = new MyList();
    Stack st = new Stack();

          // ===================== Stack ========================//
    public void przyjmijKont(Kontener kontener){
        st.push(kontener);
    }
    public void  wydajKonten(){
        System.out.println(st.pop());
    }

          // ===================== Lista ========================//

    public void myListaAdd(Kontener kontener) {
        try {
            myList.add(kontener);
        } catch (MagazynPelnyEx magazynPelnyEx) {
            magazynPelnyEx.printStackTrace();
        }
    }

    public void myListaGet(int x){
        try {
            System.out.println(myList.get(x));
        } catch (MagazynPustyEx magazynPustyEx) {
            magazynPustyEx.printStackTrace();
        }
    }

    public void myListaShow(){
        myList.show();
    }

    public boolean myListaDel(Kontener k){
       return myList.delete(k);
    }

    public int myListaSize(){
        return myList.size();
    }

         // ===================== ArrayList ========================//

    public void listaAdd(Kontener kontener) {
        try {
            arrayLista.przyjmijKontener(kontener);
        }catch (MagazynPelnyEx ex){
            ex.printStackTrace();
        }
    }
    public void listaGet(){
        try {
            System.out.println(arrayLista.pobierzKontener());
        } catch (MagazynPustyEx ex) {
            ex.printStackTrace();
        }
    }



    @Override
    public String toString() {
        return "Magazyn{" +
                "st=" + st +
                '}';
    }
}
