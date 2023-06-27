package druga.nedelja.cetvrtak;

import java.util.Scanner;

public class Funkcije_2 {


    static int povrsina(int stranica1, int stranica2, String poruka){
        System.out.println(poruka);
        return stranica1 * stranica2;
    }

    public static void main(String[] args) { //Ovo je takodje funkcija
        /*
         * Zadatak:
         * Korisnik unosi duzine pravouganika
         * Napisati funkcioju koja vraca povrsinu tog pravougaonika
         * */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //nextInt() je funkcija sa 0 argumenata
        int b = sc.nextInt();

        int P = povrsina(a, b, "Ovo je neka poruka");
        System.out.println(P);

    }
}
