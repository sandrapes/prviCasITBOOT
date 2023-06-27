package pastebin.Prodavnica14;

import java.util.ArrayList;

public class Korpa {

    //Napisati klasu Korpa koja ima atribute:
    //- ArrayList<Namirnice>
    //- double cenaKorpe
    //
    //Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.
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
    //
    //Overridovati toString() metod kao:
    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"

    private ArrayList<Namirnica> namirniceUKorpi;
    private double cenaKorpe;

    public Korpa(double cenaKorpe) {
        this.namirniceUKorpi = new ArrayList<>();
        this.cenaKorpe = 0;
    }

    public Korpa(ArrayList<Namirnica> namirniceUKorpi, double cenaKorpe) {
        this.namirniceUKorpi = namirniceUKorpi;
        this.cenaKorpe = cenaKorpe;
    }

    public Korpa() {
    }

    public ArrayList<Namirnica> getNamirniceUKorpi() {
        return namirniceUKorpi;
    }

    public void setNamirniceUKorpi(ArrayList<Namirnica> namirniceUKorpi) {
        this.namirniceUKorpi = namirniceUKorpi;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    public void dodajUkorpu(Namirnica n) {
        namirniceUKorpi.add(n);
        cenaKorpe += n.getCena();
    }

    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na
    // cenuKorpe odgovarajucu cenu svih tih namirnica.

    public void dodajUkorpu(Namirnica n, int k) {
        for (int i = 0; i < k; i++) {
            namirniceUKorpi.add(n);
            cenaKorpe += n.getCena();
        }
    }

    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopijuu takve namirnice. Odzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.

    public void ukloniIzKorpe(Namirnica n) {
        namirniceUKorpi.remove(n);
    }

    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.

    public void ukloniIzKorpe(Namirnica n, int k) {
        int brojac = 0;
        for (int i = 0; i < namirniceUKorpi.size(); i++) {
            if (namirniceUKorpi.get(i).equals(n)) {
                namirniceUKorpi.remove(i);
                cenaKorpe -= n.getCena();
                brojac++;
                i--;

                if (brojac == k) {
                    break;
                }
            }


        }

    }


    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    public void ukloniIzKorpeSveNamirnice(Namirnica n) {

        for (int i = 0; i < namirniceUKorpi.size(); i++) {
                namirniceUKorpi.remove(n);
                i--;
        }
    }

    // 6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednost.

    public void isprazniKorpu() {
        namirniceUKorpi.clear();
        cenaKorpe = 0;
    }

    //7. cenaKrope - koja vraca ukupnu cenu korpe

    public double cenaKorpe() {
        for (int i = 0; i < namirniceUKorpi.size(); i++) {
            cenaKorpe += namirniceUKorpi.get(i).getCena();
        }
        return cenaKorpe;
    }

   // public double brojKopija(Namirnica n) {
        // int brojac = 0;
        // for (int i = 0; i < namirniceUKorpi.size(); i++) {
        //     if (namirniceUKorpi.get(i).equals(n)) {
        //         brojac++;
        //     }

        //  }


    @Override
    public String toString() {
        return "Korpa{" +
                "namirniceUKorpi=" + namirniceUKorpi.toString() +
                ", cenaKorpe=" + cenaKorpe +
                '}';
    }
}
