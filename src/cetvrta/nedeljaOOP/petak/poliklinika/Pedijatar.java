package cetvrta.nedeljaOOP.petak.poliklinika;

import java.util.ArrayList;

public class Pedijatar extends Lekar{


        private void izbaciStarijeOd18(){
            for (int i = 0; i < getPacijenti().size(); i++) {
                if (getPacijenti().get(i).getBrojGodina() > 18){
                    getPacijenti().remove(i);
                    i--;
                    setBrojPacijenta(getBrojPacijenta() - 1);
                }
            }
        }

        public Pedijatar(String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenta) {
            super(ime, prezime, pacijenti, brojPacijenta);
            setBrojPacijenta(normirajPacijente(brojPacijenta, 200));
            normirajListuPacijenata(200);
            izbaciStarijeOd18();
        }

        public Pedijatar() {
        }

        @Override
        public boolean prihvati(Pacijent p) {
            if (p.getBrojGodina() <= 18 && getBrojPacijenta() < 200){
                getPacijenti().add(p);
                setBrojPacijenta(getBrojPacijenta() + 1);
                return true;
            }
            return false;
        }

        @Override
        public double plata() {
            double plata = getBrojPacijenta() * 300;
            for(Pacijent p : getPacijenti()){
                if (p.getBrojGodina() <= 5)
                    plata += 100;
            }
            return plata;
        }
}
