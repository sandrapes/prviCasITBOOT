package cetvrta.nedeljaOOP.zadatak17;

public abstract class DomacaZivotinja extends Zivotinja {

    //Napisati abstraktnu klasu DomacaZivotinja koja nasledjuje klasu Zivotinja i ima atribute:
    //- String ime
    //- double kilaza
    //- int brojNogu
    //
    //Napisati sve odgovarajuce konstruktore
    //
    //Napisati sve gettre i settere
    //
    //Napisati abstraktne metode:
    //1. boolean daLiSeJedem() - koja vraca na odgovor na pitanje da li se meso te zivotinje jede, ili ne (poput "psa" i "macke")
    //
    //Overridovati sve metode koje mozemo da overridujemo

    private String ime;
    private double kilaza;
    private int brojNogu;

    public DomacaZivotinja(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv);
        this.ime = ime;
        this.kilaza = kilaza;
        this.brojNogu = brojNogu;
    }

    public DomacaZivotinja(String naziv) {
        super(naziv);

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getKilaza() {
        return kilaza;
    }

    public void setKilaza(double kilaza) {
        this.kilaza = kilaza;
    }

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public abstract boolean daLiSeJedem();


    @Override
    public int brojNogu() {
        return brojNogu;
    }

    @Override
    public boolean daLiJeDomaca() {
        return true;
    }


}
