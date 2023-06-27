package cetvrta.nedeljaOOP.zadatak17;

public class Krava extends DomacaZivotinja {

    public Krava(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
    }

    public Krava(String naziv) {
        super(naziv);
    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    public void leti() {
        System.out.println("Ne leti");

    }

    @Override
    public void pliva() {
        System.out.println("Ne pliva");

    }

    @Override
    public void oglasiSe() {
        System.out.println("muuu");

    }
}
