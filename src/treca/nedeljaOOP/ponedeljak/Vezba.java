package treca.nedeljaOOP.ponedeljak;

import java.util.ArrayList;
import java.util.List;

public class Vezba {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(7);
        list1.add(18);
        list1.add(19);
        list1.add(3);

        System.out.println("Duzina ove liste je: " + list1.size());

        System.out.println("Treci clan ove liste je: " + list1.get(2));

        list1.set(2, 1);
        list1.set(0, 14);

        System.out.println("Izmenjena lista sada glasi ovako: " + list1);

        list1.remove(1);

        System.out.println("Kada se drugi clan liste izbaci, lista glasi ovako: " + list1);

        if (list1.isEmpty())
            System.out.println("Lista je prazna");
        else
            System.out.println("Lista ima clanove, nije prazna.");


        list1.clear();

        if (list1.isEmpty())
            System.out.println("Lista je prazna");
        else
            System.out.println("Lista ima clanove, nije prazna.");


        list1.add(12);
        list1.add(1);
        list1.add(40);
        list1.add(3);
        list1.add(7);
        list1.add(9);

        list1.set(1, list1.get(2) - 5);

        System.out.println("Novonastala lista je: " + list1);


    }





}
