package treca.nedeljaOOP.petak.nasledjivanje;

import java.util.ArrayList;
import java.util.Objects;

    public class Ucenik extends Osoba{
        private double prosek;
        private ArrayList<Integer> ocene;

        public Ucenik(String ime, String prezime, int brojGodina, double prosek, ArrayList<Integer> ocene) {
            super(ime, prezime, brojGodina);
            this.prosek = prosek;
            this.ocene = ocene;
        }

        public Ucenik(Osoba o, double prosek, ArrayList<Integer> ocene){
            super(o.getIme(), o.getPrezime(), o.getBrojGodina());
            this.prosek = prosek;
            this.ocene = ocene;
        }

        public double getProsek() {
            return prosek;
        }

        public void setProsek(double prosek) {
            this.prosek = prosek;
        }

        public ArrayList<Integer> getOcene() {
            return ocene;
        }

        public void setOcene(ArrayList<Integer> ocene) {
            this.ocene = ocene;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Ucenik ucenik)) return false;
            if (!super.equals(o)) return false;
            return Double.compare(ucenik.prosek, prosek) == 0 && Objects.equals(ocene, ucenik.ocene);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), prosek, ocene);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ucenik " + super.toString() + " ima ocene:\n");
            if (ocene != null) {
                for (Integer o : ocene)
                    sb.append(o).append(" ");
            }
            else
                sb.append("Nema jos uvek ni jednu ocenu");
            return sb.toString();
        }
    }

