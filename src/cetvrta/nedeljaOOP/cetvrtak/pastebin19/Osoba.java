package cetvrta.nedeljaOOP.cetvrtak.pastebin19;

public class Osoba implements Pokretljivo {

    //Napisati klasu Osoba koja implementuje interfejs Porketljivo i ima atribute
    //- String ime, prezime
    //- int brojGodina
    //
    //Napisati sve odgovarajuce konstruktore i gettere i settere
    //
    //Osoba se pokrece tako sto ispisuje poruku "Setam"
    //Osoba trosi "Kalorija" kao gorivo
    //
    //
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brGodina>"

    private String ime;
    private String prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
        this.ime = "";
        this.prezime = "";
        this.brojGodina = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }


    @Override
    public void pokreniSe() {
        System.out.println("Setam.");
    }

    @Override
    public String potrosnja() {
        return "Kalorija";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(brojGodina).append("\n");
        return sb.toString();

    }
}
