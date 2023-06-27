package druga.nedelja.petak;

import java.util.Scanner;

public class DrugiZadaci_Funkcije_Nizovi {

    // 1. (15. - drugi deo) Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

    //2. Napisati funkciju koja prima dva imena i niz imena i proverava da li se bilo koje od ta dva prosledjena
    // imena nalaze u prosledjenom nizu imena.

    //3. (13.* prvi deo - da ne zaboravim) Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
    // koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
    // (dakle 1 + 2 + 3 + ... + t).

    static boolean poredjenjeSumeOdProizvoda (int[] niz) {

        int suma = 0;
        int proizvod = 1;
        boolean b = true;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
            proizvod *= niz[i];
        }
        if (suma > proizvod)
            return b;
        else
            return !b;
    }


    static boolean pretragaImenaUNizu (String[] niz, String a, String b) {

        for (int i = 0; i < niz.length ; i++) {
            if (niz[i].equalsIgnoreCase(a) || niz[i].equalsIgnoreCase(b)) {
                return true;
            }

        }
        return false;
    }

    //3. (13.* prvi deo - da ne zaboravim) Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
    // koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja
    // (dakle 1 + 2 + 3 + ... + t).


    static void nekaLudaSuma(int n){

        for (int t = 1; t < n; t++){
            //Sumu od 1 ... t
            int sum = 0;
            for (int i = 1; i <= t; i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }






    public static void main(String[] args) {






    }



}
