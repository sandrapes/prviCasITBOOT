package treca.nedeljaOOP.cetvrtak.ucenik;

import java.util.ArrayList;

public class Ucenik {

    /*
     * Pravimo klasu koja opisuje jednog ucenika neke skole.
     * Svaki ucenik ima svoje ime, prezime, ArrayList<Integer> ocene, int ID
     * toString():
     * "<ID> <ime> <prezime> ima ocene: [<ocena1>, <ocena2>, ..., <ocenaN>]
     * "Ucenikov prosek je: <prosek>"
     * primer:
     * "01 Striahinja Trninic ima ocene: [5, 5, 2, 2, 2, 2]"
     * "Ucenikov prosek je: ..."
     *
     * */

    public static int ID;
    private int id;
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;
    private ArrayList<Ucenik> ucenici;


    static {
        ID = 1;
        System.out.println("Kreirali smo nas prvi objekat");
    }

    //Pisemo pomocnu funkciju za kopiranje elemenata iz listi
    private void kreirajOcene(ArrayList<Integer> ocene) {
        this.ocene = new ArrayList<>();
        //this.ocene.addAll(ocene);
        for (Integer o : ocene)
            this.ocene.add(o);
    }

    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        id = ID;
        ID++;
        this.ime = ime;
        this.prezime = prezime;
        //this.ocene = ocene; //Ovo je sasvim ok nacin
        //Hajde da ne kopiram referencu nego da odradim duboko kopiranje liste
        kreirajOcene(ocene);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ID;
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

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        kreirajOcene(ocene);
    }


    private double izracunajProsek() {
        int sum = 0;
        for (Integer o : ocene)
            sum += o;
        return (double) sum / ocene.size();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //String builder je u pocetku prazan string ""
        sb.append(id).append(" ").append(ime).append(" ").append(prezime).append(" ima ocene: ");
        sb.append(ocene).append("\n");
        sb.append("Ucenikov prosek je: ").append(izracunajProsek());
        return sb.toString();
    }
}
