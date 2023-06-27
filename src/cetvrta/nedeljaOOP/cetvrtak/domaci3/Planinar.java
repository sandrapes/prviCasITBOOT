package cetvrta.nedeljaOOP.cetvrtak.domaci3;

import java.util.ArrayList;

public class Planinar implements Planinarenje {

    /////Napraviti klasu Planinar koja kao atribute ima listu planina na koje se planinar popeo,
    //    //maksimalan uspon, sto predstavlja maksimalnu visinu na koju planinar moze da se popne i
    //    //atribut za tezinu opreme.

    private ArrayList<Planina> listaPlanina;
    private double maxUspon;
    private double tezinaOpreme;

    public Planinar(ArrayList<Planina> listaPlanina, double maxUspon, double tezinaOpreme) {
        this.listaPlanina = listaPlanina;
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public Planinar() {
        this.listaPlanina = new ArrayList<>();
        this.maxUspon = 0;
        this.tezinaOpreme = 0;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    //-popniSe(Planina p) - Za prosledjenu planinu proveriti da li je njena visina manja od
    // maksimalnog uspona Planinara, ako jeste, dodati je u listu Planina.

    @Override
    public void popniSe(Planina p) {

        if (p.getVisinaPlanine() < getMaxUspon())
                 this.listaPlanina.add(p);

    }

    //-clanarina() - Vraca koliko kosta clanarina, znamo da je fiksno 1000 dinara, plus
    // dobijamo 2% popusta za svaku planinu na koju se Planinar popeo.

    @Override
    public double clanarina() {
        int fiksnaClanarina = 1000;

        double popust = listaPlanina.size() * (fiksnaClanarina * 2 / 100.0);

        return fiksnaClanarina - popust;
    }

    //-sviUsponi() - Vraca koliko se sve ukupno Planinar popeo kada se saberu sve visine
    // planina na koje se on popeo.

    @Override
    public double sviUsponi() {
        double suma = 0;

        for (int i = 0; i < listaPlanina.size(); i++) {
            suma += listaPlanina.get(i).getVisinaPlanine();

        }

        return suma;
    }


    //** Opciona metoda= najvecaPlanina() - Vraca najvecu planinu iz liste.


    @Override
    public Planina najvecaPlanina() {


        double max = Double.MIN_VALUE;

        Planina p = new Planina();

        for (int i = 0; i < listaPlanina.size(); i++) {

            if (listaPlanina.get(i).getVisinaPlanine() > max) {
                p = listaPlanina.get(i);
                max = p.getVisinaPlanine();
            }

        }

        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista planina na koje se planinar popeo: ").append(getListaPlanina().toString()).append("\n");
        sb.append("Maksimalna visina na koju se planinar popeo: ").append(maxUspon).append("m").append("\n");
        sb.append("Tezina njegove opreme je: ").append(tezinaOpreme).append("kg").append("\n");
        sb.append("Najvisa planina na koju se planinar popeo: ").append(najvecaPlanina()).append("\n");
        sb.append("Kada sakupimo sve visine planina na koje se planinar peo, dobijamo: ").append(sviUsponi()).append("m").append("\n");
        sb.append("Clanarina koju planinar placa je: ").append(clanarina()).append("din").append("\n");
        return sb.toString();
    }
}
