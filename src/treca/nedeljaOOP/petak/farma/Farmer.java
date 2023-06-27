package treca.nedeljaOOP.petak.farma;

import java.util.ArrayList;

public class Farmer {

    /* 2. Klasa Farmer koja opisuje farmera:
            * - Ime
     * - Prezime
     * - broj godina
     * - Listu zivotinja.
            *
            * -Napraviti sve kontrusktore i gettere i settere
     *
             * -toString() metod:
            * <ime> <prezime> <brGodina> ima zivotinje:
            * zivotinja1.toString()
            * ...
            * zivotinjaN.toString()
            *
            *
            * -Napisati metode:
            * 1. dodajZivotinju koja dodaje zivotinju farmeru
     * 2. oduzmiZivotinju koja oduzima neku zivotinju farmeru
     * 3. preborjZivotinje koja vraca broj zivotinja koje farmer ima
     * 4. kolikoMozeZaraditi koja vraca najveci mogci broj koji farmer moze da zaradi kada prodaje zivotinje
     *
             *
             * */

        private String ime;
        private String prezime;
        private int brojGodina;
        private ArrayList<Zivotinja> zivotinje;
        private double novac;

        public Farmer(String ime, String prezime, int brojGodina, ArrayList<Zivotinja> zivotinje, double novac) {
                this.ime = ime;
                this.prezime = prezime;
                this.brojGodina = brojGodina;
                this.zivotinje = zivotinje;
                this.novac = novac;
        }

                ////ovo je drugi nacin da se ispise niz (...) da ne moramo da ubacujemo listu kao gore nego samo ispisujemo
        // zivotinje i on to postavlja kao listu
        public Farmer(String ime, String prezime, int brojGodina, double novac, Zivotinja ... zivotinje){
                this.ime = ime;
                this.prezime = prezime;
                this.brojGodina = brojGodina;
                this.novac = novac;
                this.zivotinje = new ArrayList<>();
                for(Zivotinja z : zivotinje)
                        this.zivotinje.add(z);
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

        public ArrayList<Zivotinja> getZivotinje() {
                return zivotinje;
        }

        public void setZivotinje(ArrayList<Zivotinja> zivotinje) {
                this.zivotinje = zivotinje;
        }

        public double getNovac() {
                return novac;
        }

        public void setNovac(double novac) {
                this.novac = novac;
        }


        public void dodajZivotinju(Zivotinja z){

                zivotinje.add(z);
        }

        public void oduzmiZivotinju(Zivotinja z){
                novac += z.cenaZivotinje();
                zivotinje.remove(z);
        }

                /// ovo je samo drugi nacin da oduzmemo zivotinju, nije bitno
        public void oduzmiZivotinju(String vrsta, int brojNogu, double kilaza){
                for(Zivotinja z : zivotinje){
                        if (z.getVrstaZivotinje().equalsIgnoreCase(vrsta) && z.getKilaza() == kilaza && z.getBrojNogu() == brojNogu){
                                novac += z.cenaZivotinje();
                                zivotinje.remove(z);
                                // break;// za samo prvu pronadjenu zivotinju
                        }
                }
        }

        public int prebrojZivotinje(){

                return zivotinje.size();
        }

        public double kolikoMozeZaraditi(){
                double sum = 0;
                for(Zivotinja z : zivotinje)
                        sum += z.cenaZivotinje();
                return sum;
        }



        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(ime).append(" ").append(prezime).append(" ").append(brojGodina).append(" ima zivotinje:\n");
                for(Zivotinja z : zivotinje)
                        sb.append(z.toString()).append("\n");
                return sb.toString();
        }





}
