package druga.nedelja.sreda;

import java.util.Scanner;

public class Domaci_1 {

    public static void main(String[] args) {

        // Domaci Zadatak 1:
        //
        //Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = sc.nextLine();

        String[] niz = {"Milan", "Natalija", "Marko", "Marko", "Tijana", "Milan", "Tijana", "Milan", "Milica", "Stefan"};

        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
            if (ime.equalsIgnoreCase(niz[i]))
                brojac++;

        }
        if (brojac == 1)
        System.out.println("Ime " + ime + " se ponavlja jednom.");
        else if (brojac == 0)
            System.out.println("Ime " + ime + " ne postoji u nizu");
        else
            System.out.println("Ime " + ime + " se ponavlja " + brojac + " puta.");












    }
}
