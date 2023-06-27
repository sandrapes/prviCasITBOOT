package cetvrta.nedeljaOOP.zadatak17;

public class Macka extends DomacaZivotinja{

    public Macka(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
    }

    public Macka(String naziv) {
        super(naziv);
    }

    @Override
    public boolean daLiSeJedem() {
        return false;
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
        System.out.println("nyaa");
    }
}
