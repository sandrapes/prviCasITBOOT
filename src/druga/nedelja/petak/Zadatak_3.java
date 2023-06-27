package druga.nedelja.petak;

public class Zadatak_3 {

///  3. Napisati funkciju koja prima dva niza celih brojeva i vraca niz dobijen
//    *    nadovezivanje drugog niza na prvi
//    *   Npr: [1, 2, 3, 4, 5], [6, 7] -> [1, 2, 3, 4, 5, 6, 7]

    public static int[] nadovezivanjeNiza (int[] niz1, int[] niz2) {

        int[] noviNiz = new int [niz1.length + niz2.length];


        for (int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[i];

        }
        for (int i = niz1.length; i < noviNiz.length; i++) {
            noviNiz[i] = niz2[i - niz1.length];
        }

        return noviNiz;

    }

    public static void stampaj (int[] niz) {

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i] + " ");
        }


    }

    public static void main(String[] args) {

        int[] niz1 = {12, 13, 5, 48, 56, 2};
        int[] niz2 = {1, 14, 6};


stampaj(nadovezivanjeNiza(niz1, niz2));
    }



}
