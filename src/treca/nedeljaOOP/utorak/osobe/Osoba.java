package treca.nedeljaOOP.utorak.osobe;

public class Osoba {

    /*
     * Svaka osoba ima:
     * - Ime
     * - Prezime
     * - Broj godina
     * */
    String ime;
    String prezime;
    int brojGodina;

    public Osoba(String i, String p, int bg){
        ime = i;
        prezime = p;
        brojGodina = bg;
    }

    /*
     * Metoda koja uvecava broj godina za 1
     * */
    public void rodjendan(){
        brojGodina++;
    }
}
