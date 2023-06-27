package cetvrta.nedeljaOOP.cetvrtak.domaci3;

public class Planina {

    //Domaci Zadatak 1:
    //Napraviti Klasu Planina koja ima atribute za visinu i naziv planine.

    private double visinaPlanine;
    private String imePlanine;

    public Planina(double visinaPlanine, String imePlanine) {
        this.visinaPlanine = visinaPlanine;
        this.imePlanine = imePlanine;
    }

    public Planina() {
        this.visinaPlanine = 0;
        this.imePlanine = "";
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    @Override
    public String toString() {
        return imePlanine + " " + visinaPlanine + "m";
    }
}
