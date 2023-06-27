package prva.nedelja.utorak;

import java.util.Scanner;

public class Zadatak_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 3.
        //Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i
        // minimalnu potrebnu visinu za ulazak u luna park(double).
        //Ispisati poruku:
        //- "Dobro dososli" - ukoliko je korisnik strogo stariji od 16 godina ili visi (ili jednak) od 1.6m
        //- "Ne mozete prisustvovati luna parku" - ukoliko ima 15 ili manje godina i nije visi od 1.6m

        System.out.println("Unesite Vase godine: ");
        int godine = sc.nextInt();

        System.out.println("Unesite svoju visinu: ");
        double visina = sc.nextDouble();

        System.out.println("Minimalna potrebna visina je: ");
        double minimalnaPotrebnaVisina = sc.nextDouble();

        if (godine > 16 || visina >= minimalnaPotrebnaVisina ) {
            System.out.println("Dobro dosli!");
        }
        else {
            System.out.println("Ne mozete prisustvovati luna parku");
        }

    }
}
