package cetvrta.nedeljaOOP.zadatak17;

public class Kokoska extends DomacaZivotinja {

    public Kokoska(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
    }

    public Kokoska(String naziv) {
        super(naziv);
    }


    @Override
    public void leti() {
        System.out.println("Ne leti");

    }

    @Override
    public void oglasiSe() {
        System.out.println("Kukuriku");

    }

    @Override
    public boolean daLiSeJedem() {
        return true;
    }

    @Override
    public void pliva() {
        System.out.println("Ne pliva");

    }
}
