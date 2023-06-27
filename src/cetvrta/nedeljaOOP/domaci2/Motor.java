package cetvrta.nedeljaOOP.domaci2;

import java.util.ArrayList;

public class Motor extends MotornoVozilo {

    public Motor(ArrayList<Tocak> listaTockova, int cenaMotornogVozila, int godinaProizvodnje) {
        super(listaTockova, cenaMotornogVozila, godinaProizvodnje);
    }

    @Override
    public boolean daLiJeOStecen(Tocak t) {
        if (t.getTrajanjeGume() > 200) {
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

        while (listaTockova.size() < 3) {
            listaTockova.add(t);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor koji je proizveden ").append(getGodinaProizvodnje()).append(" kosta ").append(getCenaMotornogVozila()).append(" i ima sledecu listu tockova: \n");
        sb.append(getListaTockova().toString());
        return sb.toString();

    }
}
