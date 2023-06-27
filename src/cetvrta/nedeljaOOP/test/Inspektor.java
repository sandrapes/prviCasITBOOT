package cetvrta.nedeljaOOP.test;

public class Inspektor {

    //Kreirati klasu Inspektor koja predstavlja jednog Michelin inspektora.
    //Svaki inspektor ima ugostiteljski objekat kojeg trenutno pregleda.
    //Popuniti ovu klasu na sledeci nacin:
    //1. Polja:
    //UgostiteljskiObjekat objekat
    //2. Konstruktori:
    //Kreirati jedan potpun konstruktor
    //3. Napisati sve potrebne gettere i settere
    //4. Napisati sledece metode:
    //public void dodajOpis(String opis) koja dodaje recenziju tom ugostiteljskom objektu kojeg inspektor trenutno pregleda.
    //public void dodajOcenu(double ocena) koja dodaje ocenu tom ugostiteljskom objektu kojeg inspektor trenutno pregleda.
    //public void dodeliZvezdu() koja dodeljuje ili oduzima odredjen broj zvezdi od ugostiteljskog objekta kojeg inspektor trenutno pregleda.
    //public String procitajRecenzije() koja vraca sve recenzije ugostiteljskog objekta kojeg inspektor trenutno pregleda, kao Nisku oblika:
    //"1) <recenzija[0]>"
    //"2) <recenzija[1]>"
    //...
    //"N) <recenzija[N]>"
    //public String procitajRecenzije(int i) koja vraca i-tu recezniju ugostiteljskog objekta kojeg inspektor trenutno pregleda, pazeci na validnost prosledjenog indeksa!
    //public void zatvoriObjekat() koja postavlja ocenu ugostiteljskog objekta kojeg inspektor trenutno pregleda na 1.0 i broj zvezda na 0.
    //public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2) koja vraca:
    //-1; Ako je o1 strogo bolji ugostiteljski objekat od ugostiteljskog objekta o2
    //0; Ako je o1 ugostiteljski objekat isti kao ugostiteljski objekat o2
    //1; Ako je o2 strogo bolji ugostiteljski objekat od ugostiteljskog objekta o1
    //Ugostiteljski objekat je strogo bolji od nekog drugog ugostiteljskog objekta ako:
    //Ima strogo vise Miselinovih zvezda
    //Ima strogo bolju prosecnu ocenu; ukoliko imaju isti broj Miselinovih zvezdi

    private UgostiteljskiObjekat objekat;

    public Inspektor(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public UgostiteljskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(UgostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    //koja dodaje recenziju tom ugostiteljskom objektu kojeg inspektor trenutno pregleda.

    public void dodajOpis(String opis) {
        getObjekat().dodajRecenziju(opis);
    }

    //koja dodaje ocenu tom ugostiteljskom objektu kojeg inspektor trenutno pregleda.

    public void dodajOcenu(double ocena) {
        getObjekat().dodajOcenu(ocena);
    }

    //public void dodeliZvezdu() koja dodeljuje ili oduzima odredjen broj zvezdi od ugostiteljskog objekta kojeg inspektor trenutno pregleda.

    public void dodeliZvezdu() {

    }

    //public String procitajRecenzije() koja vraca sve recenzije ugostiteljskog objekta kojeg inspektor trenutno pregleda, kao Nisku oblika:
    //"1) <recenzija[0]>"
    //"2) <recenzija[1]>"
    //...
    //"N) <recenzija[N]>"

    public String procitajRecenzije() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getObjekat().getRecenzije().size(); i++) {
              sb.append(i + 1).append(") ").append(getObjekat().getRecenzije().get(i));
        }
        return sb.toString();

    }

    //public String procitajRecenzije(int i) koja vraca i-tu recezniju ugostiteljskog objekta kojeg inspektor trenutno
    // pregleda, pazeci na validnost prosledjenog indeksa!

    public String procitajRecenzije(int i) {
        if (i >= 0 && i < getObjekat().getRecenzije().size())
            return objekat.getRecenzije().get(i);
        else
            return "Nema recenzije na toj poziciji";

    }

    //public void zatvoriObjekat() koja postavlja ocenu ugostiteljskog objekta kojeg inspektor trenutno pregleda na 1.0
    // i broj zvezda na 0.

    public void zatvoriObjekat() {
        objekat.setProsecnaOcena(1.0);
        objekat.setBrMichelinZvezda(0);
    }

    //public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2) koja vraca:
    //-1; Ako je o1 strogo bolji ugostiteljski objekat od ugostiteljskog objekta o2
    //0; Ako je o1 ugostiteljski objekat isti kao ugostiteljski objekat o2
    //1; Ako je o2 strogo bolji ugostiteljski objekat od ugostiteljskog objekta o1
    //Ugostiteljski objekat je strogo bolji od nekog drugog ugostiteljskog objekta ako:
    //Ima strogo vise Miselinovih zvezda
    //Ima strogo bolju prosecnu ocenu; ukoliko imaju isti broj Miselinovih zvezdi

    public static int uporediUgostiteljskeObjekte(UgostiteljskiObjekat o1, UgostiteljskiObjekat o2) {
        if (o1.getBrMichelinZvezda() > o2.getBrMichelinZvezda())
            return -1;
        else if (o2.getBrMichelinZvezda() > o1.getBrMichelinZvezda())
            return 1;
        else if (o1.getBrMichelinZvezda() == o2.getBrMichelinZvezda() && o1.getProsecnaOcena() > o2.getProsecnaOcena()) {
            return -1;
        }
        else if (o2.getBrMichelinZvezda() == o1.getBrMichelinZvezda() && o2.getProsecnaOcena() > o1.getProsecnaOcena()) {
            return 1;
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ja sam posetio restoran: ").append(objekat);
        return sb.toString();
    }

}
