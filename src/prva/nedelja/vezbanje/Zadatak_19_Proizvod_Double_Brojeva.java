package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_19_Proizvod_Double_Brojeva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double proizvod = 1;

        for (int i = 0; i < n; i++) {
            double brojevi = sc.nextDouble();
            proizvod *= brojevi;

        }
        System.out.println(proizvod);
    }
}
