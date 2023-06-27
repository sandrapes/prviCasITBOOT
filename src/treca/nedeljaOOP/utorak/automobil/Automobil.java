package treca.nedeljaOOP.utorak.automobil;

public class Automobil {

    /// Napraviti klasu Automobil koja kao atribute ima marku, boju, godina proizvodnje i cenu.
    //1.Napraviti metodu koja ce automobilu starijem od 20 godina smanjiti cenu za 20%.
    //2.Kreirati metodu koja ce svakom automobilu marke BMW promeniti boju u belu.
    //3.Prikazati rezultujuce objekte pomocu toString().


    String marka;
    String boja;
    int godProizvodnje;
    int cena;

    public Automobil (String marka, String boja, int gP, int cena) {
        this.marka = marka;
        this.boja = boja;
        this.godProizvodnje = gP;
        this.cena = cena;


    }

    public void cenaZa20P () {

        if (2023 - this.godProizvodnje > 20) {
            this.cena = cena - (cena * 20 / 100);
        }


    }

    public void bmwBoja () {

        if (this.marka.equalsIgnoreCase("BMW")) {
            this.boja = "bela";
        }



    }

    @Override
    public String toString() {
        return "Automobil marke " + marka + ", boje " + boja + ", godista " + godProizvodnje + " kosta " + cena;

    }
}
