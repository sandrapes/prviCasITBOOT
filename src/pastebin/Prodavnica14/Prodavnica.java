package pastebin.Prodavnica14;

import java.util.ArrayList;

public class Prodavnica {

    //Napisati klasu Prodavnica koja ima atribute
    //- String ime
    //- ArrayList<Namirnica> namirnice
    //
    //Napisati konstruktore:
    //1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira
    //2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.
    //3. Jedan koji prima ime i niz Namirnica preko ...
    //
    //Napisti sve settere i gettere
    //
    //Napisati metode:
    //1. dodajNamirnicu - koja dodaje namirnicu u listu namirnica
    //2. ukoloniNamirnicu - koja uklanja namirnicu iz liste namirnica
    //
    //Overridovati toString() metod na sledeci nacin:
    //"Prodavnica <ime> ima sledece namirnice:
    // <imeNamirnice1> | <cenaNamirnice1>
    // ...
    // <imeNamirniceN> | <cenaNamriniceN>"

    private String ime;
    private ArrayList<Namirnica> namirnice;

    public Prodavnica(String ime, ArrayList<Namirnica> namirnice) {
        this.ime = ime;
        this.namirnice = new ArrayList<>();
            for (Namirnica n : namirnice)
                this.namirnice.add(n);

    }

    public Prodavnica(String ime) {
        this.ime = ime;
        this.namirnice = new ArrayList<>();
    }

    public Prodavnica(String ime, Namirnica ... namirnice) {
        this.ime = ime;
        for (Namirnica n : namirnice) {
            this.namirnice.add(n);
        }


    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public void dodajNamirnicu(Namirnica n) {
        this.namirnice.add(n);
    }

    public void ukloniNamirnicu(Namirnica n) {
        this.namirnice.remove(n);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ima sledecenamirnice: \n");
        for (Namirnica n : namirnice) {
            sb.append(n.toString()).append("\n");
        }
        return sb.toString();
    }
}
