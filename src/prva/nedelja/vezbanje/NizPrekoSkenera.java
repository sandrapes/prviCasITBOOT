package prva.nedelja.vezbanje;

import java.util.Scanner;

public class NizPrekoSkenera {
    public static void main(String[] args) {

        int[] nekiNiz = {12, 15, 19, 2, 8};

        System.out.println(nekiNiz[3]); // ovako mozemo da ispisemo individualne clanove niza

        System.out.println("\n ========================== \n");

        // unesi niz preko skenera, ovo je teze ali se radi sablonski

        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt(); // moramo da unesemo duzinu prvo

        double[] nizDoubleBrojeva = new double [duzinaNiza]; // onda ide ovaj deo, nzm tacno sta je, [] ovo oznacava niz

        //onda krece petlja

        for (int i = 0; i < nizDoubleBrojeva.length; i++) {

            System.out.println("Unesite "+ i + "-i element niza: " );

            double element = sc.nextDouble();
            nizDoubleBrojeva[i] = element ; // vidim da cesto gresis ovde ali ne znam tacno zasto, mora prvo niz od i da se napise
            // pa tek onda da je to jednako element, inace samo ispisuje 0.0. ne znam razlog za ovo, moram da pitam
            // mislim da je vise u fazonu ovaj nizDoubleBrojeva[i] postaje element

        }

        // onda ispisujemo niz

        for (int i = 0; i < nizDoubleBrojeva.length; i++) {

            System.out.print(nizDoubleBrojeva[i] + ", ");

        }








    }

}
