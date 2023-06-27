package cetvrta.nedeljaOOP.skola;

import java.util.ArrayList;

public class Gimnazijalac extends Ucenik{

    private String maturski;

    public Gimnazijalac(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, String maturski) {
        super(ime, prezime, brojGodina, ocene);
        if (brojGodina < 15 || brojGodina > 19)
            setBrojGodina(15);
        this.maturski = maturski;
    }

    public Gimnazijalac() {
        this.maturski = "";
    }

    public String getMaturski() {
        return maturski;
    }

    public void setMaturski(String maturski) {
        this.maturski = maturski;
    }



    @Override
    public double prosek() {
        double sum = 0;
        for (double o : getOcene()){
            if (o <= 2.0)
                return 1.0;
            sum += Math.max(o - 0.1, 1.0);
        }
        return sum;
    }
}
