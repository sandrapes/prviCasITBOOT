package druga.nedelja.petak;

public class Zadatak_4 {

    //4. Napisati funkciju koja proverava da li prosledjeni ceo broj
    //*    se nalazi u proslednjenom nizu celih brojeva.

    public static boolean proveriBroj (int[] niz, int a) {

        boolean b = true;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] == a) {

                b = true;
                break;
            }
            else b = false;

        }
        return b;

    }

    public static void main(String[] args) {
        int[] niz = {1, 12, 45, 22, 1, 23, 44, 4, 5};
        int x = 12;

        if (proveriBroj(niz, x))
            System.out.println("Postoji u nizu.");
        else
            System.out.println("Ne postoji u nizu.");


    }




}
