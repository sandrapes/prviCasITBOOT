package druga.nedelja.cetvrtak;

import java.util.Scanner;

public class Domaci_Cetvrtak_a_b {

    // Domaci Zadatak 1:
    //
    // a) Napraviti funkciju za ubacivanje celih brojeva u niz.
    // U parametru metoda cemo imati broj koji predstavlja velicinu niza,
    // unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.


    static void ubacivanjeElemenataNiza( int niz[] ) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < niz.length; i++) {

            System.out.println("Unesite element niza: ");
            int elementi = sc.nextInt();
            niz[i] = elementi;
        }
        System.out.print("Vas niz je: ");

        for (int i = 0; i < niz.length; i++) {

            System.out.print((niz[i]) + ", ");

        }

    }

    // b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni.

    static void neparniUParni (int niz[]) {

        System.out.print("Nakon pretvaranja neparnih elemenata u parne, Vas niz je: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 != 0) {
                niz [i] = niz[i] + 1;
            }
            System.out.print(niz[i] + ", ");
        }


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi duzinu niza: ");

        int duzina = sc.nextInt();

        int[] niz = new int[duzina];

        ubacivanjeElemenataNiza(niz);

        System.out.println();
        System.out.println();

        neparniUParni(niz);

        System.out.println();


    }
}
