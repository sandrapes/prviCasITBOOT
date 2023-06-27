package pastebin.adatak;

import java.util.ArrayList;

public class Odgajivac extends Vlasnik{

    //Napisati Klasu Odgajivac koji nasledjuje klasu Vlasnik i ima atribute:
    //- String kategorija
    //
    //Napisati sve potrebne konstruktore
    //
    //Napisati sve gettre i settere
    //
    //Napisati metode:
    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.
    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.
    //Odgajivac odgaja one ljubimce ciji se tip poklapa sa Kategorijom odgajivaca
    //(npr Odgajivac.kategorija = "Pas", Ljubimac.red = "Pas")
    //
    //Overridovati toString() metod:
    //"<ime> <prezime> <brojGodina> ima ljubimce:
    // <ljubimac1.toString()>
    // ...
    // <ljubimacN.toString()>
    // A odgaja ljubimce:
    // <ljubimacKojegOdgajas1.toString()>
    // ...
    // <ljubimacKojegOdgajasK.toString()>"

    private String katergorija;

    public Odgajivac(String ime, String prezime, ArrayList<Ljubimac> ljubimci, String katergorija) {
        super(ime, prezime, ljubimci);
        this.katergorija = katergorija;
    }

    public Odgajivac(String katergorija) {
        this.katergorija = katergorija;
    }

    public String getKatergorija() {
        return katergorija;
    }

    public void setKatergorija(String katergorija) {
        this.katergorija = katergorija;
    }

    //1. ispisiSveLjubimceKojeOdgajas() - koja ispisuje sve ljubimce koje odgajivac odgaja.

    public void ispisiSveLjubimceKojeOdgajas() {


        for (int i = 0; i < getLjubimci().size(); i++) {
            Ljubimac ljubimac = getLjubimci().get(i);
            if (katergorija.equalsIgnoreCase(ljubimac.getRed())) {
                System.out.println(ljubimac.toString() + " ");
            }

        }
    }

    //    //2. vratiSveLjubimceKojeOdgajas() - koja vraca ArrayListu ljubimaca koje odgajivac odgaja.

    public ArrayList<Ljubimac> vratiSveLjubimceKojeOdgajas() {

        ArrayList<Ljubimac> novaLista = new ArrayList<>();

        for (int i = 0; i < getLjubimci().size(); i++) {
            Ljubimac ljubimac = getLjubimci().get(i);
            if (katergorija.equalsIgnoreCase(ljubimac.getRed())) {
                novaLista.add(ljubimac);
            }
        }
        return novaLista;
    }



}
