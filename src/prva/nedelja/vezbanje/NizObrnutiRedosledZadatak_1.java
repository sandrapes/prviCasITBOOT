package prva.nedelja.vezbanje;

import java.util.Scanner;

public class NizObrnutiRedosledZadatak_1 {
    public static void main(String[] args) {

        //1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        //Primer: [4, 2, 3, 5] -> 5 3 2 4

        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt();

        int[] brojeviNiza = new int[duzinaNiza];

        for (int i = 0; i < brojeviNiza.length ; i++) {

            int elementi = sc.nextInt();
            brojeviNiza[i] = elementi;


        }

        for (int i = brojeviNiza.length - 1; i >= 0; i--) { //wtf sta je sad ovo

            System.out.print(brojeviNiza[i] + ", ");
            // ne znam logiku iza ovoga. pistolj da mi prislonis na celo ne bih se setila da ga uradim ovako


        }


    }
}
