package prva.nedelja.vezbanje;

public class Iks_Oks {
    public static void main(String[] args) {

        //2. Iks-Oks
        //Napraviti igricu iks-oks.
        //Prilikom starta igrice ispisuje se 3x3 tabla oblika:
        //. . .
        //. . .
        //. . .
        //Zatim se trazi od korisnika da se unese pozicija u vidu dva broja gde zeli da se
        //stavi odgovarajuci znak i tada se ponovo iscrtava tabla sa odgovarajucim znakom
        //'x' ili 'o' ispisanim u zadato polje. Paziti da se igraci alterniraju!
        //Ukoliko korisnik unese poziciju koje je vec zauzeto ispisati poruku
        //"Polje je vec zauzeto, izaberite ponovo" i omoguciti ISTOM korisniku da bira
        //polje ponovo SVE DOK ne unese poziciju praznog polja!
        //Igra se zavrsava kada neki igrac pobedi ili nema vise slobodnih mesta.
        //Iscrtava se krajnje stanje table i ispisuje se poruka ko je pobedio:
        //- "Pobedio je X igrac"
        //- "Pobedio je O igrac"
        //- "Nereseno"
        //------------------------------------------------------------------------------------
        //Primer 1
        //Input (>) / Output:
        //. . .
        //. . .
        //. . .
        //> 1 1
        //x . .
        //. . .
        //. . .
        //> 2 2
        //x . .
        //. o .
        //. . .
        //> 1 3
        //x . x
        //. o .
        //. . .
        //> 3 3
        //x . x
        //. o .
        //. . o
        //> 1 2
        //x x x
        //. o .
        //. . o
        //"Pobedio je X igrac"
        //Primer 2
        //. . .
        //. . .
        //. . .
        //> 1 3
        //. . x
        //. . .
        //. . .
        //> 2 2
        //. . x
        //. o .
        //. . .
        //> 3 3
        //. . x
        //. o .
        //. . x
        //> 2 3
        //. . x
        //. o o
        //. . x
        //> 2 1
        //. . x
        //x o o
        //. . x
        //> 3 2
        //. . x
        //x o o
        //. o x
        //> 1 2
        //. x x
        //x o o
        //. o x
        //> 1 1
        //o x x
        //x o o
        //. o x
        //> 1 1
        //"Polje je vec zauzeto. Izaberite ponovo"
        //o x x
        //x o o
        //. o x
        //> 3 1
        //o x x
        //x o o
        //x o x
        //"Nereseno"



    }
}
