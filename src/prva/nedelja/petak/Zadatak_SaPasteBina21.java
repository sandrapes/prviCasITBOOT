package prva.nedelja.petak;

import java.util.Scanner;

public class Zadatak_SaPasteBina21 {


    public static void main(String[] args) {

        //21.zadatak
        //korisnik unosi ceo broj n a zatim i n celih brojeva
        //ispisati najmanji i najveci

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prviUnos = sc.nextInt();
        int najmanji = prviUnos;
        int najveci = prviUnos;

        for (int i = 1; i < n - 1; i++) {

            int Unos = sc.nextInt();

            if (Unos < najmanji) {
                najmanji = Unos;
            }
            if (Unos > najveci) {
                najveci = Unos;
            }

        }
        System.out.println(najmanji);
        System.out.println(najveci);
/// int i = 1 mora da bude 1 jer ne znam zasto, ali jedino tad nece da me
        // tera da ispisujem brojeve opet. valjda zato sto imamo bar 1 unos????
    }
}
