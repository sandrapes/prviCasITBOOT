package pastebin.zadatak_9;

import java.util.ArrayList;

public class Putovanje {

    ////Napisati klasu Putovanje koja ima sledeca polja/atribute:
    //    //	- destinacija(Grad)
    //    //	- vodjaPuta (Osoba)
    //    //	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
    //    //	- udaljenostUKm (double)
    //    //	- prijavljeneOsobe (arrayList)

    //    //udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi Putovanje sa
    //    negativnom udaljenoscu.
    //    //Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
    //    //Napisati sledece metode:
    //    //	2 konstruktora -> vodja puta ne mora da postoji, u oba konstruktora ne treba slati niz prijavljeneOsobe,
    //    //    vec u oba konstruktora ovaj niz napravite kao prazan

    //    //	gettere settere
    //    //	toString metodu koristeci StringBuilder
    //    //	format


    //    //	Destincija: <ImeGrada, ImeDrzave>
    //    //	Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta' ako vodja puta nije
    //    postavljen (null)>
    //    //	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
    //    //	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
    //    //	Prijavljene osobe:
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		<ime> <prezime>
    //    //		....
    //    //	primer
    //    //	Destincija: Pariz, Francuska
    //    //	Vodja puta je: Petar Petrovic
    //    //	Putuje se automobilom: BMW, 2016, 192000
    //    //	Udaljenost do destinacije je: 1300
    //    //	Prijavljene osobe:
    //    //		Zoran Milicevic
    //    //		Pera Peric
    //    //		Marko Markovic
    //    //	napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri
    //    odredjenoj prosecnoj brzini. Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce
    //    biti prosecna brzina automobila, a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto
    //    bude vozio tom prosecnom brzinom.
    //    //	napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
    //    //	napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)
    //    //	Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
    //    i onda napravite neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
    //    i onda prijavite neke od osoba na neka od putovanja, i onda pozovite i metodu za racunanje koliko je vremena potrebno
    //    da se stigne pri odredjenoj brzini.

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostKM;
    private ArrayList<Osoba> prijavljeneOsobe;

    private void podesiUdaljenost(double udaljenostKM) {
        if (udaljenostKM < 0) {
            System.out.println("Greska! Unesite ispravnu udaljenost");
        }
        else
            this.udaljenostKM = udaljenostKM;
    }

    //2 konstruktora -> vodja puta ne mora da postoji, u oba konstruktora ne treba slati niz prijavljeneOsobe,
    //    vec u oba konstruktora ovaj niz napravite kao prazan


    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostKM) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        this.udaljenostKM = udaljenostKM;
        this.prijavljeneOsobe = new ArrayList<>();
    }


    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostKM) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        this.udaljenostKM = udaljenostKM;
        this.prijavljeneOsobe = new ArrayList<>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostKM() {
        return udaljenostKM;
    }

    public void setUdaljenostKM(double udaljenostKM) {
        this.udaljenostKM = udaljenostKM;
    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    //	napisati i metodu koja racuna koliko je vremena potrebno da se stigne na destinaciju pri
    //    odredjenoj prosecnoj brzini. Dakle metoda treba da primi argument koji kaze koliko kilometra na sat (double) ce
    //    biti prosecna brzina automobila, a da vrati koliko ce sati biti potrebno da se dodje do destinacije ako se auto
    //    bude vozio tom prosecnom brzinom.

    public double vremeDoDestinacije(double prosecnaBrzina) {
        return this.udaljenostKM / prosecnaBrzina;

    }

    // napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje

    public void prijava(Osoba o) {
        this.prijavljeneOsobe.add(o);
    }

    //	napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)

    public void odjava(Osoba o) {
        this.prijavljeneOsobe.remove(o);
    }


    //Destincija: Pariz, Francuska
    //    //	Vodja puta je: Petar Petrovic
    //    //	Putuje se automobilom: BMW, 2016, 192000
    //    //	Udaljenost do destinacije je: 1300

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ").append(destinacija).append("\n");
        sb.append("Vodja puta je: ").append(vodjaPuta).append("\n");
        sb.append("Putuje se automobilom: ").append(vozilo).append("\n");
        sb.append("Udaljenost do destinacije: ").append(udaljenostKM).append("\n");
        sb.append("Prijavljene osobe su: ").append(prijavljeneOsobe);
        return sb.toString();
    }
}
