package druga.nedelja.petak;

import java.util.Scanner;

public class Zadaci_Funkcije_Nizovi {

    // 1. Napisati funkciju koja vraca najmanji element niza celih brojeva

    static int najmanjiElementNiza (int[] niz) {

        int najmanji = Integer.MAX_VALUE;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] < najmanji)
                najmanji = niz[i];

        }
        return najmanji;
    }

    // 1. Napisati funkciju koja vraca najveci element niza celih brojeva

    static int najveciElementNiza (int[] niz) {

        int najveci = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] > najveci)
                najveci = niz[i];

        }
        return najveci;
    }

    //3. Napisati funkciju koja prima dva niza celih brojeva i vraca niz dobijen
    //*    nadovezivanje drugog niza na prvi
    //*   Npr: [1, 2, 3, 4, 5], [6, 7] -> [1, 2, 3, 4, 5, 6, 7]

    static int[] nadovezivanjeNizova (int[] niz1, int[] niz2) {

        int[] noviNiz = new int[niz1.length + niz2.length];

        for (int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[i];
        }

        for (int i = niz1.length; i < noviNiz.length ; i++) {
            noviNiz[i] = niz2[i - niz1.length];

        }
        return noviNiz;


    }


    // 4. Napisati funkciju koja proverava da li prosledjeni ceo broj
    //*    se nalazi u proslednjenom nizu celih brojeva.

    static void daLiJeBrojUNizu (int[] niz) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");

        int broj = sc.nextInt();

        boolean b = true;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == broj) {
                b = true;
                break;
            }
            else
                b = false;
        }


        if (b)
            System.out.println("Broj se nalazi u nizu.");
        else
            System.out.println("Broj se ne nalazi u nizu.");

    }

    //ova poslednja na drugi nacin

        //Pretraga - Linearna pretraga

    static boolean pretraga(int[] a, int n){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        int[] niz1 = {15, 48, -1, 66, 2};
       int[] niz2 = {1, 2, -3};

       // Scanner sc = new Scanner(System.in);
        //System.out.println("Unesite duzinu niza: ");
        //int duzinaNiza = sc.nextInt();

        //int[] niz = new int[duzinaNiza];

        //for (int i = 0; i < duzinaNiza; i++) {
       //     int elementi = sc.nextInt();
       //     niz[i] = elementi;


       // }/
       // for (int i = 0; i < niz.length; i++) {
       //     System.out.println(niz[i]);

       // }

       // daLiJeBrojUNizu(niz);

        System.out.println(nadovezivanjeNizova(niz1, niz2));
        }





        //System.out.println(najmanjiElementNiza(niz1));
       // System.out.println(najveciElementNiza(niz2));
       // nadovezivanjeNizova(niz1, niz2);

    }




