package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_23_Brojevi_ImenaNijeMiJasanOvajPogledajOpetKakoSeRadi {

    public static void main(String[] args) {

        // 23.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika.
        // Ispisati "da" ako su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
        //	Npr:
        //	"Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
        //	"Branko", "Aleksandar", "Marko" -> "ne"
        //	"Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] nizImena = new String[n];

        sc.nextLine();

        for (int i = 0; i < nizImena.length; i++) {
            String elementi = sc.nextLine();
            nizImena[i] = elementi;


            }

        String s = "";

        for (int i = 1; i < nizImena.length; i++) {
            if (nizImena[i].equalsIgnoreCase(nizImena[i-1])) {
                s = "Da";
                break;
            }
            else
                s = "Ne";

        }

        System.out.println(s);



        }


    }

