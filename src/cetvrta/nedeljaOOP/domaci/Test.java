package cetvrta.nedeljaOOP.domaci;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

       Sportista s = new Sportista("Milan", 1000);
       Sportista d = new Sportista("Marko", 1200);
       Sportista f = new Sportista("Sandra", 900);
       Sportista g = new Sportista("Nemanja", 800);
       Sportista h = new Sportista("Milica", 1500);
       Sportista j = new Sportista("Ana", 1300);
       Sportista k = new Sportista("Pavle", 850);

        ArrayList<Sportista> sportisti = new ArrayList<>();
        sportisti.add(s);
        sportisti.add(d);
        sportisti.add(f);
        sportisti.add(g);
        sportisti.add(h);
        sportisti.add(j);
        sportisti.add(k);

       SportskiKlub beogradFK = new SportskiKlub(sportisti, "Beograd", 7000);

        //System.out.println(beogradFK);

       // System.out.println(beogradFK.isplati(sportisti));
        //System.out.println(beogradFK.prosecnoPLaceni(sportisti));

        Spartak spartak = new Spartak(sportisti, "Subotica", 12000);
        Mancester mancester = new Mancester(sportisti, "Mancester", 20000);
        Arsenal arsenal = new Arsenal(sportisti, "London", 6500);

        spartak.removePreplaceni(sportisti);
        System.out.println(spartak);





    }
}
