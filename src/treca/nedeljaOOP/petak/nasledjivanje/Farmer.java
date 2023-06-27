package treca.nedeljaOOP.petak.nasledjivanje;

import treca.nedeljaOOP.petak.farma.Zivotinja;

import java.util.ArrayList;

public class Farmer extends Osoba {

    // * Dopuniti klasu Farmer tako da nasledjuje klasu Osoba
//    *
//    *
//    * Dopuniti klasu Zivotinja sa metodom:
//    * - ozvuciSe() koja vraca string "zivotinje ne mogu da pricaju"
//    *
//    *
//    * Napisati klase "Krava", "Ovca" koje nasledjuju klasu Zivotinja.
//    * Overridovati metodu ozvuciSe() tako da vraca:
//    * "mooo"; ako je u pitanju krava
//    * "beee"; ako je u pitanju ovca
//    * Takodje napisati metodu cenaOveZivotinje() tako da ne poziva staticku metodu iz natklase.
//    *
//    *
//    * Obezbediti za sve klase hashCode() i equals()

    private ArrayList<Zivotinja> zivotinje;
    private double novac;

    public Farmer(String ime, String prezime, int brojGodina, ArrayList<Zivotinja> zivotinje, double novac) {
        super(ime, prezime, brojGodina);
        this.zivotinje = zivotinje;
        this.novac = novac;
    }

    public Farmer(String ime, String prezime, int brojGodina, double novac, Zivotinja... zivotinje) {
        super(ime, prezime, brojGodina);
        this.novac = novac;
        this.zivotinje = new ArrayList<>();

        for (Zivotinja z : zivotinje)
            this.zivotinje.add(z);
    }

    public ArrayList<Zivotinja> getZivotinje() {
        return zivotinje;
    }

    public void setZivotinje(ArrayList<Zivotinja> zivotinje) {
        this.zivotinje = zivotinje;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    public void dodajZivotinju(Zivotinja z) {
        zivotinje.add(z);

    }

    public void oduzmiZivotinju(Zivotinja z) {
        novac = +z.cenaZivotinje();
        zivotinje.remove(z);
    }

    public int prebrojZivotinje() {
        return zivotinje.size();

    }

    public double kolikoMozeZaraditi() {
        double sum = 0;
        for (Zivotinja z : zivotinje)
            sum = +z.cenaZivotinje();
        return sum;
    }






}
