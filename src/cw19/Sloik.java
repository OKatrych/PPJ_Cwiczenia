package cw19;

public class Sloik {
     Dzem dzem;
    private boolean czyOtwartySloik;

    public Sloik(Dzem dzem) {
        czyOtwarty();
        otworz();
        this.dzem = dzem;
        czyOtwarty();
        zamknij();
    }

    public void otworz() {
        this.czyOtwartySloik = true;
    }
    public void zamknij() {
        this.czyOtwartySloik = false;
    }

    public void czyOtwarty() {
        System.out.println(czyOtwartySloik);
    }

    public void show(){
        dzem.show();
    }

    @Override
    public String toString() {
        return "Sloik{" +
                "czyOtwartySloik=" + czyOtwartySloik +
                ", dzem=" + dzem +
                '}';
    }
}
