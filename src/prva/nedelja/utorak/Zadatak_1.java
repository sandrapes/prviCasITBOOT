package prva.nedelja.utorak;

import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Korisnik unosi dva cela broja a i b; <- napravi int a, b; sc.nextInt();
         * "Oba su pozitivna"; ako su oba broja pozitivna
         * "Oba su negativna"; ako su oba broja negativna
         * "Jedan je pozitivan, a drugi negativan", ako je jedan pozitivan, a drugi negativan
         * */


        System.out.println("Unesite neki broj: ");
        int a = sc.nextInt();

        System.out.println("Unesite neki broj: ");
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("Oba broja su pozitivna");
        } else if (a < 0 && b < 0) {
            System.out.println("Oba broja su negativna");
        } else {
            System.out.println("Jedan broj je pozitivan, a drugi negativan");


        }


        if (a > 0) {
            if (b > 0) {
                System.out.println("Oba broja su pozitivna");
            }
            else {
                System.out.println("Jedan je pozitivan, a drugi negativan");
            }
        } else {
            if (a < 0 ) {
                if (b < 0) {
                    System.out.println("Oba broja su negativna");
                }
                else {
                    System.out.println("Jedan je pozitivan, a drugi negativan");
                }
            }
        }





    }





    }


