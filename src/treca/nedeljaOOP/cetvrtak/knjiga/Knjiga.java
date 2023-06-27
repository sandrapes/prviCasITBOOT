package treca.nedeljaOOP.cetvrtak.knjiga;

import treca.nedeljaOOP.cetvrtak.osoba.Osoba;

public class Knjiga {

    private String naziv;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;


    private void postaviBrojStrana(int brojStrana){
        if (brojStrana <= 0)
            this.brojStrana = 0;
        else
            this.brojStrana = brojStrana;
    }

    private void postavigodinuIzdanja(int godinaIzdanja){
        if (godinaIzdanja <= 0)
            this.godinaIzdanja = 0;
        else
            this.godinaIzdanja = godinaIzdanja;
    }

        /*private void init(int brojStrana, int godinaIzdanja){
            if (brojStrana <= 0)
                this.brojStrana = 0;
            else
                this.brojStrana = brojStrana;

            if (godinaIzdanja <= 0)
                this.godinaIzdanja = 0;
            else
                this.godinaIzdanja = godinaIzdanja;
        }*/

    public Knjiga(String naziv, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.naziv = naziv;
        this.autor = autor;
        this.vlasnik = vlasnik;
        postaviBrojStrana(brojStrana);
        postavigodinuIzdanja(godinaIzdanja);
    }

    public Knjiga(String naziv, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.naziv = naziv;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
        //this.vlasnik = null; //Ovo ne moramo da radimo jer je podrazumevana vrednost objekntih tipova null
    }

    public String getNaziv() {

        return naziv;
    }

    public void setNaziv(String naziv) {

        this.naziv = naziv;
    }

    public Osoba getAutor() {

        return autor;
    }

    public void setAutor(Osoba autor) {

        this.autor = autor;
    }


    //Ovde moze doci do greske, u slucaju da je vlasnik null
    public Osoba getVlasnik() {
        if (vlasnik == null)
            System.out.println("Ne postoji vlasnik ove knjige. Vracamo null vrednost");
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {

        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {

        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana > 0)
            this.brojStrana = brojStrana;
        else
            System.out.println("Broj strana ne moze biti nepozitivan broj! Ostaje da je broj strana: " + this.brojStrana);
    }

    public int getGodinaIzdanja() {

        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja > 0)
            this.godinaIzdanja = godinaIzdanja;
        else
            System.out.println("Godina izdanja ne moze biti nepozitivan broj! Ostaje da je broj strana: " + this.godinaIzdanja);
    }


    public String velicinaKnjige(){
        if (brojStrana <= 100)
            return "mala knjiga";
        else if (brojStrana <= 300)
            return "srednje velika knjiga";
        else if (brojStrana <= 600)
            return "velika knjiga";
        else
            return "bas velika knjiga";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige: ").append(naziv).append("\n");
        sb.append("Autor knjige je: ").append(autor.toString()).append("\n");
        if (vlasnik == null){
            sb.append("Nema vlasnika\n");
        }
        else
            sb.append("Vlasnik knjige je: ").append(vlasnik.toString()).append("\n");
        sb.append("Broj strana: ").append(brojStrana).append("\n");
        sb.append("Godina izdanja: ").append(godinaIzdanja);
        return sb.toString();

}

}
