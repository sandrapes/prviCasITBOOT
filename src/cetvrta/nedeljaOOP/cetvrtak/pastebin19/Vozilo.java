package cetvrta.nedeljaOOP.cetvrtak.pastebin19;

public abstract class Vozilo implements Pokretljivo {


    //Napisati abstraktnu klasu Vozilo koje implementuje interfejs Pokretljivo i ima atribute:
    // - String marka, tip
    //- double kilometraza
    //Napraviti sve odgovarajuce konstruktore pazeci na logiku (kilometraza ne moze biti negativan broj) i sve gettere i settere

    private String marka;
    private String tip;
    private double kilometraza;

    public Vozilo(String marka, String tip, double kilometraza) {
        this.marka = marka;
        this.tip = tip;
        if (kilometraza > 0) {
            this.kilometraza = kilometraza;
        }
        else
            this.kilometraza = 0;

    }

    public Vozilo() {
        this.marka = "";
        this.tip = "";
        this.kilometraza = 0;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(double kilometraza) {
        this.kilometraza = kilometraza;
    }
}
