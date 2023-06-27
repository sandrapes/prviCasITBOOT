package treca.nedeljaOOP.petak.farma;

public class Zivotinja {


    /*
     * 1. Klasa (domacih) Zivotinja koja opisuje zivotinje
     * - Vrsta zivotinje ("Krava" "Ovca")
     * - broj nogu
     * - kilaza
     *
     *
     * -Napraviti konstruktor(e) / gettere i settere
     * - toString() metod:
     *  <vrstaZivotinje> ima <brojNogu> i teska je: <kilaza>kg.
     *
     * - (staticka) Metoda cenaPoKilogramu() koja vraca koliko kosta jedan kilogram te zivotinje na sledeci nacin:
     * Ako je vrsta zivotinje:
     * 1. "Krava" - 100 din/kg
     * 2. "Ovca" - 200 din/kg
     * 3. ostalo - 150 din/kg
     *
     * -Metoda cenaZivotinje() koja vraca cenu za celokupnu zivotinju
     *
     *
     * 2. Klasa Farmer koja opisuje farmera:
     * - Ime
     * - Prezime
     * - broj godina
     * - Listu zivotinja.
     *
     * -Napraviti sve kontrusktore i gettere i settere
     *
     * -toString() metod:
     * <ime> <prezime> <brGodina> ima zivotinje:
     * zivotinja1.toString()
     * ...
     * zivotinjaN.toString()
     *
     *
     * -Napisati metode:
     * 1. dodajZivotinju koja dodaje zivotinju farmeru
     * 2. oduzmiZivotinju koja oduzima neku zivotinju farmeru
     * 3. preborjZivotinje koja vraca broj zivotinja koje farmer ima
     * 4. kolikoMozeZaraditi koja vraca najveci mogci broj koji farmer moze da zaradi kada prodaje zivotinje
     *
     *
     * */

    private String vrstaZivotinje;
    private int brojNogu;
    private int kilaza;

    static double cenaPoKilogramu (String vrsta){
        int cenaPoKilogramu = 1;

        if (vrsta.equalsIgnoreCase("krava")) {
            cenaPoKilogramu = 100;
        }
        else if (vrsta.equalsIgnoreCase("ovca")) {
            cenaPoKilogramu = 200;
        }
        else {
            cenaPoKilogramu = 150;
        }

        return cenaPoKilogramu;

    }


    public double cenaZivotinje() {

        return this.kilaza * Zivotinja.cenaPoKilogramu(this.vrstaZivotinje);

    }




    public Zivotinja(String vrstaZivotinje, int brojNogu, int kilaza) {
        this.vrstaZivotinje = vrstaZivotinje;
        this.brojNogu = brojNogu;
        this.kilaza = kilaza;
    }

    public String getVrstaZivotinje() {
        return vrstaZivotinje;
    }

    public void setVrstaZivotinje(String vrstaZivotinje) {
        this.vrstaZivotinje = vrstaZivotinje;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public int getKilaza() {
        return kilaza;
    }

    public void setKilaza(int kilaza) {
        this.kilaza = kilaza;
    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vrstaZivotinje).append(" ").append("ima ").append(brojNogu).append(" i teska je: ").append(kilaza).append(" kg");
             return sb.toString();
    }
}
