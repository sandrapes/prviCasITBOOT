package druga.nedelja.sreda;

public class Napredna_For_Petlja {

    public static void main(String[] args) {
        /*
         * Foreach - enhanced for loop
         * "Za svaki" - ...
         *
         * for (<tip> <identifikator> : <niz|kolekciju|bilo sta sto je iterabilno>){
         *       //code
         * }
         *
         * int[] niz = ...
         * for (int element : niz){
         *   ....
         * }
         *
         * */

        int[] niz = {1, 2, 3, 4, 5};
        //Ispisati sve elemente niza

        //I nacin - obican for

        for (int i = 0; i < niz.length; i++){
            System.out.print(niz[i] + " ");
        }
        System.out.println();

        //II nacin - napredni for
        for (int element : niz){
            System.out.print(element + " ");
        }
        System.out.println();

        //U cemu je razlika? Da li su ekvivalentni?
        /*
         * Razlika je u tome sto u obicnom for-u imamo i brojac indexa.
         * Za svaki zadatak gde nam je potrebno ili da znamo na kom
         * smo tacno indeksu ili da ne idemo element-po-element nije
         * nam dovoljna foreach petlja
         * Zakljucak
         * For je nadskup foreach petlje, tjs for je sira.
         *
         * */

    }
}

