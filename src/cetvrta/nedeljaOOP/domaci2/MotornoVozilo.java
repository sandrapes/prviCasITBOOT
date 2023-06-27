package cetvrta.nedeljaOOP.domaci2;

import java.util.ArrayList;

public abstract class MotornoVozilo {

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

    private ArrayList<Tocak> listaTockova;
    private int cenaMotornogVozila;
    private int godinaProizvodnje;

    public MotornoVozilo(ArrayList<Tocak> listaTockova, int cenaMotornogVozila, int godinaProizvodnje) {
        this.cenaMotornogVozila = cenaMotornogVozila;
        this.godinaProizvodnje = godinaProizvodnje;
        this.listaTockova = new ArrayList<>();
        for (Tocak t : listaTockova)
            this.listaTockova.add(t);
    }

    public ArrayList<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(ArrayList<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getCenaMotornogVozila() {
        return cenaMotornogVozila;
    }

    public void setCenaMotornogVozila(int cenaMotornogVozila) {
        this.cenaMotornogVozila = cenaMotornogVozila;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public abstract boolean daLiJeOStecen(Tocak t);

    public abstract void removeOstecenu(ArrayList<Tocak> listaTockova);

    public abstract void ubaciRezervnu(ArrayList<Tocak> listaTockova);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motorno vozilo koje je proizvedeno ").append(godinaProizvodnje).append(" kosta ").append(cenaMotornogVozila).append(" i ima sledecu listu tockova: \n");
        sb.append(listaTockova);
        return sb.toString();

    }
}
