package cetvrta.nedeljaOOP.test;

import java.util.ArrayList;

public class Restoran extends UgostiteljskiObjekat {

    //2. Restoran
    //Kreirati klasu Restoran koja prosiruje klasu UgostiteljskiObjekat i koja opisuje neki restoran.
    //Svaki restoran pored navedenih stvari ima i broj slobodnih stolova.
    //Popuniti ovu klasu na sledeci nacin:
    //1. Polja:
    //int brSlobodnihStolova
    //2. Konstruktori:
    //Potpun konstruktor koji prima sve argumente
    //Po jedan konstruktor za svaki nadkonstruktor koji prima argument za broj slobodnih stolova i sve ostale odgovarajuce argumente
    //Jedan konstruktor koji prima samo String naziv, a postavlja broj slobodnih stolova na 25
    //3. Napisati sve potrebne gettere i settere, pazeci da broj slobodnih stolova ne moze biti negativan broj!
    //4. Napisati sledece metode:
    //public boolean imaLiSlobodnihStolova() koja se pita da li postoji slobodan sto.
    //public void oslobodiSto() koja dodaje jedan slobodan sto.
    //public void oslobodiSto(int x) koja dodaje x slobodnih stolova.
    //public void zaokupiSto() koja zaokupljuje jedan slobodan sto. Paziti da broj slobodnih stolova ne moze biti negativan broj.
    //public void zaokupiSto(int x) koja zaokupljuje x slobodnih stolova. Paziti da broj slobodnih stolova ne moze biti negativan broj.
    //Ukoliko nema dovoljno slobodnih stolova, zaokupiti onoliko koliko ih je ostalo!
    //5. Implementirati naredne metode:
    //public abstract void dodajOcenu(double ocena); na sledeci nacin:
    //Ukoliko je prosledjena ocena veca ili jednaka od prosecne ocene restorana, onda je umanjiti za 0.3 i izracunati i zapamtiti novu prosecnu ocenu restorana. (kao prosek prosledjene i trenutne)
    //Ukoliko je prosledjena ocena strogo manja od prosecne ocene restorana, izracunati i zapamtiti novu prosecnu ocenu restorana. (kao prosek prosledjene i trenutne)
    //Ukoliko je proslednjena ocena nevalidna, zanemariti je.
    //Ukoliko je prosledjena ocena veca ili jednaka od 4.5 ili manja ili jednaka od 2.0 azurirati broj zvezda restorana.
    //public abstract void azurirajZvezdu(); na sledeci nacin:
    //Ukoliko je prosecna ocena strogo iznad 4.5, dodati 2 zvezde restoranu.
    //Ukoliko je prosecna ocena strogo veca od 3.5 a ispod 4.5, dodati 1 zvezdu restoranu.
    //Ukoliko je prosecna ocena strogo veca od 3.0 a ispod 3.5, oduzeti 1 zvezdu restoranu.
    //Ukoliko je prosecna ocena manja ili jednaka od 3.0, oduzeti 2 zvezde restoranu.
    //6. Preopteretiti toString() metod:
    //"---------------"
    //"\Restoran\t"
    //"---------------"
    //"\t-----<naziv>-----"
    //"\t*****(<brMichelinZvezda>)*****"
    //""
    //"Prosecna ocena: <prosecnaOcena>"
    //"Recenzije:"
    //"1) <recenzija[0]>"
    //"2) <recenzija[1]>"
    //...
    //"N) <recenzija[N]>

