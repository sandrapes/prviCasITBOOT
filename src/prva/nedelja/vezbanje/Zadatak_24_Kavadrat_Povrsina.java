package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_24_Kavadrat_Povrsina {
    public static void main(String[] args) {

        //24.* Izracunati sumu povrsina svih kvadrata koji imaju celobrojne stranice cija je duzina manja od 200.

        int sumaPovrsine = 0;

        for (int i = 1; i < 200; i++) {

            sumaPovrsine += i * i;
        }


            System.out.println(sumaPovrsine);



        System.out.println("======================================================" );

        // unesi broj kvadrata pa izracunaj sumu povrsine

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj kvadrata: ");

        int brojKvadrata = sc.nextInt();

        int suma = 0;

        for (int i = 0; i < brojKvadrata; i++) {
            suma += i * i;

        }
        System.out.println("Suma povrsine unetih kvadrata je: " + suma);




    }
}
