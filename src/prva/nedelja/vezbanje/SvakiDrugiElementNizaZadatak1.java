package prva.nedelja.vezbanje;

import java.util.Scanner;

public class SvakiDrugiElementNizaZadatak1 {
    public static void main(String[] args) {

        //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
        //Primer: [1, 2, 3, 4, 5] -> 1 3 5

        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt();

        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {

            int elementi = sc.nextInt();
            niz[i] = elementi;

        }

        for (int i = 1; i < niz.length; i+=2) {
            System.out.print(niz[i] + " ");

        }
    }
}
