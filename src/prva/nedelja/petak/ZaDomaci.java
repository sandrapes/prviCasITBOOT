package prva.nedelja.petak;

import java.util.Scanner;

public class ZaDomaci {
    public static void main(String[] args) {

        //Korisnik unosi ceo broj n a zatim i n double brojeva.
        //Ispisati prosek tih brojeva

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double suma = 0;


        for (int i = 0; i < n; i++) {

            double broj = sc.nextDouble();
            suma += broj;

        }

        System.out.println("Prosek tih brojeva je: " + suma / n);





    }
}
