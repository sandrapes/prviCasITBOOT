package treca.nedeljaOOP.cetvrtak.osoba;

public class Osoba {

    private String ime;
    private String prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }

    public Osoba() {
        this.ime = "Pera";
        this.prezime = "Peric";
        this.brojGodina = 18;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ima ").append(brojGodina).append(" godina.");
        return sb.toString();
    }
}
