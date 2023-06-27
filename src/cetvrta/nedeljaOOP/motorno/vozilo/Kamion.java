package cetvrta.nedeljaOOP.motorno.vozilo;

public class Kamion extends MotornoVozilo {

    public Kamion(int brojTockova, double cena, int godinaProizvodnje) {
        super(brojTockova, cena, godinaProizvodnje);
    }

    @Override
    public int brojRezervnihGuma() {
        return getBrojTockova() / 2;
    }

    @Override
    public double popust() {
        if (2023 - getGodinaProizvodnje() > 20)
            return getCena() * 0.5;
        return 0;
    }
}
