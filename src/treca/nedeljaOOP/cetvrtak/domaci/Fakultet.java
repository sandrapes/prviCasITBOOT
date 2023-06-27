package treca.nedeljaOOP.cetvrtak.domaci;

import java.util.ArrayList;

public class Fakultet {

    //b) Napraviti klasu Fakultet koja ima naziv i listu departmana. Unutar ove klase definisati
    //metode za:
    //  1) ukupan broj ucenika - vraca ukupan broj ucenika sa svih departmana.
    //  2) dodavanje predmeta - za departman biologije i matematike dodati 5 strucnih  .
    //     predmeta.
    //Definisati odgovarajucu klasu gde ce se testirati ove funkcionalnosti, kao i da definisete
    //konstruktor, get-ere i set-ere i toString za klase a) i b).

    private String nazivFakulteta;
    private ArrayList<Departman> listaDepartmana;


    public void kopirajListu (ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = new ArrayList<>();
        for (Departman d : listaDepartmana)
            this.listaDepartmana.add(d);

    }

    public Fakultet(String nazivFakulteta, ArrayList<Departman> listaDepartmana) {
        this.nazivFakulteta = nazivFakulteta;
        this.listaDepartmana = listaDepartmana;
    }

    public int prebrojUcenike () {

        int ukupanBroj = 0;

        for (int i = 1; i < listaDepartmana.size(); i++) {
            ukupanBroj += listaDepartmana.get(i).getBrojStudenata();
        }
        return ukupanBroj;

    }


    public void dodavanjePredmeta () {

        for (int i = 0; i < listaDepartmana.size(); i++) {
            int uvecanjePredmeta = 5;
            if (listaDepartmana.get(i).getNazivDepartmana().equalsIgnoreCase("biologija") ||
                    listaDepartmana.get(i).getNazivDepartmana().equalsIgnoreCase("matematika")) {
                  listaDepartmana.get(i).setBrojStrucnihPredmeta(listaDepartmana.get(i).getBrojStrucnihPredmeta() + 5);
            }

        }

    }

    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet ").append(nazivFakulteta).append(" ima sledece katedre:\n");
        sb.append(" \n");
        sb.append(listaDepartmana + " \n");
        return sb.toString();
    }
}
