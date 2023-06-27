package prva.nedelja.vezbanje;

public class Automat_Za_Banku {

    public static void main(String[] args) {

        /*2.Automat za banku
        Treba kreirati program za automat za banku.
                Prvo se unosi raspolozivo stanje korisnika. Zatim se korisniku
        ispisuju 4 opcije:
        "1.Uvid u stanje"
        "2.Podizanje gotovine"
        "3.Uplata novca na racun"
        "4.Izlaz"
        Korisnik tada unosi neki broj [1-4] i u zavisnosti od unetog broja se radi:
        -1. Ispisuje se raspolozivo stanje racuna. Zatim se ponovo ispisuju
        gornje 4 opcije i omogucava se njihov ponovni izbor.
                -2. Od korisnika se trazi da unese zeljenu svotu.
        --Ukoliko korisnik ima sredstava na racunu,
                oduzima mu se ta svota i ponovo se ispisuju 4 opcije i omogucava
        se njih ponovni izbor.
        --Ukoliko korisnik nema dovoljno sredstava na racunu,
        ispisuje se poruka "Nemate dovoljno sredstava na racunu" i ponovo se
        ispisuju 4 opcije i omogucava se njihov ponovni izbor
                -3. Od korisnika se trazi da unese zeljenu svotu i ta zeljena svota se dodaje
        na racun korisnika. Zatim se ponovo ispisuju gornje 4 opcije i omogucava
        se njihov ponovni izbor.
        -4. Ispisuje se krajnje raspolozivo stanje racuna i zavrsava se program.
        -Inace. Ispisuje se poruka "Nevalidan opcija" i ponovo se
        ispisuju 4 opcije i omogucava se njihov ponovni odabir.
                ------------------------------------------------------------------------------------
        Primer:
        Input (>) /Output:
> 1200.0
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 1
        1200.0
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 2
                > 3000.0
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 1
        9000.0
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > -15
        "Nevalidna opcija"
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 3
                > 100
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 1
        9100.0
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 2
                > 10000.12
        "Nemate dovoljno sredstava na racunu"
        1. Uvid u stanje
        2. Podizanje gotovine
        3. Uplata novca na racun
        4. Izlaz
                > 4
        9100.0

         */




    }
}
