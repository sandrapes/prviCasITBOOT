package prva.nedelja.vezbanje;

import java.util.Scanner;

public class CeoBrojDoubleBrojevaProsek {

    public static void main(String[] args) {

        // Korisnik unosi ceo broj n a zatim i n double brojeva.
        //Ispisati prosek tih brojeva


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double zbir = 0;

        for (int i = 0; i < n; i++) {

            double brojevi = sc.nextDouble();
            zbir += brojevi;
        }
        System.out.println("Prosek tih brojeva je: " + zbir / n );
    }
}
