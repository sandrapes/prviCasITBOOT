package cetvrta.nedeljaOOP.domaci2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Tocak t = new Tocak(5, true, 5000);
        Tocak r = new Tocak(150, true, 5000);
        Tocak e = new Tocak(230, true, 5000);
        Tocak w = new Tocak(90, true, 5000);
        Tocak q = new Tocak(800, true, 5000);
        Tocak u = new Tocak(25, true, 5000);
        Tocak o = new Tocak(25, true, 5000);
        Tocak p = new Tocak(25, true, 5000);
        Tocak j = new Tocak(25, true, 5000);

        ArrayList<Tocak> listaTockova = new ArrayList<>();

        listaTockova.add(t);
        listaTockova.add(r);
        listaTockova.add(e);
        listaTockova.add(w);
        listaTockova.add(q);
        listaTockova.add(u);

       // System.out.println(t);

        Kamion k = new Kamion(listaTockova, 15000, 2005);


        k.removeOstecenu(listaTockova);
        System.out.println(listaTockova);
        k.ubaciRezervnu(listaTockova);
        System.out.println(listaTockova);



        Automobil a = new Automobil(listaTockova,40000, 2020);
        Motor m = new Motor(listaTockova, 1200, 500);




    }
}
