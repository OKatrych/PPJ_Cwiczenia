package cw18;
import cw17.*;
public class KulaW {
    int promien;

    KulaW(Walec walec){
        this.promien = walec.getPromien();
    }

    KulaW(Kwadrat kwadrat){
       this.promien = (kwadrat.getBok())/2;
    }

    @Override
    public String toString() {
        return "KulaW{" +
                "promien=" + promien +
                '}';
    }
}
