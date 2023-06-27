package prva.nedelja.vezbanje;

import java.util.Scanner;

public class ProizvodNizaZadatak_5 {
    public static void main(String[] args) {

        //5. -//-. Izracunati proizvod elemenata tog niza.
        //Primer: [2, 4] -> 8

        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {
            int elementi = sc.nextInt();
            niz[i] = elementi;

        }

        int proizvod = 1;

        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");

            proizvod *= niz[i];

        }
        System.out.println(" ");
        System.out.println(proizvod);
    }
}
