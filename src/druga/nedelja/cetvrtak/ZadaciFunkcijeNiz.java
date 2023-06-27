package druga.nedelja.cetvrtak;

import java.util.Scanner;

public class ZadaciFunkcijeNiz {

    static void ispisiNizCelihBrojeva(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);

        }
        System.out.println();
    }

    static void ispisiNizRealnihBrojeva(double[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);

        }
        System.out.println();
    }

    static void ispisiNizBooleana(boolean[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);

        }
        System.out.println();
    }

    static void ispisiNizStringova(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);

        }
        System.out.println();
    }

    static void ispisiNizKaraktera(char[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);

        }
        System.out.println();
    }


    static int zbirBrojevaNizaCelihBrojeva(int[] niz) {

        int zbir = 0;

        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
            zbir += niz[i];

        }
        return (zbir);

    }


    public static void main(String[] args) {

        /// /*
        //    * Malo obradjujemo nizove:
        //    * I Napisati funkcije koje ispisuju nizove.
        //    *   Za svaki tip niza napisati posebnu funkciju koja ga ispisuje (int[], doulbe[], boolean[], String[], char[])
        //    *
        //    * II Napisati funkcije koje racunaju (vracajuScanner sc = new Scanner(System.in);)
        //    *    zbir brojeva zadataog niza (int[], double[])
        //    *
        //    * III Napisati funkciju koja racuna prosek double niza
        //    *
        //    * IV Napisati funkciju koja kreira niz celih brojeva
        //    *
        //    * */


        int[] niz = {1, 2, 4, 6, 55, 47};

        zbirBrojevaNizaCelihBrojeva(niz);





    }
}
