package treca.nedeljaOOP.petak.domaci;

public class SefSmene extends Radnik {

    private double nedeljniBonus;

    public SefSmene(String ime, double brojOdradjenihSati, double satnica, double nedeljniBonus) {
        super(ime, brojOdradjenihSati, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public double ukupnoZaradjeno() {
        return super.ukupnoZaradjeno() + nedeljniBonus;
    }

    @Override
    public boolean daLiJeNaOdmoru() {
        if (getBrojOdradjenihSati() >= 50) {
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        String s = super.toString() + " kao i nedeljni bonus " +  nedeljniBonus;
        return s;
    }

}







