package treca.nedeljaOOP.cetvrtak.ucenik;

import java.util.ArrayList;

public class NastavnikUcenikTest {

    public static void main(String[] args) {

        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(5);
        ocene.add(5);
        ocene.add(3); //4
        ocene.add(5); //4
        ocene.add(5);

        Ucenik bojanMilosavljevic = new Ucenik("Bojan", "Milosavljevic",  ocene);
        System.out.println(bojanMilosavljevic);

        ocene.set(2, 4);
        ocene.set(3, 4);
        Ucenik ivanBjelogrlic = new Ucenik( "Ivan", "Bjelogrlic", ocene);
        System.out.println(ivanBjelogrlic);

        ocene.set(0, 1);
        System.out.println(ocene);

        System.out.println(Ucenik.ID);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(bojanMilosavljevic);
        ucenici.add(ivanBjelogrlic);

        Nastavnik strahinjaTrninic = new Nastavnik("Strahinja", "Trninic", 25, ucenici );
        System.out.println("Kako se zove strahinjin ucenik?");
        /*
         * Pozivamo metodu getIme() nad objektom klase Ucenik
         * kojeg smo dobili tako sto smo pozvali metodu getUcenik()
         * koja vraca objekat kalse Ucenik jer je taj objekat
         * atribut nekog objekta klase Nastavnik.
         *
         * Rezultat "operacije" strahinjaTrninic.getUcenik() je jedan objekat
         * I kao takav nad njime mozemo pozivati njegove metode.
         * */;
        System.out.println("=================");
        System.out.println(strahinjaTrninic);


    }


}
