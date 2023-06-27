package cetvrta.nedeljaOOP.skola;

import java.util.ArrayList;

public class Ucenik extends Osoba {

    private ArrayList<Double> ocene;

    public Ucenik(String ime, String prezime, int brojGodina, ArrayList<Double> ocene) {
        super(ime, prezime, brojGodina);
        this.ocene = ocene;
    }

    public Ucenik() {
        ocene = new ArrayList<>();
    }

    public ArrayList<Double> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Double> ocene) {
        this.ocene = ocene;
    }


    private boolean validnaOcena(double x){
        return x >= 1.0 && x <= 5.0;
    }

    public void dodajOcenu(double x){
        if (validnaOcena(x))
            ocene.add(x);
    }

    public void promeniOcenu(double x, int i){
        if (validnaOcena(x))
            ocene.set(i, x);
    }

    public void izbrisiOcenu(int i){
        ocene.remove(i);
    }

    public void izbrisiOcenu(double x){
        ocene.remove(x);
    }

    public double prosek(){
        double sum = 0;
        for(Double ocena : ocene){
            if (ocena < 2.0){
                // Ako je ovaj if ispunjen, postoji barem jedna jedinica, pa je prosek sigurno 1.0
                return 1.0;
            }
            sum += ocena;
        }
        //Ako smo ovde, onda nema ni jedne jedinice
        return  sum / ocene.size();
    }

    public String kakavJeDjak(){
        double p = prosek();
        if (p == 1.0)
            return "Nedovoljan";
        else if (p >= 2.0 && p < 2.5)
            return "Dovoljan";
        else if (p >= 2.5 && p < 3.5)
            return "Dobar";
        else if (p >= 3.5 && p < 4.5)
            return "Vrlodobar";
        return "Odlican";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ima ocene:\n");
        sb.append(ocene.toString()).append("\n");
        sb.append("Prosek: ").append(prosek());
        return sb.toString();
    }
}
