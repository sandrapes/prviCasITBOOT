package prva.nedelja.utorak;

import java.util.Scanner;

public class Zadatak_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //4.
        //Korisnik unosi ceo broj x. Ispisati apsolutnu vrednost broja x
        // (bez koriscenja ugradjenih matematickih funkcija)
        //Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost

        System.out.println("Unesite broj x: ");
        int x = sc.nextInt();


        if (x < 0) {
            x *= -1;
            System.out.println("x-u je promenjena vrednost");
                System.out.println(x);}
        else {
            System.out.println(x);
        }




    }
}
