package pastebin.adatak;

public class Ljubimac {

    //Napisati klasu Ljubimac koja ima atribute:
    //- String ime
    //- String red
    //- int brojNogu
    //- boolean leti
    //- double tezina
    //
    //Napraviti jedan konstruktor koji prima sve argumente
    //Napraviti jedan prazan konstruktor koji postavlja sve niske na "" a ostale vrednosti na podrazumevane
    //
    //Napisati sve gettere i settere
    //
    //Overridovati toString() metod:
    //"Ime ljubimca je: <ime>
    // Tip ljubimca je: <red>
    // Ovaj ljubimac ima: <brojNogu> nogu
    // Ovaj ljubimac leti/ne leti
    // Ovaj ljubimca je tezak: <tezina>kg."

    private String ime;
    private String red;
    private int brojNogu;
    private boolean leti;
    private double tezina;

    public Ljubimac(String ime, String red, int brojNogu, boolean leti, double tezina) {
        this.ime = ime;
        this.red = red;
        this.brojNogu = brojNogu;
        this.leti = leti;
        this.tezina = tezina;
    }

    public Ljubimac() {
        this.ime = "";
        this.red = "";
        this.brojNogu = 0;
        this.leti = false;
        this.tezina = 0;

    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public boolean isLeti() {
        return leti;
    }

    public void setLeti(boolean leti) {
        this.leti = leti;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime ljubimca je: ").append(ime);
        sb.append("Tip ljubimca je: ").append(red);
        sb.append("Ovaj ljubimac ima: ").append(brojNogu);
        if (leti)
            sb.append("Ovaj ljubimac leti ");
        else
            sb.append("Ovaj ljubimac ne leti ");
        sb.append("Ovaj ljubimca je tezak:").append(tezina);
        return sb.toString();
    }
}
