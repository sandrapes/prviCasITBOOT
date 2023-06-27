package cetvrta.nedeljaOOP.petak.poliklinika;

import java.util.ArrayList;

    public abstract class Lekar implements Comparable<Lekar>{


        private static int ID = 0;
        private int id;
        private String ime, prezime;
        private ArrayList<Pacijent> pacijenti;
        private int brojPacijenta; //potencijalno nepotrebno! (pacijenti.size());

        public Lekar(String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenta) {
            this.id = ID;
            ID++;
            this.ime = ime;
            this.prezime = prezime;
            this.pacijenti = pacijenti;
            this.brojPacijenta = brojPacijenta;
        }

        public Lekar() {
            this.id = ID;
            ID++;
            ime = prezime = "";
            pacijenti = new ArrayList<>();
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public ArrayList<Pacijent> getPacijenti() {
            return pacijenti;
        }

        public void setPacijenti(ArrayList<Pacijent> pacijenti) {
            this.pacijenti = pacijenti;
        }

        public int getBrojPacijenta() {
            return brojPacijenta;
        }

        public void setBrojPacijenta(int brojPacijenta) {
            this.brojPacijenta = brojPacijenta;
        }

        public int normirajPacijente(int brojPacijenata, int norma){
            if (brojPacijenata > norma)
                return norma;
            if (brojPacijenata < 0)
                return 0;
            return brojPacijenata;
        }

        public void normirajListuPacijenata(int norma){
            if (getPacijenti().size() > norma){
                //subList(n, m) -> vraca listu elemenata [n, m)
               // setPacijenti((ArrayList<Pacijent>) getPacijenti().subList(0, norma)); //od prvog do 201 pacijenta


                ArrayList<Pacijent> novaLista = new ArrayList<>();
                for (int i = 0; i < 200; i++) {
                    novaLista.add(pacijenti.get(i));
                }
                setPacijenti(novaLista);



                /*
                 * Alternativno, umesto sublist
                 *
                 * 1.Kreiramo novu praznu ArrayList<Pacijent>
                 * 2.Popunimo tu novu arrylistu sa prvih 200 pacijenata iz stare arrayListe
                 * for (int i = 0; i < 200; i++)
                 * ...
                 * 3. setPacijenti(nova arrayLista);
                 *
                 * */
            }
        }

        public abstract boolean prihvati(Pacijent p);

        public abstract double plata();

        @Override
        public int compareTo(Lekar o) { // <, ==, > - relacija poretka
            /*
             * -1 -> Lekar1 < Lekar2 ; ako ima manje pacijenata (od lekara o)
             * 0 -> Lekar1 = Lekar2; ako imaju isto pacijenata (od lekara o)
             * 1 -> Lekar1 > Lekar2; ako ima vise pacijenata (od lekara o)
             * ----
             *
             *
             * */
            if (brojPacijenta < o.getBrojPacijenta()){
                return -1;
            }
            else if (brojPacijenta == o.getBrojPacijenta())
                return 0;
            else
                return 1;
        }

        /*
         * toString()
         * "<id> <Ime> <Prezime> ima <brojPacijenata> pacijenata:
         * <Pacijent1>
         * ...
         * <Pacijentn>
         * */

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(" ").append(ime).append(" ").append(prezime)
                    .append(" ima ").append(brojPacijenta).append(" pacijenata:\n");
            for(Pacijent p : pacijenti)
                sb.append(p.toString()).append("\n");
            return sb.toString();
        }
}
