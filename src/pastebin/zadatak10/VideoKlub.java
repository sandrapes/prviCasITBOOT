package pastebin.zadatak10;

import java.util.ArrayList;

public class VideoKlub {

    //Napisati klasu VideoKlub koja sadrzi polja:
    //	- String naziv (naziv video kluba)
    //	- ArrayList katalog (katalog svig filmova na stanju)
    //
    //Napisati konstruktor(e).
    //Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".
    //Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
    //	iznajmiti sto vise kopija datog filma i ispisati poruku:
    //	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
    //	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".
    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
    //Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
    //Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
    //	"{imeFilma} - {cena} | Na stanju: {kolicina}"
    //	"{sadrzajFilma}"
    //	(ili "{imeFilma} | Nema na stanju")
    //Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
    //	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
    //	.
    //	.
    //	.
    //	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"

    private String naziv;
    private ArrayList<FilmNaStanju> katalog;

    public VideoKlub(String naziv, ArrayList<FilmNaStanju> katalog) {
        this.naziv = naziv;
        this.katalog = katalog;
    }


    //Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".

    public FilmNaStanju pronadjiFilm(Film f ) {

        for (FilmNaStanju filmNaStanju : katalog) {
            if (filmNaStanju.getFilm().equals(f)) {
                return filmNaStanju;
            }
        }
        return null;

    }

    public void iznajmiFilm (Film f) {

        FilmNaStanju film = pronadjiFilm(f);

        if (film == null)
            System.out.println("Film ne postoji");
        else {
            if (film.getKolicina() > 0) {
                film.setKolicina(film.getKolicina() - 1);
            }
            else {
                System.out.println("Film ne postoji");
            }
        }
    }

    //Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
    //	iznajmiti sto vise kopija datog filma i ispisati poruku:
    //	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
    //	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
    //	"Film {nazivFilma} trenutno nema na stanju".

    public void iznajmiFilm( Film f, int n) {

        FilmNaStanju film = pronadjiFilm(f);

        if (film == null)
            System.out.println("Film ne postoji");
        else {
            if (film.getKolicina() > n) {
                film.setKolicina(film.getKolicina() - n);
            }
            else if (film.getKolicina() == 0) {
                System.out.println("Film nije na stanju");
            }
            else {

                System.out.println("Jos " + (n - film.getKolicina()) + " osoba ceka na film");
                film.setKolicina(0);
            }

        }

    }

    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.

    public void dodajFilm(Film f, double c) {

        //ovo je moj nacin, mada nisam sigurna da li moram da povecavam kolicinu filma ako ga vec dodam u niz

        FilmNaStanju film = pronadjiFilm(f);

        if (film == null){
            FilmNaStanju noviFilmNaStanju = new FilmNaStanju(f, 1, c);
            this.katalog.add(noviFilmNaStanju);
        }
        else {
            getKatalog().add(film);
            film.setCena(c);
            film.setKolicina(film.getKolicina() + 1);

        }

        /**
         *
         *
         *
         *
        FilmNaStanju film = pronadjiFilm(f);

        if (film == null) {
            FilmNaStanju noviFilmNaStanju = new FilmNaStanju(f, 1, c);
            this.katalog.add(noviFilmNaStanju);
        }
        else {
           film.setKolicina(film.getKolicina() + 1);

        }
         **/

    }

//Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.

    public void dodajFilm(Film f, double c, int n) {

        FilmNaStanju film = pronadjiFilm(f);

        if (film == null) {
            FilmNaStanju noviFilmNaStanju = new FilmNaStanju(f, n, c);

        }
        else {
            film.setKolicina(film.getKolicina() + n);
            film.setCena(c);
        }


        /**
        FilmNaStanju film = pronadjiFilm(f);

        if (film == null) {
            FilmNaStanju noviFilmNaStanju = new FilmNaStanju(f, n, c);
            this.katalog.add(noviFilmNaStanju);
        }
        else {
            film.setKolicina(film.getKolicina() + n);

        } **/

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<FilmNaStanju> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<FilmNaStanju> katalog) {
        this.katalog = katalog;
    }
}
