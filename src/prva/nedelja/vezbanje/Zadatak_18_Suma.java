package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_18_Suma {

    public static void main(String[] args) {

        // 18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
        // 19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double suma = 0;

        for (int i = 0; i < n ; i++) {
            double brojevi = sc.nextDouble();
            suma += brojevi;

        }

        System.out.println(suma);




    }
}
