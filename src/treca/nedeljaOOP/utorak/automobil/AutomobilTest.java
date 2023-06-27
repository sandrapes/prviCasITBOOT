package treca.nedeljaOOP.utorak.automobil;

public class AutomobilTest {

    public static void main(String[] args) {

        Automobil civic = new Automobil("BMW", "crvena",2005 , 500);
        Automobil a6 = new Automobil("Audi", "plava", 1990 , 500);
        Automobil x1 = new Automobil("BMW", "crvena", 2016, 1000);
        Automobil x2 = new Automobil("BMW", "crvena", 2000, 1000);

        System.out.println(civic);
        System.out.println(a6);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println();
        civic.cenaZa20P();
        civic.bmwBoja();
        a6.cenaZa20P();
        a6.bmwBoja();
        x1.cenaZa20P();
        x1.bmwBoja();
        x2.cenaZa20P();
        x2.bmwBoja();

        System.out.println(civic);
        System.out.println(a6);
        System.out.println(x1);
        System.out.println(x2);

    }
}
