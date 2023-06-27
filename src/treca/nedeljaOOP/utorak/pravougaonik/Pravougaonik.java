package treca.nedeljaOOP.utorak.pravougaonik;

public class Pravougaonik {

        /*
         * Napraviti klasu Pravougaonik za rad sa pravougaonicima.
         * Pravougaonik ima:
         * - stranicu a
         * - stranicu b
         *
         * - Napraviti konstruktore za ovu klasu
         * - Napisati metode obim i povrsina
         * - Napisati metodu koja serilizuje ovu klasu (pretvaranje klase u String)
         *  "Pravougaonika stranica <a> i <b> ima:"
         *  "Obim: <obim>"
         *   "Povrsinu: <povrsina>"
         *
         * */


        //Atributi
        int a;
        int b;

        public Pravougaonik(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public Pravougaonik() {
            this.a = 0;
            this.b = 0;
        }

        public Pravougaonik(int a) {
            this.a = a;
            this.b = a;
        }

        public int obim(){
            return 2*a + 2*b;
        }

        public int povrsina(){
            return a*b;
        }


        /*
         * Proces serilizacije - kreiranje Stringa od Klase
         * */
        //@Override //Anotacija
        public String toString() {
            String s1 = "Pravougaonik stranica " + a + " i " + b + "\n";// \n -> predji u novi red (kao da kliknemo ENTER)
            String s2 = "Obim: " + obim() + "\n";
            String s3 = "Povrsina: " + povrsina();
            return s1 + s2 + s3;
        }

}
