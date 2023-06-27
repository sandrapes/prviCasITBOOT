package prva.nedelja.petak;

import java.util.Scanner;

public class Vezba {

    public static void main(String[] args) {

        //korisnik unosi double sve dok ne unese 0.0
        //onda se racuna zbir brojeva

        Scanner sc = new Scanner(System.in);

        double broj = sc.nextDouble();

        double zbir = 0;

        while (broj != 0.0) {

            zbir += broj;
            broj = sc.nextDouble();

        }
        System.out.println(zbir);

    }
}
