package treca.nedeljaOOP.petak.nasledjivanje;

import java.util.Objects;

public class Osoba {

        private String ime;
        private String prezime;
        private int brojGodina;

        public Osoba(String ime, String prezime, int brojGodina) {
            this.ime = ime;
            this.prezime = prezime;
            this.brojGodina = brojGodina;
        }

        public Osoba() {
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
        public boolean equals(Object o) {
            if (this.hashCode() == o.hashCode()) {
                if (this == o) return true;
                if (!(o instanceof Osoba osoba)) return false;
                return brojGodina == osoba.brojGodina && Objects.equals(ime, osoba.ime) && Objects.equals(prezime, osoba.prezime);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ime, prezime, brojGodina);
        }

        @Override
        public String toString() {
            return ime + " " + prezime + " " + brojGodina;
        }
    }

