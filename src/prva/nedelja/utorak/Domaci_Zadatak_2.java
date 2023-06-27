package prva.nedelja.utorak;

import java.util.Scanner;

public class Domaci_Zadatak_2 {
    public static void main(String[] args) {

        //Domaci zadatak 2:
        //Napraviti program preko kog cete uneti naziv nekog cveta u konzoli(mogu biti Zumbul, Orhideja,
        //Bonsai I Ruze), I program ce vama ispisati naziv I cenu tog cveta.
        //Znamo da nam Ruza kosta 50 din.
        //Imamo Zumbul koji kosta 20 dinara vise nego Ruze.
        //Orhideje kostaju 2.5 puta vise nego Zumbul.
        //Bonsai kosta 3 puta vise nego Orhideja.
        //Obratiti paznju ukoliko se ne unese ispravan naziv cveta ili nepostojeci cvet.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime cveta: ");
        String cvet = sc.nextLine();

        double ruza = 50.0;
        double zumbul = ruza + 20;
        double orhideja = zumbul * 2.5;
        double bonsai = orhideja * 3;

        if (cvet.equals("Ruza")) {

            System.out.println("Imamo Ruze: " + ruza);
        }
        else if (cvet.equals("Zumbul")) {
            System.out.println("Imamo Zumbul: " + zumbul);
        }
        else if (cvet.equals("Orhideja")) {
            System.out.println("Imamo Orhideje: " + orhideja);
        }
        else if (cvet.equals("Bonsai")) {
            System.out.println("Imamo Bonsai: " + bonsai);
        }
        else {
            System.out.println("Pogresan unos ili nepostojeci cvet na lageru!");
        }



    }
}
