package cetvrta.nedeljaOOP.petak.poliklinika;

public class Pacijent {

        private String ime, prezime;
        private int brojGodina;

        public Pacijent(String ime, String prezime, int brojGodina) {
            this.ime = ime;
            this.prezime = prezime;
            this.brojGodina = brojGodina;
        }

        public Pacijent() {
            ime = prezime = "";
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public int getBrojGodina() {
            return brojGodina;
        }

        public void setBrojGodina(int brojGodina) {
            this.brojGodina = brojGodina;
        }

        @Override
        public String toString() {
            return ime + " " + prezime + " "  + brojGodina;
        }
}
