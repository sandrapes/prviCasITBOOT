package prva.nedelja.utorak;

import java.util.Scanner;

public class Domaci_Zadatak_1 {
    public static void main(String[] args) {

        //Domaci Zadatak 1:
        //Napisati program koji ce racunati platu za unetu vrednost satnice i broja radnih sati.
        //Uneti satnicu i broj radnih sati preko konzole. Ukoliko je ukupna plata negativan broj,
        //ispisati neku poruku, u suprotnom samo ispisati ukupnu platu.

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti satnicu: ");
        int satnica = sc.nextInt();

        System.out.println("Uneti broj radnih sati: ");
        int brojRadnihSati = sc.nextInt();

        int plata = satnica * brojRadnihSati;

        if (plata < 0) {
            System.out.println("Zao nam je, nemate zaradu.");}
        else {
            System.out.println("Vasa plata je: " + plata);
        }


    }
}
