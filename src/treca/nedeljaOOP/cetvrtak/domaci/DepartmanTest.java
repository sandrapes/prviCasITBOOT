package treca.nedeljaOOP.cetvrtak.domaci;

import java.util.ArrayList;

public class DepartmanTest {

    public static void main(String[] args) {

        Departman biologija = new Departman("Biologija", 20, 16);
        Departman matematika = new Departman("Matematika", 50, -20);
        Departman hemija = new Departman("Hemija", 20, 18);
        Departman informatika = new Departman("Informatika", -25, 14);
        Departman fizika = new Departman("Fizika", 15, 12);


        System.out.println(matematika);
        System.out.println(biologija);
        System.out.println(informatika);

        ArrayList<Departman> listaDepartmana = new ArrayList<>();
        listaDepartmana.add(biologija);
        listaDepartmana.add(matematika);
        listaDepartmana.add(hemija);
        listaDepartmana.add(informatika);
        listaDepartmana.add(fizika);


        Fakultet univerzitetUBeogradu = new Fakultet("Univerzitet u Beogradu", listaDepartmana);

       // System.out.println(univerzitetUBeogradu.prebrojUcenike());
        //univerzitetUBeogradu.dodavanjePredmeta();

        //System.out.println(matematika);
       // System.out.println(hemija);

        System.out.println(univerzitetUBeogradu);

    }


}
