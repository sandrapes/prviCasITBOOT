package cetvrta.nedeljaOOP.cetvrtak.domaci3;

import java.util.ArrayList;

public class JedanBezDuplikata {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ana");
        lista.add("Marko");
        lista.add("Sandra");
        lista.add("Ana");
        lista.add("Sandra");
        lista.add("Sandra");
        lista.add("Mirko");




        for (int i = 0; i < lista.size(); i++) {
            String trenitni = lista.get(i);
            for (int j = i+1; j < lista.size(); j++) {
                if (lista.get(i).equalsIgnoreCase(lista.get(j))) {
                    lista.remove(j);
                    j--;

                }


            }

        }

        System.out.println(lista);

    }
}
