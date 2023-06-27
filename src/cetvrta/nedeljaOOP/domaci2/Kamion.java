package cetvrta.nedeljaOOP.domaci2;

import java.util.ArrayList;

public class Kamion extends MotornoVozilo{

    public Kamion(ArrayList<Tocak> listaTockova, int cenaMotornogVozila, int godinaProizvodnje) {
        super(listaTockova, cenaMotornogVozila, godinaProizvodnje);
    }


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


    @Override
    public boolean daLiJeOStecen(Tocak t) {
        if (t.getTrajanjeGume() > 120) {
            return true;
        }
        else
            return false;
    }

    @Override
    public void removeOstecenu(ArrayList<Tocak> listaTockova) {

        for (int i = 0; i < listaTockova.size(); i++) {
            if (daLiJeOStecen(listaTockova.get(i))) {
                listaTockova.remove(i);
                i--;
            }

        }

    }

    @Override
    public void ubaciRezervnu(ArrayList<Tocak> listaTockova) {
        Tocak t = new Tocak();

        while (listaTockova.size() < 9) {
            listaTockova.add(t);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kamion koji je proizveden ").append(getGodinaProizvodnje()).append(" kosta ").append(getCenaMotornogVozila()).append(" i ima sledecu listu tockova: \n");
        sb.append(getListaTockova().toString());
        return sb.toString();

    }
}



