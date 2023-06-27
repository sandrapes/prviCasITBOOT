package druga.nedelja.sreda;

import java.util.Scanner;

public class Zadatak_3_Imena_I_Skener {

    public static void main(String[] args) {

        // Zadatak 3: Definisati neki niz imena. Uneti ime preko Scannera koje ce vratiti
        // poruku ukoliko se uneto ime nalazi u nizu.

        String[] niz = {"Milena", "Ana", "Marija", "Natalija", "Milan", "Aleksa"};

        Scanner sc = new Scanner(System.in);

        String ime = sc.nextLine();

        boolean nekaTvrdnja = true;

        for (int i = 0; i < niz.length; i++) {

            if (ime.equalsIgnoreCase(niz[i])) {
                System.out.println("Uneto ime postoji u nizu.");
                nekaTvrdnja = false;
            }

        }

        if (nekaTvrdnja) {

            System.out.println("Uneto ime ne postoji u nizu.");
        }






    }
}
