package druga.nedelja.sreda;

import java.util.Scanner;

public class Slagalica_Zadatak_a {

    public static void main(String[] args) {

        // 1.Slagalica za n igraca
        //TV emisija Slagalica koja se emituje na RTS 1 je promenila svoj format. Naime,
        //sada je moguce da u jednoj emisiju ucestvuje proizvoljan broj takmicara. Potrebno
        //je napisati novi program za deklarisanja pobednicke reci.
        //Korisnik unosi reci koje su ucesnici dobili u 1. igri emisije sve dok se ne unese
        //rec sacinjena samo od jedne tacke (tj. string "."). Na standardnom izlazu treba
        //ispisati koja je pobednicka rec, tj. koja rec je najduza, kao i broj osvojenih
        //poena za datu rec. Ukoliko ima vise pobednickih reci ispisati:
        //a) prvu koja se unela
        //b) poslednju koja se unela
        //Broj osvojenih poena se racuna tako sto se za svako slovo u pobednickoj reci
        //dodeli 2 poena pobedniku.
        //------------------------------------------------------------------------------------
        //Primer 1a)
        //Input:
        //"Slagalica" "JE" "super" "kvIZ"
        //Output:
        //"Slagalica"
        //18
        //Primer 1b)
        //Input:
        //"Slagalica" "JE" "super" "kvIZ"
        //Output:
        //"Slagalica"
        //18
        //Primer 2a)
        //Input:
        //"Ovi" "Zadaci" "Uopste" "Nisu" "Toliko" "Teski" "Kada" "Malo" "Razmis" "lite" "O" "Njima"
        //Output:
        //"Zadaci"
        //12
        //Primer 2b)
        //Input:
        //"Ovi" "Zadaci" "Uopste" "Nisu" "Toliko" "Teski" "Kada" "Malo" "Razmis" "lite" "O" "Njima"
        //Output:
        //"Razmis"
        //12


        /*

            Korisnik unosi reci  sve dok se ne unese
            rec sacinjena samo od jedne tacke (tj. string ".").
            Na standardnom izlazu treba
            ispisati koja rec je najduza, kao i broj osvojenih
            poena za datu rec. Ukoliko ima vise pobednickih reci ispisati:
            a) prvu koja se unela (>)
            b) poslednju koja se unela (>=)
            Broj osvojenih poena se racuna tako sto se za svako slovo u pobednickoj reci
            dodeli 2 poena pobedniku.
        *
        * */
            // "Ja" "volim" "programiranje" -> "programiranje" -> 26
            // "ja" "volim" "petak" -> a) "volim" b) "petak" -> 10

            /*
             * Delimo zadatak na 3 manja zadtka
             * I - omoguciti unos sve dok se ne unese "."
             * II - naci najduzu rec
             * III - izracunati broj poena
             *
             * */

            // "Ovo su vise reci" <- next()
            // vidim da je "najduza rec" <==> "maximalan broj"
            Scanner sc = new Scanner(System.in);
            //int max = Integer.MIN_VALUE;
            String najduzaRec = "";//prazana rec
            while (true){
                String rec = sc.next();
                if (rec.equalsIgnoreCase("."))
                    break;
                //Pitam se da li je uneta rec duza od najduze do sada.
                if (rec.length() > najduzaRec.length()){
                    najduzaRec = rec;
                }
            }
            System.out.println("Najduza rec je: " + najduzaRec);
            System.out.println("br poena: " + najduzaRec.length()*2);

        }


    }

