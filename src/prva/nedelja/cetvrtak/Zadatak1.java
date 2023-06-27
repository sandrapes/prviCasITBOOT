package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

       // * 1. Napisati poruku "Jeste" ako je
        //        * zadati ceo broj deljiv sa 3
        //        * a poruku "Nije" ako nije.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

       // if (a % 3 == 0) {
       //     System.out.println("Jeste");
       // } else
       //     System.out.println("Nije");

        String odgovor = a % 3 == 0 ? "Jeste" : "Nije";






    }
}