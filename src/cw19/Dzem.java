package cw19;
public class Dzem {
    private  String smak ;
    private  double waga ;

    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(String smak) {
         this(smak,-100.0);
    }
    public Dzem(double waga) {
        this("No name",waga);
    }
    public Dzem(){
        this("No name",-100.0);
    }

    public void show(){
        System.out.println(this.smak);
        System.out.println(this.waga);
        System.out.println("---------");
    }

    @Override
    public String toString() {
        return "Dzem{" +
                "smak='" + smak + '\'' +
                ", waga= " + waga +
                '}';
    }
}
