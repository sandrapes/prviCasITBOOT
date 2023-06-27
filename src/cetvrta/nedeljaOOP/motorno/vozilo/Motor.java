package cetvrta.nedeljaOOP.motorno.vozilo;

public class Motor extends MotornoVozilo {

    /*
     * MOTORI UVEK IMAJU 2 TACKO
     * */

    public Motor(double cena, int godinaProizvodnje) {
        super(2, cena, godinaProizvodnje);
    }

    @Override
    public int brojRezervnihGuma() {
        return 1;
    }

    @Override
    public double popust() {
        if (2023 - getGodinaProizvodnje() > 2)
            return 0.2 * getCena();
        return 0;
    }
}
