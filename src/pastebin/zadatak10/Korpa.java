package pastebin.zadatak10;

import java.util.ArrayList;

public class Korpa {

    // Napisati klasu Korpa koja sadrzi polja:
    //	- VideoKlub vk (neki video klub)
    //	- ArrayList korpa (korpa u koju mogu da se stavljaju filmovi koje neki kupac hoce da kupi)
    //	- double ukupnaCena (ukupna cena filmova u korpi)
    //
    //Napisati odogarajuc(e) konstruktor(e) i metode za ovu klasu.
    //Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    //	AKo zadatog filma nema na stanju ispisati poruku:
    //	"Film {f} nema na stanju."
    //Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u zadatom video klubu.
    //	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
    //	"Nije moguce kupiti {n} filmova {nazivFilma}.
    //	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."
    //Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da takav film uvek postoji u korpi).
    //	Ispisati poruku:
    //	"Izbacili ste kopiju filma {nazivFilma} iz korpe".
    //Napisati metod izbaciIzKorpe(Film f, int n) - izbacuje n kopija filma f iz korpe i ispisati poruku:
    //	"Izbacili ste {n} kopija filma {nazivFilma} iz korpe.".
    //	Ako je prosledjen broj n veci ili jednak broju kopija filma f u korpi ispisati poruku:
    //	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."
    //Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
    //	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."


    //Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
    //	"Korpa je sada prazna."


    //Napisati metod ispisiInventarKorpe() koja ispisuje inventar korpe:
    //	"{nazivFilma1} {brojKopijaFilma1UKorpi} {ukupnaCenaSvihKopijaFilma1UKopri}
    //	 .
    //	 .
    //	 .
    //	 {nazivFilmaN} {brojKopijaFilmaNUKorpi} {ukupnaCenaSvihKopijaFilmaNUKopri}"
    //	 Ukupna cena: {ukupnaCena} svih filmova u korpi"

    private VideoKlub vk;
    private ArrayList<FilmNaStanju> korpa;
    private double ukupnaCena;

    public Korpa(VideoKlub vk, ArrayList<FilmNaStanju> korpa, double ukupnaCena) {
        this.vk = vk;
        this.korpa = korpa;
        this.ukupnaCena = ukupnaCena;
    }

    public Korpa() {
    }

    public VideoKlub getVk() {
        return vk;
    }

    public void setVk(VideoKlub vk) {
        this.vk = vk;
    }

    public ArrayList<FilmNaStanju> getKorpa() {
        return korpa;
    }

    public void setKorpa(ArrayList<FilmNaStanju> korpa) {
        this.korpa = korpa;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }



    //Napisati metodu dodajFilmUKorpu(Film f) - dodaje jednu kopiju film f u korpu ako ga ima na stanju u zadatom video klubu.
    //	AKo zadatog filma nema na stanju ispisati poruku:
    //	"Film {f} nema na stanju."

    public void dodajFilmUKorpu(Film f){
        Film neki = korpa.get(0).getFilm();
        FilmNaStanju film = vk.pronadjiFilm(f);

        if (film == null)
            System.out.println(f + " nema na stanju");
        else {
            if (film.getKolicina() > 0) {
                korpa.add(film);
                ukupnaCena += film.getCena();
            }

        }

    }

   // Napisati metodu dodajFilmaUKorpu(Film f, int n) - dodaje n kopija filma f u kopru ako ga ima na stanju u
    // zadatom video klubu.
    //	Ako u video klubu ima manje od n kopija filma f, onda dodati sve preostale kopije u korpu i ispisati poroku:
    //	"Nije moguce kupiti {n} filmova {nazivFilma}.
    //	 U korpu je dodato {brojKopija} kopija filma {nazivFilma}."


    private void dodajFilmUKorpu(Film f, int n) {


        FilmNaStanju film = vk.pronadjiFilm(f);

        if (film == null) {
            System.out.println("Filma nema na stanju");
        }
        else if (film.getKolicina() < n) {

            for (int i = 0; i < film.getKolicina(); i++) {
                korpa.add(film);
                ukupnaCena += film.getCena();
                System.out.println("Nije moguce kupiti n kopija filma");
            }
        }
        else {

            for (int i = 0; i < n; i++) {
                korpa.add(film);
                ukupnaCena += film.getCena();
            }
        }

    }

    //Napisati metod izbaciIzKorpe(Film f) - izbacuje jednu kopiju filma f iz korpe (pretpostaviti da
    // takav film uvek postoji u korpi).
    //	Ispisati poruku:
    //	"Izbacili ste kopiju filma {nazivFilma} iz korpe".


    private void izbaciIzKorpe(Film f, int n) {

        FilmNaStanju film = vk.pronadjiFilm(f);

        if (film == null) {
            System.out.println("Filma nema na stanju");
        }
        else {
                korpa.remove(film);
                ukupnaCena -= film.getCena();
                System.out.println("Izbacili ste kopiju filma" + f.getIme() + "iz korpe");
        }


    }

    //Napisati metod izbaciIzKopreSveKopije(Film f) - izbacuje sve kopije filma f iz korpe i ispisuje poruku:
    //	"Izbacili ste sve kopije filma {nazivFilma} iz korpe."

    public void izbaciIzKopreSveKopije(Film f) {

        FilmNaStanju film = vk.pronadjiFilm(f);

        int brojac = 0;
        for (int i = 0; i < korpa.size(); i++) {
            if (korpa.get(i).getFilm().equals(f)) {
                        brojac++;
            }
        }

        for (int i = 0; i < brojac - 1; i++) {
            korpa.remove(film);
            ukupnaCena -= film.getCena();
        }
    }

    //Napisati metod izbaciSveIzKorpe() - potpuno prazni korpu i ispisuje poruku:
    //	"Korpa je sada prazna."

    public void izbaciSveIzKorpe() {
        korpa.clear();
        ukupnaCena = 0;
    }



    public void izbaciFilmIzKorpe(Film f){

        FilmNaStanju film = vk.pronadjiFilm(f);

        if (film == null)
            System.out.println(f + " nema na stanju");
        else {
            if (film.getKolicina() > 0) {
                korpa.remove(film);
                ukupnaCena -= film.getCena();
            }

        }

    }

}

