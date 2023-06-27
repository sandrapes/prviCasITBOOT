package prva.nedelja.petak;

import java.util.Scanner;

public class Zadatak_SaPasteBina21DrugiNacin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int najmanji = Integer.MAX_VALUE;
        int najveci = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int unos = sc.nextInt();

            if (unos > najveci) {
                najveci = unos;
            }
            if (unos < najmanji) {
                najmanji = unos;
            }

        }

        System.out.println(najveci);
        System.out.println(najmanji);
    }
}
