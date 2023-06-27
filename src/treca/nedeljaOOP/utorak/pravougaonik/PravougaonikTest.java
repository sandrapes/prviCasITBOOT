package treca.nedeljaOOP.utorak.pravougaonik;

public class PravougaonikTest {

    public static void main(String[] args) {
        Pravougaonik p = new Pravougaonik(3, 5);
        System.out.println(p.toString());//Eksplicitino pozivanje toString() metode

        System.out.println("==================");

        Pravougaonik kvadrat = new Pravougaonik(2);
        System.out.println(kvadrat); //Implicitno pozivanje toString() metode


    }
}
