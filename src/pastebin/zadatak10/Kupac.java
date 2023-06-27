package pastebin.zadatak10;

import java.util.ArrayList;

public class Kupac {

    //Napisati klasu Kupac koja sadrzi polja:
    //	- Osoba kupac
    //	- double racun (novac sa kojim kupac raspolaze)
    //	- Korpa kopra (korpa nekog kupca)
    //	- ArrayList filmovi (filmovi koje je kupac kupio)
    //
    //Napraviti konstruktor koji pravi novog kupca i postavlja da su korpa i filmovi koje vec poseduje prazni.
    //Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.
    //Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova, ako kupac ima dovoljno novca za to i ispisuje:
    //	"Uspesno kupljeno {brojStavki} filmova".
    //	U suprotnom ispisuje poruku:
    //	"Nemate dovoljno novca!
    //	 Potrebno: {ukupnaCenaKorpe}
    //	 Na raspolaganju: {racun}"
    //Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
    //	"{nazivFilma1} {brojKopijaFilma1}"
    //	.
    //	.
    //	.
    //	"{nazivFilmaN} {brojKopijaFilmaN}"
    //	"Ukupno filmova: {brojFilmova}"
    //	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"


    private Osoba kupac;
    private double dostupnoNovca;
   private Korpa korpa;
    private ArrayList<Film> filmovi;

    public Kupac(Osoba kupac, double racun, Korpa korpa) {
        this.kupac = kupac;
        this.dostupnoNovca = racun;
        this.korpa = new Korpa(); // korpa je prazna
        this.filmovi = new ArrayList<>();// arrlist je prazan
    }

    public Osoba getKupac() {
        return kupac;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public double getRacun() {
        return dostupnoNovca;
    }

    public void setRacun(double racun) {
        this.dostupnoNovca = racun;
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList getFilmovi() {
        return filmovi;
    }

    public void setFilmovi(ArrayList filmovi) {
        this.filmovi = filmovi;
    }

    //Omoguciti da kupac moze da ubacuje i izbacuje filmove iz korpe, kao i da pregleda njen sadrzaj.

    public void dodajFilm(Film f) {
        korpa.dodajFilmUKorpu(f);
    }

    public void izbaciFilm(Film f) {
        korpa.izbaciFilmIzKorpe(f);
    }


    //Napisati metodu kupi() - kupuje sve filmove iz korpe i smesta ih u listu filmova, ako kupac ima dovoljno novca za to i ispisuje:
    //	"Uspesno kupljeno {brojStavki} filmova".
    //	U suprotnom ispisuje poruku:
    //	"Nemate dovoljno novca!
    //	 Potrebno: {ukupnaCenaKorpe}
    //	 Na raspolaganju: {racun}"



        public void kupi() {

            double ukupnaCenaKorpe = korpa.getUkupnaCena();

            if (dostupnoNovca >= ukupnaCenaKorpe) {
                ArrayList<FilmNaStanju> stavkeKorpe = korpa.getKorpa();
                for (FilmNaStanju stavka : stavkeKorpe) {
                    Film film = stavka.getFilm();
                    filmovi.add(film);
                }
                dostupnoNovca -= ukupnaCenaKorpe;
                System.out.println("Uspesno kupljeno " + stavkeKorpe.size() + " filmova.");
                korpa.izbaciSveIzKorpe();
            }
            else {
                System.out.println("Nemate dovoljno novca!");
                System.out.println("Potrebno: " + ukupnaCenaKorpe);
                System.out.println("Na raspolaganju: " + dostupnoNovca);
    }
}




    //Napisati metodu pregledajFilmove() - ispisuje sve filmove koje kupac poseduje:
    //	"{nazivFilma1} {brojKopijaFilma1}"
    //	.
    //	.
    //	.
    //	"{nazivFilmaN} {brojKopijaFilmaN}"
    //	"Ukupno filmova: {brojFilmova}"
    //	"Ukupna duzina trajanja: {sati} : {minuti} : {sekunde}"

    public void pregledajFilmove() {
        int brojFilmova = filmovi.size();
        int ukupnoSati = 0;
        int ukupnoMinuti = 0;
        int ukupnoSekunde = 0;

        for (Film film : filmovi) {
            System.out.println(film.getIme() + " " + prebrojKopijeFilma(film));
            ukupnoSati += film.getSati();
            ukupnoMinuti += film.getMinuti();
            ukupnoSekunde += film.getSekunde();
        }

        System.out.println("Ukupno filmova: " + brojFilmova);
        System.out.println("Ukupna duzina trajanja: " + ukupnoSati + " : " + ukupnoMinuti + " : " + ukupnoSekunde);
    }

    private int prebrojKopijeFilma(Film f) {
        int brojKopija = 0;
        for (Film film : filmovi) {
            if (film.equals(f)) {
                brojKopija++;
            }
        }
        return brojKopija;
    }


}