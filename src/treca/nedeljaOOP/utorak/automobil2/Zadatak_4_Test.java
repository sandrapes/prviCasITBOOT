package treca.nedeljaOOP.utorak.automobil2;

public class Zadatak_4_Test {

    public static void main(String[] args) {

        Zadatak_4_Automobil ford = new Zadatak_4_Automobil("Mustang", "Nemacka", 2014, 200.14);
        Zadatak_4_Automobil volkswagen = new Zadatak_4_Automobil("Bentley", "Austrija", 2020, 300.0);
        Zadatak_4_Automobil toyota = new Zadatak_4_Automobil("Corola", "Japan", 1995, 2000.32);

        System.out.println(toyota);
        System.out.println();
        System.out.println(ford);
        System.out.println();
        System.out.println(volkswagen);
        System.out.println();

    }
}
