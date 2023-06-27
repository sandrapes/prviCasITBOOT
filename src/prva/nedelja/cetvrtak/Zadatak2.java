package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        // Korisnik unosi ocenu koju je djak
        // dobio na testu i treba ispisati poruku:
        //         * "Nedovoljan" ; 1
        //         * "Dovoljan" ; 2
        //         * ...
        //         * "Odlican" ; 5

        Scanner sc = new Scanner(System.in);


        System.out.println("Unesite ocenu: ");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Nedovoljan");
        } else if (a == 2) {
            System.out.println("Dovoljan");
        } else if (a == 3) {
            System.out.println("Dobar");
        } else if (a == 4) {
            System.out.println("Vrlo dobar");
        } else if (a == 5) {
            System.out.println("Odlican");
        } else {
            return;
        }
    }
}
