package cetvrta.nedeljaOOP.motorno.vozilo;

public class Automobil extends MotornoVozilo {

    public Automobil(double cena, int godinaProizvodnje) {
        super(4, cena, godinaProizvodnje);
    }


    @Override
    public int brojRezervnihGuma() {
        //return getBrojTockova() % 2 == 0 ? getBrojTockova() / 2 : getBrojTockova() / 2 + 1;
        /*int brojTockova = getBrojTockova();
        if (brojTockova % 2 == 0)
            return brojTockova / 2;
        else
            return brojTockova / 2 + 1;*/
        return 2;
    }


    /*
     * Ovu metodu sam interpretirao kao:
     * koliki treba da bude popust
     * */
    @Override
    public double popust() {
        int godiste = 2023 - getGodinaProizvodnje();
        if (godiste > 5)
            return getCena() * 0.3;
        return 0;
    }

    /*
     * Auto o.setCena(o.getCena() - o.popust());
     * */
}
