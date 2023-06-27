package pastebin.Prodavnica14;

import java.util.ArrayList;

public class Kupac {

    //Napisati klasu Kupac koji prosiruje klasu Osoba i ima atribute:
    //- Korpa korpa
    //- ArrayList<Namirnice> kupljeneNamirnice
    //- double novac
    //
    //Napisati konstruktor koji prima double n i postavlja novac na n, i kreira novu praznu korpu, i novu praznu ArrayListu kupljenih namirnica.
    //Ukoliko je n nepozitivan broj, postaviti ga na 100.
    //
    //Napisati sve gettere i settere
    //
    //Napisati metode:
    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice
    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.
    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.
    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    //7. cenaKrope - koja vraca ukupnu cenu korpe
    //8. kupi - koja kupuje sve namirnice iz korpe. Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
    //          "Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.
    //
    //Overridovati toString() metod na sledeci nacin:
    //"Kupac <ime> <prezime> <brGodina> ima u korpi:
    // <imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>
    // --------------------------
    // Od kupljenih namirnica ima:
    // <imeNamirnice1> | <brojKopijaNamirnice1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN>
    // Ukupna cena kupljenih namimirnica je je: <cenaKupljenih namirnica>

    private Korpa korpa;
    private ArrayList<Namirnica> kupljeneNamirnice;
    private double novac;

    public Kupac(Korpa korpa, ArrayList<Namirnica> kupljeneNamirnice, double novac) {
        this.korpa = korpa;
        this.kupljeneNamirnice = kupljeneNamirnice;
        this.novac = novac;
    }

    public Kupac(double n) {
        if (n < 0)
            this.novac = 100;
        else
            this.novac = n;
        this.korpa = new Korpa();
        this.kupljeneNamirnice = new ArrayList<>();
    }

    public Korpa getKorpa() {
        return korpa;
    }

    public void setKorpa(Korpa korpa) {
        this.korpa = korpa;
    }

    public ArrayList<Namirnica> getKupljeneNamirnice() {
        return kupljeneNamirnice;
    }

    public void setKupljeneNamirnice(ArrayList<Namirnica> kupljeneNamirnice) {
        this.kupljeneNamirnice = kupljeneNamirnice;
    }

    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice

    public void dodajUKorpu(Namirnica n){
        korpa.getNamirniceUKorpi().add(n);
        korpa.setCenaKorpe(korpa.getCenaKorpe() + n.getCena());

        //koje od ova dva?

       // korpa.dodajUkorpu(n);

    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu
    // cenu svih tih namirnica.

    public void dodajUKorpu(Namirnica n, int k){
        for (int i = 0; i < k; i++) {
            korpa.getNamirniceUKorpi().add(n);
            korpa.setCenaKorpe(korpa.getCenaKorpe()+ n.getCena());
        }

    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.


    public void ukloniIzKorpe(Namirnica n){
        korpa.getNamirniceUKorpi().remove(n);
        korpa.setCenaKorpe(korpa.getCenaKorpe()- n.getCena());

    }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.


    public void ukloniIzKorpe(Namirnica n, int k){
        int brojac = 0;
        for (int i = 0; i < korpa.getNamirniceUKorpi().size(); i++) {
            if (korpa.getNamirniceUKorpi().get(i).equals(n)) {
                korpa.getNamirniceUKorpi().remove(n);
                korpa.setCenaKorpe(korpa.getCenaKorpe() - n.getCena());
                i--;
                brojac++;

                if (brojac == k)
                    break;
            }

        }
    }

    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    public void ukloniIzKorpeSveNamirniceN(Namirnica n) {
        int brojac;
        for (int i = 0; i < korpa.getNamirniceUKorpi().size(); i++) {
                if (korpa.getNamirniceUKorpi().get(i).equals(n)) {
                    korpa.getNamirniceUKorpi().remove(n);
                    korpa.setCenaKorpe(korpa.getCenaKorpe() - n.getCena());
                    i--;
                }
        }

    }

    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.

    public void isprazniKorpu() {
        korpa.getNamirniceUKorpi().clear();
        korpa.setCenaKorpe(0);
    }



    //7. cenaKrope - koja vraca ukupnu cenu korpe

    public void cenaKorpe() {
        for (int i = 0;  i < korpa.getNamirniceUKorpi().size(); i++) {
            korpa.setCenaKorpe(korpa.getCenaKorpe() + korpa.getNamirniceUKorpi().get(i).getCena());
        }

    }


    //8. kupi - koja kupuje sve namirnice iz korpe. Tj. prvo proverava da li kupac ima dovoljno novca. Ukoliko nema ispisati poruku
    //          "Nemate dovoljno novca". Ukoliko ima dovoljno novca, isprazniti mu citavu korpu i dodati te namirnice u ArrayListu kupljenih namirnica i oduzeti od novca cenu korpe.
    //

        public void kupi(){

        if (korpa.getCenaKorpe() < novac) {
            for (int i = 0; i < korpa.getNamirniceUKorpi().size(); i++) {
                this.kupljeneNamirnice.add(korpa.getNamirniceUKorpi().get(i));
                novac -= korpa.getCenaKorpe();
            }
            for (int i = 0; i < korpa.getNamirniceUKorpi().size(); i++) {
                korpa.getNamirniceUKorpi().remove(i);
                i--;
            }
        }
        else
            System.out.println("Nemate dovoljno novca.");

        }

}
