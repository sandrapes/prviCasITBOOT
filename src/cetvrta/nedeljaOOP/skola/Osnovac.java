package cetvrta.nedeljaOOP.skola;

import java.util.ArrayList;

public class Osnovac extends Ucenik {

    /*
     * Osnovac nasledjuje Ucenika koji nasledjuje Osobu
     *
     * Osnovac poziva konstruktor SAMO ZA UCENIKA! ALI! konstruktor Ucenika poziva konstruktor Osobe.
     * DAKLE, pozivace se indukcijom svi konstruktori za sve natklase do pocetka lanca.
     *
     * Osnovac vidi sve SVOJE metode (ocigledno),
     * SVE metode Ucenika (jer ih direktno nasledjuje)
     * i SVE metode Osobe (jer ih nasledjuje preko Ucenika)
     *
     *
     *
     * */
    private ArrayList<String> bojice;



    public Osnovac(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, ArrayList<String> bojice) {
        super(ime, prezime, brojGodina, ocene);
        if (brojGodina < 7 || brojGodina > 14)
            setBrojGodina(7);
        this.bojice = bojice;
    }

    public Osnovac() {
        this.bojice = new ArrayList<>();
    }

    public ArrayList<String> getBojice() {
        return bojice;
    }

    public void setBojice(ArrayList<String> bojice) {
        this.bojice = bojice;
    }

    public void dodajBojicu(String s){
        bojice.add(s);
    }

    public void dodajBojicu(String s, int i){
        bojice.set(i, s);
    }

    public void ukloniBojicu(String s){
        bojice.remove(s);
    }

    public void ukloniBojicu(int i){
        bojice.remove(i);
    }

    /*
     *
     * //4.2 + 0.3 -> 4.5
     * // 4.9 + 0.3 -> 5.0
     * // 5.0 + 0.3 -> 5.0
     *
     * */

    @Override
    public double prosek(){
        double sum = 0;
        for(Double o : getOcene()){
            if (o < 1.7) // 1.6 + 0.3 -> 1.9 a to je jedinica | 1.7 + 0.3 -> 2.0
                return 1.0;
            /*sum += o;
            if (o <= 4.7)
                sum += 0.3;*/
            sum += Math.min(o + 0.3, 5.0); //o = 4.9 -> 5.2
        }
        return sum / getOcene().size();
    }

    /*
     * Ne moram da implementujem toString() metod
     * jer je isti kao u natklasi tako da ako pozovem
     * Osnovac o.getString() -> pozvace se najniza implementacija u hjerahiji a to je upravo toString() metod klase Ucenik
     *
     * */
}
