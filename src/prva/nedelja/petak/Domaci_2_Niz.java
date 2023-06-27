package prva.nedelja.petak;

public class Domaci_2_Niz {
    public static void main(String[] args) {

        //Domaci Zadatak 2:
        //Definisati neki niz brojeva. Zatim:
        //a) Svaki parni broj u nizu povecati za 1
        //b) Svaki broj na parnoj poziciji povecati za 2
        //(U ovom zadatku niz je od 1 do 10) (Ovaj zadatak uraditi ili u dve posebne klase ili dve posebne
        //petlje)


        int[] niz = {13, 26, 50, 71, 16, 19, 24, 25, 34, 21};

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                System.out.println(niz[i] + 1);
                }
        }

            System.out.println("==========================================================");


            for (int j = 1; j < niz.length; j += 2) {

                System.out.println(niz[j] + 2);
            }


    }


}



