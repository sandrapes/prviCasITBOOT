package cetvrta.nedeljaOOP.petak.poliklinika;

import java.util.ArrayList;

public class Poliklinika {

    private ArrayList<Lekar> lekari;

    public Poliklinika(ArrayList<Lekar> lekari) {
        this.lekari = lekari;
    }

    public Poliklinika() {
        this.lekari = new ArrayList<>();
    }

    public int pulmologSaNajmonjomPlatom() {
        /*
         * Pretpostavicu da mi je prvi pulmolog
         * (tj onaj na indexu 0) taj koji ima najmanju platu.
         * Procicu kroz celu listu lekara, trazicu pulmologe
         * i pitacu se da li taj tekuci pulmolog ima platu
         * manju od trenutne najmanje plate.
         *
         * */
        /*
         * 1.Kreiram ArrayList<Pulmologa>
         * 2.Radim gore navedeni algoritam nad ovom listom
         * */


        ArrayList<Pulmolog> pulmolozi = new ArrayList<>();

        for (int i = 0; i < lekari.size(); i++) {
            if (lekari.get(i) instanceof Pulmolog) {
                pulmolozi.add((Pulmolog)lekari.get(i));
            }
        }

        if (pulmolozi.isEmpty())
            return -1;

        int id = pulmolozi.get(0).getId();
        double najmanjaPlata = pulmolozi.get(0).plata();

        for (int i = 0; i < pulmolozi.size(); i++) {
            if (pulmolozi.get(i).plata() > najmanjaPlata) {
                najmanjaPlata = pulmolozi.get(i).plata();
                id = pulmolozi.get(i).getId();
            }
        }
        return id;

        }
        
        /**
        ArrayList<Pulmolog> pulmolozi = new ArrayList<>();
        for (int i = 0; i < lekari.size(); i++) {
            if (lekari.get(i) instanceof Pulmolog) {
                pulmolozi.add((Pulmolog) lekari.get(i));
            }
        }
        if (pulmolozi.isEmpty())
            return -1; //Vracamo nemoguce jer nemamo pulmologe
        int id = pulmolozi.get(0).getId();
        double najmanjaPlata = pulmolozi.get(0).plata();
        for (Pulmolog p : pulmolozi) {
            if (p.plata() < najmanjaPlata) {
                id = p.getId();
                najmanjaPlata = p.plata();
            }
        }
        return id;
    }
         **/

    public int pedijatarSaNajstarijimPacijentima() {
        ArrayList<Pedijatar> pedijatri = new ArrayList<>();
        for (int i = 0; i < lekari.size(); i++) {
            if (lekari.get(i) instanceof Pedijatar)
                pedijatri.add((Pedijatar) lekari.get(i));
        }
        if (pedijatri.isEmpty())
            return -1;
        /*
         * Za svakog pedijatra racunam prosek starosti njegovih pacijenata
         * vracam id tog pedijatra
         *
         * Pretpostavljam da pedijatar na indexu 0 ima najstariji (najveci) prosek
         * */
        int id = pedijatri.get(0).getId();
        double najveciProsekGodina = 0;
        for (Pacijent p : pedijatri.get(0).getPacijenti()) {//Trazim prosek prvog pedijatra, svaki pedijatar ima svoje pacijente
            najveciProsekGodina += p.getBrojGodina();
        }
        najveciProsekGodina /= pedijatri.get(0).getBrojPacijenta();
        for (int i = 1; i < pedijatri.size(); i++) {
            double trenutniProsek = 0;
            for (Pacijent p : pedijatri.get(i).getPacijenti()) {
                trenutniProsek += p.getBrojGodina();
            }
            trenutniProsek /= pedijatri.get(i).getBrojPacijenta();
            if (trenutniProsek > najveciProsekGodina) {
                najveciProsekGodina = trenutniProsek;
                id = pedijatri.get(i).getId();
            }
        }
        return id;
    }
}