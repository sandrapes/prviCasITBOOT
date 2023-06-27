package treca.nedeljaOOP.cetvrtak.ucenik1;

import java.util.ArrayList;

public class Ucenik1 {

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

    private int ID;
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    //Pisemo pomocnu funkciju za kopiranje elemenata iz listi
    private void kreirajOcene(ArrayList<Integer> ocene) {
        this.ocene = new ArrayList<>();
        //this.ocene.addAll(ocene);
        for (Integer o : ocene)
            this.ocene.add(o);
    }

    public Ucenik1(int ID, String ime, String prezime, ArrayList<Integer> ocene) {
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
        //this.ocene = ocene; //Ovo je sasvim ok nacin
        //Hajde da ne kopiram referencu nego da odradim duboko kopiranje liste
        kreirajOcene(ocene);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
        sb.append(ID).append(" ").append(ime).append(" ").append(prezime).append(" ima ocene: ");
        sb.append(ocene).append("\n");
        sb.append("Ucenikov prosek je: ").append(izracunajProsek());
        return sb.toString();
    }
}
