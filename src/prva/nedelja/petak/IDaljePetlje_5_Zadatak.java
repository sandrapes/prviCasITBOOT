package prva.nedelja.petak;

import java.util.Scanner;

public class IDaljePetlje_5_Zadatak {

    public static void main(String[] args) {

        //5. Korisnik unosi double brojeve sve dok ne unese 0.0. Izracunati zbir svih unetih brojeva.

        Scanner sc = new Scanner(System.in);

        double unos = sc.nextDouble();
        double zbir = 0;

        while (unos != 0.0 ) {

            zbir += unos;
            unos = sc.nextDouble();

        }
        System.out.println(zbir);





    }
}
