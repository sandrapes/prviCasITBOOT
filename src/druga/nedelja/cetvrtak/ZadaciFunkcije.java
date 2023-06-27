package druga.nedelja.cetvrtak;

import java.util.Scanner;

public class ZadaciFunkcije {

    static int zbir(int broj1, int broj2, int broj3) {
        int zbir = broj1 + broj2 + broj3;
        return zbir;
    }

    static double proizvod(double broj1, double broj2, double broj3, double broj4) {
        double proizvod = broj1 * broj2 * broj3 * broj4;
        return proizvod;
    }

    static void duziString(String s1, String s2) {
        if (s1.length() > s2.length())
            System.out.println(s1);
        else
            System.out.println(s2);
    }






    public static void main(String[] args) {

        /*
         * 1. Napisati funkciju koja prima 3 cela broja i vraca njihov zbir
         * 2. Napisati funkciju koja prima 4 realna broja i vraca njihov proizvod
         * 3. Napisati funkciju koja prima 2 stringa i ispisuje duzi od njih
         * 4. Napisati funkciju koja ispisuje niz celih brojeva
         * */

        Scanner sc = new Scanner(System.in);

       // int a = sc.nextInt();
       // int b = sc.nextInt();
       // int c = sc.nextInt();

       // int sveZajedno = zbir(a, b, c);
        //System.out.println(sveZajedno);


        double a = 4.1;
        double b = 5.2;
        double c = 2.4;
        double d = 10.0;

        double total = proizvod(a, b, c, d);
        System.out.println(total);


        String prvi = "Ne znam neki string.";
        String drugi = "Ne znam neki drugi string.";

        duziString(prvi, drugi);



    }

}