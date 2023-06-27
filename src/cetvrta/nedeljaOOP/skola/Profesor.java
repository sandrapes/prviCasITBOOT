package cetvrta.nedeljaOOP.skola;

import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Osoba{

    private ArrayList<String> predmetiKojePredaje;

    public Profesor(String ime, String prezime, int brojGodina, ArrayList<String> predmetiKojePredaje) {
        super(ime, prezime, brojGodina);
        this.predmetiKojePredaje = predmetiKojePredaje; //plitko kopiranje - dovoljno za sada
    }

    public Profesor() {
        //super(); //Mozemo i bez njega, jer kada ne pozivamo super konstruktor Java podrazumeva da pozivamo podrazumevani
        //ArrayList = null
        predmetiKojePredaje = new ArrayList<>();//kreira novu prazu arrayListu Niski ciji je size() = 0
    }

    public ArrayList<String> getPredmetiKojePredaje() {
        return predmetiKojePredaje;
    }

    public void setPredmetiKojePredaje(ArrayList<String> predmetiKojePredaje) {
        this.predmetiKojePredaje = predmetiKojePredaje;
    }

    /*
     * [1, 2, 3, 4, 5] <- elementi
     *  0  1  2  3  4 <- indexi
     *
     * add(3, 100) ->
     * [1, 2, 3, 100, 4, 5] <- elementi
     *  0  1  2   3   4  5  <- indexi
     *
     * set(3, 100) ->
     * [1, 2, 3, 100, 5] <- elementi
     *  0  1  2   3   4  <- indexi
     *
     *
     * */

    public void add(String predmet){
        predmetiKojePredaje.add(predmet);
    }

    public void add(String predmet, int i){
        //predmetiKojePredaje.add(i, predmet);
        predmetiKojePredaje.set(i, predmet);
    }

    public void addAll(ArrayList<String> predmeti){
        //I nacin - obican for
        for (int i = 0; i < predmeti.size(); i++) {
            predmetiKojePredaje.add(predmeti.get(i));
        }
        //II nacin - enhanced for
        /*for(String p : predmeti){
            predmetiKojePredaje.add(p);
        }*/

        //III nacin - preko kolekcija
        predmetiKojePredaje.addAll(predmeti);
    }

    public void remove(int i){
        predmetiKojePredaje.remove(i);
    }

    public void remove(String predmet){
        predmetiKojePredaje.remove(predmet);
    }


    /*
     * Dva profesora su ista ako:
     * 1. predaju iste predmete
     * 2. isto ime, isto prezime i isti broj godina
     *
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Profesor profesor)) return false;

        if (!super.equals(o)) return false; //OVde se pitam da li ima isto ime prezime i broj godina
        return Objects.equals(predmetiKojePredaje, profesor.predmetiKojePredaje); //proveravamo da li imaju iste predemete
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), predmetiKojePredaje);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" je profesor koji predaje:\n");
        sb.append(predmetiKojePredaje);
        return sb.toString();
    }
}
