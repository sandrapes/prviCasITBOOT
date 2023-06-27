package prva.nedelja.utorak;

import java.util.Scanner;

public class Zadatak_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
        //Ispisati poruku:
        //- "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
        //- "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu
        //Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"

        System.out.println("Unesite cenu artikla");
        double cenaArtikla = sc.nextDouble();

        System.out.println("Unesite raspolozivo stanje racuna");
        double raspolozivoStanje = sc.nextDouble();

        if (raspolozivoStanje >= cenaArtikla) {
            System.out.println("Kupili ste artikal");
            raspolozivoStanje -= cenaArtikla;
        }
        else {
            System.out.println("Ne mozete kupiti artikal");
        }

        System.out.println(" Preostalo stanje na racunu: " + raspolozivoStanje);





    }
}
