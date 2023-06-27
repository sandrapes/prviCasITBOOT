package prva.nedelja.vezbanje;

import java.util.Scanner;

public class SumaNiza {
    public static void main(String[] args) {

        // Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
        //Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)

        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {
            int elementi = sc.nextInt();
            niz[i] = elementi;


        }

        int sum = 0;

        for (int i = 0; i < niz.length; i++) {
            sum += niz[i];

        }
        System.out.println(sum);




    }
}
