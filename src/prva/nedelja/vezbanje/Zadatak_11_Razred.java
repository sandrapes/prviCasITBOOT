package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_11_Razred {

    public static void main(String[] args) {

        // 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
        //	"Dobrodosao u {x}. razred, {ime} {prezime}",
        //	pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
        //    poruku od:
        //	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

        Scanner sc = new Scanner(System.in);

        String ime = sc.nextLine();
        String prezime = sc.nextLine();
        int godinaRodjenja = sc.nextInt();

        int godine = 2023 - godinaRodjenja;
        int razred = godine - 6;

        if (razred < 1)
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        else if ( razred > 12)
            System.out.println( ime + prezime + " je zavrsio skolu.");
        else if (razred >= 1 && razred <= 12) {
            System.out.println("Dobrodosao u " +  razred + "." + "razred" + ", " + ime + " " + prezime);}
        }




    }

