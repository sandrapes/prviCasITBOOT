package cetvrta.nedeljaOOP.domaci2;

import java.util.ArrayList;

public class Automobil extends MotornoVozilo{

    public Automobil(ArrayList<Tocak> listaTockova, int cenaMotornogVozila, int godinaProizvodnje) {
        super(listaTockova, cenaMotornogVozila, godinaProizvodnje);
    }

    @Override
    public ArrayList<Tocak> getListaTockova() {
        return super.getListaTockova();
    }

    @Override
    public boolean daLiJeOStecen(Tocak t) {
        if (t.getTrajanjeGume() > 365) {
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

        while (listaTockova.size() < 6) {
            listaTockova.add(t);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kola koja su proizvedena ").append(getGodinaProizvodnje()).append(" kosta ").append(getCenaMotornogVozila()).append(" i ima sledecu listu tockova: \n");
        sb.append(getListaTockova().toString());
        return sb.toString();

    }
}
