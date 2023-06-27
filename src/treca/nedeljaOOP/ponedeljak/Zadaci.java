package treca.nedeljaOOP.ponedeljak;

import java.util.ArrayList;
import java.util.List;

public class Zadaci {

    // 1. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
    // 	proslednjenju ArrayListu.
    //2. Napisati funkciju koja vraca najveci element iz ArrayListe.
    //3. Napisati funkciju koja prima ArrayListu integera i niz integera i u prosledjenu listu dodaje sve elemente iz prosledjenog niza.



    public static void dodaj (ArrayList<Integer> list, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(list.add(arr[i]));

        }


    }



















    static List<Integer> duplirajElemente(List<Integer> lista) {

        List<Integer> listaDupliEl = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            listaDupliEl.add(lista.get(i) + lista.get(i));

            // ili lista.add( 2 * lista.get(i))

        }

        return listaDupliEl;

    }

    static int najveciElement (List<Integer> lista) {

        int najveci = Integer.MIN_VALUE;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > najveci)
                najveci = lista.get(i);

        }
        return najveci;

    }



    static void dodajElemente(ArrayList<Integer> lst, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            lst.add(arr[i]);
        }
    }







    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(24);
        list.add(6);
        list.add(7);
        list.add(1);
        list.add(11);
        list.add(6);

        int[] arr = {1, 2, 5, 45, 4, 6, 48};


        dodajElemente(list, arr);
        System.out.println(list);
    }




}
