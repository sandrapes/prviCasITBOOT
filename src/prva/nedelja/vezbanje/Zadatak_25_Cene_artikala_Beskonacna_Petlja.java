package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_25_Cene_artikala_Beskonacna_Petlja {

    public static void main(String[] args) {

        // 25.* Korisnik unosi cene artikala sve dok ne unese 0. Ispisati prosecnu vrednost artikala.

        Scanner sc = new Scanner(System.in);

        int suma = 0;

        while (true) {

            int cenaArtikla = sc.nextInt();

            if (cenaArtikla == 0) {
                break;
            }
            suma += cenaArtikla;
        }
        System.out.println(suma);
    }
}
