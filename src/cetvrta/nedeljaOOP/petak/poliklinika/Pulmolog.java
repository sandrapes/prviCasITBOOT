package cetvrta.nedeljaOOP.petak.poliklinika;
import java.util.ArrayList;

public class Pulmolog extends Lekar{

        public Pulmolog(String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenta) {
            super(ime, prezime, pacijenti, brojPacijenta);
            setBrojPacijenta(normirajPacijente(brojPacijenta, 100));
            normirajListuPacijenata(100);
        }

        public Pulmolog() {
        }

        @Override
        public boolean prihvati(Pacijent p) {
            if (getPacijenti().size() < 100){
                getPacijenti().add(p);
                setBrojPacijenta(getBrojPacijenta() + 1);//alternativno: setBrojPacijenata(getPacjinet().size());
                return true;
            }
            return false;
        }

        @Override
        public double plata() {
            return getBrojPacijenta() * 350;
        }
}
