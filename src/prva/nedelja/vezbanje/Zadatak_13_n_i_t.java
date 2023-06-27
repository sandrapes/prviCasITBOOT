package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_13_n_i_t {

    public static void main(String[] args) {

        //13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
        // koji je strogo manji od njega (dakle t < n),
        // sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            System.out.println("Za t = " + i + " suma je = ");
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            System.out.println(sum);

        }



    }
}
