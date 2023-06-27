package treca.nedeljaOOP.petak.domaci;

public abstract class Radnik { // radnik je parent klasa, ostale su child


    //Domaci Zadatak 2:
    //Napraviti klasu Radnik koja ce imati atribute za ime, broj odradjenih sati u nedelji(double),
    //satnicu(double).
    //Naraviti klase Masinovodja, Fizikalac i SefSmene koji ce nasledjivati klasu Radnik.
    //SefSmene ce imati dodatni atribut za nedeljni bonus.
    //U klasi Radnik definisati dve metode:
    //1) Metoda koja vraca ukupno para zaradjeno za nedelju dana (Sefu Smene na ovu ukupnu
    //zaradu dodajemo nedeljni bonus).
    //2) Metoda koja govori da li je radnik na odmoru,
    // Fizikalac je na odmoru ako ima vise od 40 odradjenih sati u nedelju, Masinovodja 30 a Sef smene 50 radnih sati.
    //Za sve klase je potrebno definisati konstruktor, odgovarajuce get i set metode kao i toString().

    private String ime;
    private double brojOdradjenihSati;
    private double satnica;

    public Radnik(String ime, double brojOdradjenihSati, double satnica) {
        this.ime = ime;
        this.brojOdradjenihSati = brojOdradjenihSati;
        this.satnica = satnica;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getBrojOdradjenihSati() {
        return brojOdradjenihSati;
    }

    public void setBrojOdradjenihSati(double brojOdradjenihSati) {
        this.brojOdradjenihSati = brojOdradjenihSati;
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        this.satnica = satnica;
    }

    public double ukupnoZaradjeno() {
        return this.brojOdradjenihSati * this.satnica;
    }

    //2) Metoda koja govori da li je radnik na odmoru,
    // Fizikalac je na odmoru ako ima vise od 40 odradjenih sati u nedelju, Masinovodja 30 a Sef smene 50 radnih sati.

    public boolean daLiJeNaOdmoru() {
        if (brojOdradjenihSati >= 40) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
            String s = ime + " ima odradjenih sati " + brojOdradjenihSati + " i satnicu " + satnica + " ";
            return s;
    }

}






