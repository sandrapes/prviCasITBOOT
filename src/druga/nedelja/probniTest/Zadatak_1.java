package druga.nedelja.probniTest;

import java.util.Scanner;

public class Zadatak_1 {

    /// 1. Napisati funkciju unosBrojeva koja omogucava korisniku da unosi cele
    //brojeve sve dok ne unese 0 i zatim ispisuje poruku:

    //1 Suma unetih brojeva je: <suma_unetih_brojeva >
    //2 Proizvod unetih brojeva je: <proizvod_unetih_brojeva >
    //3 Srednja vrednost unetih brojeva je: < srednja_vrednost_brojeva >

    public static void unosBrojeva () {

        Scanner sc = new Scanner(System.in);

       int broj = sc.nextInt();

       int suma = 0;
       int proizvod = 1;
       int brojac = 0;

       while (broj != 0) {

           brojac++;
           suma += broj;
           proizvod *= broj;
           broj = sc.nextInt();
       }

        System.out.println("Suma unetih brojeva je: " + suma);
        System.out.println("Proizvod unetih brojeva je: " + proizvod);
        System.out.println("Srednja vrednost unetih brojeva je: " + suma * 1.0 / brojac );


        }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        unosBrojeva();
    }


}







