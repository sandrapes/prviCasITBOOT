package treca.nedeljaOOP.utorak.domaci.autoskola;

public class Autoskola {

    /// Napraviti klasu AutoSkola koja ima atribute za naziv, broj ljudi u autoskoli, cenu polaganja i
    //tip vozila za koje se polaze.
    //1) Napraviti metodu koja ce dati svima koji polazu za motor 50% popusta od cene polaganja.
    //2) Napraviti metodu koja ce nam vratiti koliko grupa ce imati Auto-skola ako znamo da
    //grupa mora imati bar petoro ljudi.
    //3) Ukoliko korisnik zeli da polaze za Autobus, ispisati poruku da to nije moguce u ovom
    //trenutku, u suprotnom ispisati da je polaganje moguce.
    //4) Sve rezultujuce objekte ispisati pomocu toString().

    String naziv;
    int brojLjudi;
    int cenaPolaganja;
    String tipVozila;

    public Autoskola (String s, int n, int a, String b) {
        this.naziv = s;
        this.brojLjudi = n;
        this.cenaPolaganja = a;
        this.tipVozila = b;


    }


    public void motorPopust() {
        if (tipVozila.equalsIgnoreCase("motor"))
            cenaPolaganja = cenaPolaganja / 2;

    }

    public int brojGrupa() {

        return brojLjudi/5;

    }

    public void autobusPolaganje() {

        if (tipVozila.equalsIgnoreCase("autobus")) {
            System.out.println("Zao nam je, polaganje za autobus nije moguce u ovom trenutku.");
        }
        else
            System.out.println("Polaganje za " + tipVozila + " je moguce.");
    }

    @Override
    public String toString() {
        brojGrupa();
        return "Autoskola: " + naziv + '\n' +
                "Broj ljudi koji pohadja nastavu: " + brojLjudi + '\n' +
                "Nastava ce biti odrzavana po grupama od najmanje petoro clanova, a broj grupa je: " + brojGrupa() + '\n' +
                "Vi biste zeleli da polazete za: " + tipVozila;


    }


}
