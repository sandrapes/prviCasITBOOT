package druga.nedelja.vezbanjeZaTest;

import java.util.Scanner;

public class NizObrnutiRedosled_nejasan {

    static void obrniRedosled (int[] niz) {

        int[] niz1 = new int[niz.length];
        
        for (int i = niz.length -1; i >= 0; i--) {
            niz1[i] = niz[i];
            System.out.println(niz1[i] + " ");
        }
        

    }


    // b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

    static void ispisiSvakiDrugi (int[] niz) {

        for (int i = 1; i < niz.length; i += 2) {
            System.out.println(niz[i]);
        }

        }


        static void unesiNiz (Scanner sc) {

        int duzina = sc.nextInt();

            System.out.println("Unesite elemente niza: ");

            int[] niz = new int[duzina];

            for (int i = 0; i < duzina; i++) {

                int elementi = sc.nextInt();
                niz[i] = elementi;

            }

            for (int i = 0; i < niz.length; i++) {
                System.out.println(niz[i]);

            }


        }

        //b) Napraviti funkciju koja vraca sumu prosledjenog niza.


    static int sumaNiza (int[] niz) {

        int suma = 0;

        for (int i = 0; i < niz.length; i++) {

            suma += niz[i];

        }
        return suma;


    }

    // b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.


    static void ispisiSvakiTreciObrnuti (int[] niz) {

        for (int i = niz.length -1; i >= 0 ; i -= 3) {
            System.out.println(niz[i]);

        }

    }

    // 7. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.

    static void neparniBrojeviNiza (int[] niz) {

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] % 2 != 0 )
                System.out.println(niz[i]);

        }

    }

// 9. Napisati funkciju koja vraca najveci element niza.

    static int najveciElement (int[] niz) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max)
                max = niz[i];
        }
        return max;

    }

    // 9. Napisati funkciju koja vraca najmanji element niza.

    static int najmanjiElement (int[] niz) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min)
                min = niz[i];
        }
        return min;

    }


    // 11. Napisati funkciju koja duplira sve elemente niza.


    static void duplirajSvakiElement (int[] niz) {

        for (int i = 0; i < niz.length; i++) {
            niz[i] += niz[i];
            System.out.println(niz[i]);
        }


    }


    /// 12. Napisati funkciju koja sabira 2 niza iste duzine element po element.
    // (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)


    static int[] saberiDvaNiza (int[] niz1, int[] niz2) {

        int[] noviNiz = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[i] + niz2[i];

        }

        return noviNiz;

    }

    static void stampajNiz (int[] niz) {

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }


    }


    // 13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.

    static int[] nadovezivanjeNiza (int[] niz1, int[] niz2) {

        int[] noviNiz = new int[niz1.length + niz2.length];

        for (int i = 0; i < niz1.length; i++) {

            noviNiz[i] = niz1[i];

        }

        for (int i = niz1.length; i < noviNiz.length; i++) {
            noviNiz[i] = niz2[i - niz1.length];

        }
        return noviNiz;

    }







     
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] niz = {32, 43, 2, 26, 4, 13, 45, 17};

        int[] niz2 = {33, 3, 21, 0, 4, 1, 1, 2};
        obrniRedosled(niz);

    }

}
