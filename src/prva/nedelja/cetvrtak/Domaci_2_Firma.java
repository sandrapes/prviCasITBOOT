package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Domaci_2_Firma {
    public static void main(String[] args) {

        //Domaci Zadatak 2:
        // Napraviti program gde cete uneti pomocu Scanner-a neki broj koji predstavlja novcano stanje firme.
        //        Zatim uneti broj radnika u toj firmi. Svakom radniku mora biti isplacena plata od 100 din npr. Od
        // ukupne svote novca treba oduzeti ukupno para koliko se isplacuje radnicima, i istampati vrednost
        //novca koja preostaje firmi (Primer u zadatku uradjen da je plata 100) (Odaberite svoje vrednosti).

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite novcano stanje firme:");
        int novcanoStanjeFirme = sc.nextInt();

        System.out.println("Broj zaposlenih u firmi:");
        int brojRadnika = sc.nextInt();

        int isplataPoRadniku = 200;

        int i = 1;

        while (i <= brojRadnika) {

            novcanoStanjeFirme -= isplataPoRadniku;
            i++;

        }

        if (novcanoStanjeFirme < 0) {

            System.out.println("Firma nema budzet da isplati radnike");
        } else

            System.out.println("Kad svima isplati platu, firmi ostaje: " + novcanoStanjeFirme);




    }
}












