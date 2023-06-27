package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_21_Najmanji_I_Najveci {
    public static void main(String[] args) {

        //21.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       double najmanji = Double.MAX_VALUE;
       double najveci = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            double broj = sc.nextDouble();
            if (broj > najveci)
                najveci = broj;
            if (broj < najmanji)
                najmanji = broj;

        }

        System.out.println(najveci);
        System.out.println(najmanji);
    }
}
