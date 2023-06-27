package treca.nedeljaOOP.petak.nasledjivanje;

import java.util.ArrayList;
import java.util.Objects;

    public class Nastavnik extends Osoba{
        private ArrayList<Ucenik> ucenici;

        public Nastavnik(String ime, String prezime, int brojGodina, ArrayList<Ucenik> ucenici) {
            super(ime, prezime, brojGodina);
            this.ucenici = ucenici;
        }

        public Nastavnik(Osoba o, ArrayList<Ucenik> ucenici) {
            super(o.getIme(), o.getPrezime(), o.getBrojGodina());
            this.ucenici = ucenici;
        }

        public Nastavnik(Osoba o){
            super(o.getIme(), o.getPrezime(), o.getBrojGodina());
            this.ucenici = new ArrayList<>();
        }

        public Nastavnik(){
            super();
            //ucenici = null
        }

        public ArrayList<Ucenik> getUcenici() {
            return ucenici;
        }

        public void setUcenici(ArrayList<Ucenik> ucenici) {
            this.ucenici = ucenici;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Nastavnik nastavnik)) return false;
            if (!super.equals(o)) return false;
            return Objects.equals(ucenici, nastavnik.ucenici);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), ucenici);
        }
    }


