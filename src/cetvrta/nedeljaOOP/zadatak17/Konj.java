package cetvrta.nedeljaOOP.zadatak17;

public class Konj extends DomacaZivotinja{

    public Konj(String naziv, String ime, double kilaza, int brojNogu) {
        super(naziv, ime, kilaza, brojNogu);
    }

    public Konj(String naziv) {
        super(naziv);
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
    public boolean daLiSeJedem() {
        return false;
    }


    @Override
    public void oglasiSe() {
        System.out.println("pfff");

    }
}
