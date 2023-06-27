package treca.nedeljaOOP.ponedeljak;

import java.util.ArrayList;

public class Domaci {

    //Napraviti dve funkcije:
    //a) Prva funkcija kreira listu od 20 parnih brojeva.

    public static ArrayList<Integer> listaParnihbrojeva () {

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            int a = (int)(Math.random() * 10) * 6;
            list.add(a);
        }

        return list;

    }

    ////b) Druga funkcija uzima listu iz primera a) i eleminise sve brojeve koji su deljivi sa 4.

    public static void deljivSa4 (ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 4 == 0) {
                list.remove(list.get(i));
            }

        }

        System.out.println("Kada uklonimo sve brojeve deljive sa 4, lista glasi: " + list);
    }


    public static void main(String[] args) {

        System.out.println("Ovo je nasa lista: ");
        System.out.println(listaParnihbrojeva());
        System.out.println();
        deljivSa4(listaParnihbrojeva());
    }

}
