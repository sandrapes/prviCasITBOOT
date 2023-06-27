package treca.nedeljaOOP.cetvrtak.ucenik1;

import java.util.ArrayList;

public class Ucenik1Test {

    public static void main(String[] args) {

        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(5);
        ocene.add(5);
        ocene.add(3); //4
        ocene.add(5); //4
        ocene.add(5);

        Ucenik1 bojanMilosavljevic = new Ucenik1(1, "Bojan", "Milosavljevic", ocene);
        System.out.println(bojanMilosavljevic);

        ocene.set(2, 4);
        ocene.set(3, 4);
        Ucenik1 ivanBjelogrlic = new Ucenik1(2, "Ivan", "Bjelogrlic", ocene);
        System.out.println(ivanBjelogrlic);

        ocene.set(0, 1);
        System.out.println(ocene);

    }


}
