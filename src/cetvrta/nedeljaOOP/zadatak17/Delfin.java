package cetvrta.nedeljaOOP.zadatak17;

public class Delfin extends DivljaZivotinja{

    public Delfin(String naziv, int brojNogu, String staniste) {
        super(naziv, brojNogu, staniste);
    }

    @Override
    public boolean daLiSamOpasna() {
        return false;
    }

    @Override
    public void leti() {
        System.out.println("Ne leti");
    }

    @Override
    public void pliva() {
        System.out.println("Pliva");

    }

    @Override
    public void oglasiSe() {
        System.out.println("<3");

    }
}
