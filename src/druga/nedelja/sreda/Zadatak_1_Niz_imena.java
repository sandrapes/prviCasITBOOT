package druga.nedelja.sreda;

public class Zadatak_1_Niz_imena {

    public static void main(String[] args) {

        //Zadatak 1: Definisati niz nekih imena, kao rezultat vratiti isti niz ali bez duplikata.

            /*
             * Definisati niz nekih imena, kao rezultat vratiti isti niz ali bez duplikata.
             * Kreiramo novi niz koji nema duplikate u sebi
             * */

            String[] niz = {"Nemanja", "Jovana", "Maja", "Jovana", "Maja",
                    "Vladimir",  "Vladimir", "Saska", "Nemanja", "Jovana"};


            /*
             * O uraditi ga sami na papiru
             * resenje = {"Nemanja", "Jovana", "Maja", "Vladimir", "Saska"}
             *
             * I odrediti koliko ima elmenata novi niz
             * II Nekako iz prvog niza ubaciti elemente u drugi niz, ali
             *    pazeci da se ne ubace isti elementi dva puta
             * */

            //I odredjivanje broja elemenata novog niza
            //Izbrisi sve duplikate

            for (int i = 0; i < niz.length; i++) {

                for (int j = i + 1; j < niz.length; j++) {
                    //System.out.println("(i, j) = " + i + ", " + j + ": -> " + niz[i] + " poredimo sa " + niz[j]);
                    if (niz[j].equalsIgnoreCase(niz[i])){
                        niz[j] = "";
                    }
                }
            }

        /*
        * String[] niz = {"Nemanja", "Jovana", "Maja", "", "",
                        "Vladimir",  "", "Saska", "", ""};
        *
        * */

            //Prebrojavamo koliko nemamo praznih niski = broj elemenata novog niza
            int brElemNovogNiza = 0;
            for(String s : niz){
                if (!s.equalsIgnoreCase("")){
                    brElemNovogNiza++;
                }
            }
            //System.out.println(brElemNovogNiza);

            String[] noviNizBezDuplikata = new String[brElemNovogNiza];

            //Zelim da napravim novi niz sa ovim brojem i da semstim niske koje nisu
            //"" u taj niz
            /*
             * [s1, "", s2, "", "", s3]
             * [s1, s2, s3]
             *
             * */

            int brojac = 0;

            for (int i = 0; i < niz.length; i++) {
                if (!niz[i].equalsIgnoreCase("")){
                    noviNizBezDuplikata[brojac] = niz[i];
                    brojac++;
                }
            }


            System.out.println("Novonastali niz je:");
            for(String s : noviNizBezDuplikata){
                System.out.print(s + " ");
            }
            System.out.println();

        }

}





