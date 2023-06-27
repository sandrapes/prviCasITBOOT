package pastebin.adatak;

import java.util.ArrayList;

public class Vlasnik extends Osoba{

    // Napisati klasu Vlasnik koja ima atribute:
    //- ArrayListLjubimac> ljubimci
    //
    //Napraviti jedan pun konstruktor i jedan konstruktor koji ne prima
    //ArrayListu, vec kreira sam novu, praznu ArrayListu
    //
    //Napisati sve gettere i ssettere
    //
    //Napisati metode:
    //1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca
    //2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> ima ljubimce:
    // <ljubimac1.toString()>
    // ...
    // <ljubimacN.toString()>"

    private ArrayList<Ljubimac> ljubimci;


    public Vlasnik(String ime, String prezime, ArrayList<Ljubimac> ljubimci) {
        super(ime, prezime);
        this.ljubimci = ljubimci;
    }

    public Vlasnik() {
        super();
        this.ljubimci = new ArrayList<>();
    }

    public ArrayList<Ljubimac> getLjubimci() {
        return ljubimci;
    }

    public void setLjubimci(ArrayList<Ljubimac> ljubimci) {
        this.ljubimci = ljubimci;
    }

    //1. dodajLjubimca - koja dodaje ljubimca u listu ljubimaca

    private void dodajLjubimca(Ljubimac p) {
        this.ljubimci.add(p);
    }

    //2. oduzmiLjubimca - koja oduzima ljubimca iz liste ljubimaca

    private void oduzmiLjubimca(Ljubimac p) {
        this.ljubimci.remove(p);
    }

    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> ima ljubimce:
    // <ljubimac1.toString()>
    // ...
    // <ljubimacN.toString()>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ima ljubimce: ").append(ljubimci);
        return sb.toString();
    }
}
