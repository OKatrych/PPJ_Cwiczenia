package cw19;

public class Wyraz {
    private String str;
    private Wyraz nastepny;

    public Wyraz(String str){
        this.str = str;
    }

    public void setNastepnyWyraz(Wyraz wyraz) {
        this.nastepny = wyraz;
        this.str += " -> " + wyraz;
    }

    public void show(){

        if (nastepny == null){
            System.out.println("");
        }else{
            System.out.print(this + " ");
            nastepny.show();
        }

    }
    @Override
    public String toString() {
        return str;
    }
}