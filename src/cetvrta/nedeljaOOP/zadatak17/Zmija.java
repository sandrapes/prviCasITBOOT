package cetvrta.nedeljaOOP.zadatak17;

public class Zmija extends DivljaZivotinja {

    public Zmija(String naziv, int brojNogu, String staniste) {
        super(naziv, brojNogu, staniste);
    }

    @Override
    public boolean daLiSamOpasna() {
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
        System.out.println("ssss");

    }
}
