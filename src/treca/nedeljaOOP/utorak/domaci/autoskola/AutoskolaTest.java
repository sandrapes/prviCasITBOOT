package treca.nedeljaOOP.utorak.domaci.autoskola;

public class AutoskolaTest {
    public static void main(String[] args) {

        Autoskola raptor = new Autoskola("Raptor", 100, 100000, "autobus");
        Autoskola golub = new Autoskola("Golub", 92, 90000, "motor");
        Autoskola kodeks = new Autoskola("Kodeks", 56, 95000, "automobil");

        raptor.motorPopust();
        raptor.brojGrupa();
        golub.motorPopust();
        golub.brojGrupa();
        kodeks.brojGrupa();
        kodeks.brojGrupa();

        System.out.println(raptor);
        raptor.autobusPolaganje();
        System.out.println("=================================");

        System.out.println(golub);
        golub.autobusPolaganje();
        System.out.println("=================================");

        System.out.println(kodeks);
        kodeks.autobusPolaganje();
        System.out.println("=================================");

    }
}
