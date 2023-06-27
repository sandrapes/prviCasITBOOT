package cetvrta.nedeljaOOP.skola;

import java.util.ArrayList;

public class Student extends Ucenik{

    private ArrayList<String> predmeti;
    private ArrayList<Profesor> profesori;

    public Student(String ime, String prezime, int brojGodina, ArrayList<Double> ocene, ArrayList<String> predmeti, ArrayList<Profesor> profesori) {
        super(ime, prezime, brojGodina, ocene);
        this.predmeti = predmeti;
        this.profesori = profesori;
    }

    public Student(){
        predmeti = new ArrayList<>();
        profesori = new ArrayList<>();
    }

    public ArrayList<String> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<String> predmeti) {
        this.predmeti = predmeti;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }


    public void addPredmet(String s){
        predmeti.add(s);
    }

    public void addPredmet(String s, int i){
        predmeti.add(i, s);
    }

    public void addProfesor(Profesor p){
        profesori.add(p);
    }

    public void addProfesor(Profesor p, int i){
        profesori.add(i, p);
    }

    public void removePredmet(String s){
        predmeti.remove(s);
    }



    public void removeProfesor(Profesor p){
        profesori.remove(p); // Ovo mozete raditi samo ako imate implementovanu equals() metodu.
        /*
         * Ako nemate, morate pesacki
         * Da gledate za svakog profesora iz liste, da li se svi njegovi atributi poklapaju sa proesledjenim profesorom P
         * Cim naidjete na takvog, brisete ga iz liste i to na sledeci nacin:
         * 1. pronadjete njegov index
         *
         * for (int i = 0; i < profesori.size(); i++) {
            Profesor trenutniProfesor = profesori.get(i);
            if (trenutniProfesor.getIme().equalsIgnoreCase(p.getIme()) && trenutniProfesor.getPrezime().equalsIgnoreCase(p.getPrezime())
            * && trenutniProfesor.getBrojGodina() == p.getBrojGodina()){
                profesori.remove(i);
                break; //bez break-a mora da se dodaje jedno i--;
            }
        }
        //for (int i = profesori.size() - 1; i >= 0; i--);
        *
         * 2. pozovete onaj remove(int index)
         * --Izadjete iz petlje da ne biste obrisali nekog drugog profesora.
         * */
    }


    @Override
    public String toString() {
        return "Kraj";
    }

}
