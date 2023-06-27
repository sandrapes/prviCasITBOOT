package cetvrta.nedeljaOOP.zadatak17;

public class Ovca extends DomacaZivotinja {

    public Ovca(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
    }

    public Ovca(String naziv) {
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
        System.out.println("bmee");

    }
}
