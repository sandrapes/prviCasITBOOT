package cetvrta.nedeljaOOP.domaci2;

public class Tocak {

    //Domaci Zadatak 2 (Modifikacija Zadatka sa casa):
    //Napraviti klasu Tocak koja ce imati atribute za trajanje gume u danima(koliko je dana proslo
    //od kako smo postavili gumu), ostecenje(boolean) i cena.
    //
    //Napraviti apstraktnu klasu MotornoVozilo koja ima atribute za listu Tockova, cenu i godinu
    //proizvodnje. Ova klasa ce imati apstraktne metode:
    //
    //-daLiJeOStecen -> Koji proverava koliko je Tocak koriscen, ako Kamion koristi Tocak vise
    //od 120 dana, oznaciti da je ostecen, ako Automobil koristi tocak 365 dana, oznaciti da je
    //ostecen i ako Motor koristi tocak vise od 200 dana, takodje oznaciti da je ostecen.
    //
    //-removeOstecenu -> Uklanja iz postojece liste sve ostecene tockove ili vraca novu listu
    //tockova bez ostecenih.
    //
    //-ubaciRezervnu -> Ako nema dovoljno tockova (Znamo da ce Automobil imati npr 6
    //tockova(4 obavezna i 2 rezervna)) ubaciti onoliko tockova u listu koliko fali.
    //Napraviti Klase Kamion,Motor i Automobil koje nasledjuju klasu MotornoVozilo.
    //
    //Klase Kamion, Automobil i Motor nasledjuju apstraktnu klasu MotornoVozilo.
    //Treba definisati takodje konstruktore, get i set kao i toString() metode za sve klase.
    //



    /// ako se klase nasledjuju onda mozemo direktno get
    // ako se ne nasledjuju, onda moramo da instanciramo recimo Tocak t, pa t.getNesto


    private int trajanjeGume;
    private boolean ostecenje;
    private int cena;

    public Tocak(int trajanjeGume, boolean ostecenje, int cena) {
        this.trajanjeGume = trajanjeGume;
        this.ostecenje = ostecenje;
        this.cena = cena;
    }

    public Tocak() {
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guma je postavljena pre ").append(trajanjeGume).append(" dana \n");
        sb.append("Cena je: ").append(cena).append("\n");
        if (ostecenje)
            sb.append("Ostecenja ima. \n");
        else
            sb.append("Ostecenja nema.\n");
        return sb.toString();
    }
}
