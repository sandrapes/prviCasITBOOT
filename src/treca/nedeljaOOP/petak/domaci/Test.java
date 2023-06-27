package treca.nedeljaOOP.petak.domaci;

public class Test {

    public static void main(String[] args) {

        SefSmene sef = new SefSmene("Sandra", 13.0, 20.5, 54.4);
        Masinovodja m = new Masinovodja("Natalija", 12.3, 15.0);
        Fizikalac f = new Fizikalac("Milan", 41.2, 10);

        System.out.println(sef.ukupnoZaradjeno());
        System.out.println(m.ukupnoZaradjeno());
        System.out.println(f.ukupnoZaradjeno());

        System.out.println(sef.daLiJeNaOdmoru());
        System.out.println(m.daLiJeNaOdmoru());
        System.out.println(f.daLiJeNaOdmoru());

        System.out.println(sef);
        System.out.println(m);
        System.out.println(f);

        //System.out.println(sef.ukupnoZaradjeno());
    }
}
