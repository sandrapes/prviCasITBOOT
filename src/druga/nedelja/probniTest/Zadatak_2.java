package druga.nedelja.probniTest;

import java.util.Arrays;

public class Zadatak_2 {

    //2. Napisati funkciju podeliPaSaberi koja prima niz celih brojeva parne
    //duzine, deli ga na dva jednaka dela i vraca niz dobijen sabiranjem ta dva niza
    //element-po-element.

    public static int[] podeliPaSaberi (int[] niz) {

        int[] niz1 = new int[niz.length/2];
        int[] niz2 = new int[niz.length/2];
        int[] konacniNiz = new int[niz1.length];

        System.out.println("Prvi niz je: ");
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = niz[i];
            System.out.print(niz1[i] + " ");
        }
        System.out.println();

        System.out.println("Drugi niz je: ");
        for (int i = 0; i < niz2.length; i++) {
            niz2[i] = niz[niz1.length + i];
            System.out.print(niz2[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < konacniNiz.length; i++) {
            konacniNiz[i] = niz1[i] + niz2[i];

        }

        return konacniNiz;



    }

    public static void stampajNiz (int[] niz) {

        System.out.println("Kad se prvi i drugi niz saberu dobijamo: ");
        for (int i = 0; i < niz.length; i++) {

            System.out.print(niz[i] + " ");

        }
    }


    public static void main(String[] args) {


        int[] niz = {1, 2, 5, 6, 4, 3, 1, 1};

        stampajNiz(podeliPaSaberi(niz));
    }





}
