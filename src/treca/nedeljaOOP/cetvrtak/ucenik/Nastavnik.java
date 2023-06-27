package treca.nedeljaOOP.cetvrtak.ucenik;

import java.util.ArrayList;

public class Nastavnik {

    /*
     * Napisati klasu za rad sa nastavnicima.
     * Svaki nastavnik ima:
     * - ime -> String
     * - prezime -> String
     * - godine -> int
     * // - Ucenike -> ArrayList<Ucenik>
     * - Ucenik -> Ucenik
     * */

    private String ime;
    private String prezime;
    private int godine;
    private Ucenik ucenik;
    private ArrayList<Ucenik> ucenici;


    public Nastavnik(String ime, String prezime, int godine, ArrayList<Ucenik> ucenici) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ucenici = ucenici;
    }

    public Nastavnik(String imeNastavnika, String prezimeNastavnika, int godine, String imeUcenika, String prezimeUcenika, ArrayList<Integer> ocena) {
        this.ime = imeNastavnika;
        this.prezime = prezimeNastavnika;
        this.godine = godine;
        this.ucenik = new Ucenik(imeUcenika, prezimeUcenika, ocena);
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

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public Ucenik getUcenik() {
        return ucenik;
    }

    public void setUcenik(Ucenik ucenik) {
        this.ucenik = ucenik;
    }


    /*
     * <ime> <prezime> ima ucenika <imeUcenika>. Podaci ucenika su:
     * <id> <imeUcenika> <prezimeUcenika> ima ocene: <ocene>
     * Prosek ucenika je: <prosek>
     * */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ima ucenike: \n");
        sb.append(ucenici.toString()).append("\n");
        return sb.toString();


    }
}
