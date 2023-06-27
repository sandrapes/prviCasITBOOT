package druga.nedelja.sreda;

import java.util.Scanner;

public class Beskonacna_petlja {

    public static void main(String[] args) {


        /*
         * Beskonacna petlja
         * while (true) {
         *   //kad-tad trebati neki break; uvek ce biti u nekom if-u
         * }
         *
         * for(;true;){
         *
         * }
         *
         * */

        //Korisnik unosi brojeve sve dok ne unese 0. Ispisati sumu
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int br = sc.nextInt();
            if (br == 0)
                break;
            sum += br;
        }
        System.out.println(sum);

        //Dobro je koristiti kada hocemo korisnika da nateramo na neki specifican
        //unos - npr da unese pozitivan broj.
    }
}
