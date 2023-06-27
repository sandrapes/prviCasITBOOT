package cetvrta.nedeljaOOP.domaci;

import java.util.ArrayList;

public class SportskiKlub {

    //2)Napraviti klasu SportskiKlub koja ima listu clanova kluba, naziv grada odakle je klub i
    //budzet kluba. Definisati metode:
    //   *isplati - koja vraca kolicinu novca koja ostaje kada se svim clanovima kluba isplate
    //plate.
    //   *prosecnoPlaceni - vraca prosecnu platu svih sportista iz liste.
    //   *removePreplaceni - izbacuje iz liste sportistu koji je placen vise od proseka.

    private ArrayList<Sportista> clanoviKluba;
    private String grad;
    private int budzet;

    // ne znam jel moramo da pravimo novu listu
   // public ArrayList<Sportista> kreirajListu(ArrayList<Sportista> clanoviKluba) {
       // this.clanoviKluba = new ArrayList<>();
        //for (Sportista s : clanoviKluba)
        //    this.clanoviKluba.add(s);
       // return clanoviKluba;

    //}

    public SportskiKlub(ArrayList<Sportista> clanoviKluba, String grad, int budzet) {
        this.clanoviKluba = clanoviKluba;
        this.grad = grad;
        this.budzet = budzet;
    }

    public ArrayList<Sportista> getClanoviKluba() {
        return clanoviKluba;
    }

    public void setClanoviKluba(ArrayList<Sportista> clanoviKluba) {
        this.clanoviKluba = clanoviKluba;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getBudzet() {
        return budzet;
    }

    public void setBudzet(int budzet) {
        this.budzet = budzet;
    }

    public int isplati(ArrayList<Sportista> clanoviKluba) {
        int ceoBudzet = this.budzet;
        int ostatak = this.budzet;
        int i = 0;

        while (i < clanoviKluba.size()) {
            ostatak -= clanoviKluba.get(i).getPlata();
            i++;
        }
        if (ostatak < 0) {
            System.out.println("Klub nema dovoljno para da isplati igrace.");
            return ceoBudzet;
        } else {
            System.out.println("Klubu ostaje: ");
            return ostatak;
        }
    }

    public double prosecnoPLaceni(ArrayList<Sportista> clanoviKluba) {
        int sum = 0;
        int brojac = 1;
        for (int i = 0; i < clanoviKluba.size(); i++) {
            sum += clanoviKluba.get(i).getPlata();
            brojac++;
        }
        return (double)sum / brojac;

        }

    public void removePreplaceni(ArrayList<Sportista> clanoviKluba) {
        double prosek = prosecnoPLaceni(clanoviKluba);

        for (int i = clanoviKluba.size() - 1; i >= 0; i--) {
            Sportista trenutni = clanoviKluba.get(i);
            if (prosek < clanoviKluba.get(i).getPlata()) {
                clanoviKluba.remove(trenutni);
                System.out.println("Izbaceni clanovi kluba su: " + trenutni);
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sportski klub u gradu ").append(grad).append(" ima budzet ").append(budzet).append("\n");
        sb.append("Igraci u tom klubu su: \n").append(clanoviKluba.toString());
        return sb.toString();
    }
}