    private int brSlobodnihStolova;

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda, recenzije);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezda, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezda);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, int brSlobodnihStolova) {
        super(naziv);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv) {
        super(naziv);
        this.brSlobodnihStolova = 25;
    }


    public int getBrSlobodnihStolova() {
        if (brSlobodnihStolova < 0)
            return 0;
        else
            return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        if (brSlobodnihStolova < 0)
            this.brSlobodnihStolova = 0;
        else
            this.brSlobodnihStolova = brSlobodnihStolova;
    }

    //public boolean imaLiSlobodnihStolova() koja se pita da li postoji slobodan sto.

    public boolean imaLiSlobodnihStolova() {

        if (brSlobodnihStolova >= 1)
            return true;
        else
            return false;
    }

    //public void oslobodiSto() koja dodaje jedan slobodan sto.

    public void oslobodiSto() {
        this.brSlobodnihStolova = brSlobodnihStolova + 1;

    }
    //public void oslobodiSto(int x) koja dodaje x slobodnih stolova.

    public void oslobodiSto(int x) {
        this.brSlobodnihStolova = brSlobodnihStolova + x;

    }

    //public void zaokupiSto() koja zaokupljuje jedan slobodan sto. Paziti da broj slobodnih stolova ne moze biti negativan broj.

    public void zaokupiSto() {
        if (brSlobodnihStolova >= 1)
            this.brSlobodnihStolova = brSlobodnihStolova - 1;
    }

    //public void zaokupiSto(int x) koja zaokupljuje x slobodnih stolova.
    // Paziti da broj slobodnih stolova ne moze biti negativan broj.
    //Ukoliko nema dovoljno slobodnih stolova, zaokupiti onoliko koliko ih je ostalo!

    public void zaokupiSto(int x) {
        if (brSlobodnihStolova - x >= 0)
            this.brSlobodnihStolova = brSlobodnihStolova - x;
        if (brSlobodnihStolova - x < 0)
            this.brSlobodnihStolova = 0;
    }

    //Ukoliko je prosledjena ocena veca ili jednaka od prosecne ocene restorana, onda je umanjiti za 0.3 i
    // izracunati i zapamtiti novu prosecnu ocenu restorana. (kao prosek prosledjene i trenutne)
    //Ukoliko je prosledjena ocena strogo manja od prosecne ocene restorana, izracunati i zapamtiti novu prosecnu ocenu restorana.
    // (kao prosek prosledjene i trenutne)
    //Ukoliko je proslednjena ocena nevalidna, zanemariti je.
    //Ukoliko je prosledjena ocena veca ili jednaka od 4.5 ili manja ili jednaka od 2.0 azurirati broj zvezda restorana.

    @Override
    public void dodajOcenu(double ocena) {
        if (ocena >= getProsecnaOcena()) {
            ocena -= 0.3;
            setProsecnaOcena((getProsecnaOcena() + ocena) / 2);
        } else if (ocena < getProsecnaOcena()) {
            setProsecnaOcena((getProsecnaOcena() + ocena) / 2);
        } else if (ocena < 1.0 || ocena > 5.0) {
            setProsecnaOcena(getProsecnaOcena());
        } else if (ocena >= 4.5 || ocena <= 2.0) {
            azurirajZvezdu();
        }
    }

    //Ukoliko je prosecna ocena strogo iznad 4.5, dodati 2 zvezde restoranu.
    //Ukoliko je prosecna ocena strogo veca od 3.5 a ispod 4.5, dodati 1 zvezdu restoranu.
    //Ukoliko je prosecna ocena strogo veca od 3.0 a ispod 3.5, oduzeti 1 zvezdu restoranu.
    //Ukoliko je prosecna ocena manja ili jednaka od 3.0, oduzeti 2 zvezde restoranu.

    @Override
    public void azurirajZvezdu() {
        if (getProsecnaOcena() > 4.5) {
            if (getBrMichelinZvezda() <= 1)
                setBrMichelinZvezda(getBrMichelinZvezda() + 2);
            else
                setBrMichelinZvezda(3);
        } else if (getProsecnaOcena() > 3.5 && getProsecnaOcena() < 4.5) {
            if (getBrMichelinZvezda() <= 2)
                setBrMichelinZvezda(getBrMichelinZvezda() + 1);
            else
                setBrMichelinZvezda(3);
        } else if (getProsecnaOcena() > 3.0 && getProsecnaOcena() < 3.5) {
            if (getBrMichelinZvezda() >= 1)
                setBrMichelinZvezda(getBrMichelinZvezda() - 1);
            else
                setBrMichelinZvezda(0);
        }
        else if (getProsecnaOcena() <= 3.0) {
            if (getBrMichelinZvezda() >= 2)
                setBrMichelinZvezda(getBrMichelinZvezda() - 2);
            else
                setBrMichelinZvezda(0);
        }

    }
    //6. Preopteretiti toString() metod:
    //"---------------"
    //"\Restoran\t"
    //"---------------"
    //"\t-----<naziv>-----"
    //"\t*****(<brMichelinZvezda>)*****"
    //""
    //"Prosecna ocena: <prosecnaOcena>"
    //"Recenzije:"
    //"1) <recenzija[0]>"
    //"2) <recenzija[1]>"
    //...
    //"N) <recenzija[N]>


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        sb.append(" Restoran\n");
        sb.append("---------------------\n");
        sb.append(super.toString());
        return sb.toString();

    }
}
