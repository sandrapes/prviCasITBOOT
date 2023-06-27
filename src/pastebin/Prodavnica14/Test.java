package pastebin.Prodavnica14;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Namirnica n1 = new Namirnica("hleb", 90);
        Namirnica n3 = new Namirnica("voda", 100);
        Namirnica n4 = new Namirnica("voda", 120);
        Namirnica n5 = new Namirnica("hleb", 90);
        Namirnica n6 = new Namirnica("hleb", 90);
        Namirnica n7 = new Namirnica("sok", 100);

        ArrayList<Namirnica> listaNamirnica = new ArrayList<>();
        listaNamirnica.add(n1);
        listaNamirnica.add(n3);
        listaNamirnica.add(n4);
        listaNamirnica.add(n5);
        listaNamirnica.add(n6);
        listaNamirnica.add(n7);

        Korpa korpa = new Korpa(listaNamirnica, 8000);


korpa.ukloniIzKorpe(n7);

        System.out.println(korpa);

    }
}
