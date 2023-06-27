package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_5_Cetvorocifreni_broj {
    public static void main(String[] args) {

        // Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.
        // (prva * druga) - (treca + cetvrta)

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int prva = a / 1000;

        System.out.println(prva);

        int druga = (a - (prva * 1000)) / 100;

        System.out.println(druga);

        int treca  =  (a - (prva * 1000) - (druga * 100)) / 10;

        System.out.println(treca);

        int cetvrta = a - (prva * 1000) - (druga * 100) - (treca * 10);

        System.out.println(cetvrta);

        System.out.println((prva * druga) - (treca + cetvrta) );





    }
}
