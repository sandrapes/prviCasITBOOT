package treca.nedeljaOOP.cetvrtak.student;

public class StudentTest {

    public static void main(String[] args) {

        Student vladimirPuaca = new Student("Vladimir", "Puaca", 5, 5);
        vladimirPuaca.izracunajProsek();
        //vladimirPuaca.ime = "Dejan"; //Ovo zelimo da sprecimo!
        /*
         * Ne zelimo da druge klase manipulisu poljima nekih kreiranih objekata.
         * */
        String ime = vladimirPuaca.getIme();//Vladimir
        System.out.println(ime);

        vladimirPuaca.setIme("Dejan");
        //ime = vladimirPuaca.getIme();
        System.out.println(vladimirPuaca.getIme());


        vladimirPuaca.setOcenaMatatematika(-3);
        System.out.println(vladimirPuaca.getOcenaMatatematika());
        vladimirPuaca.setOcenaMatatematika(4);
        System.out.println(vladimirPuaca.getOcenaMatatematika());

    }
}
