package druga.nedelja.cetvrtak;

public class UporedjivanjeNiza_Funkcija {

static boolean poredjenjeNiza( int[] niz1, int[] niz2) {

    boolean b = true;
    if (niz1.length == niz2.length) {
        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] != niz2[i]) {
                b = false;
                break;
            }

        }
    }
    else
        b = false;

    return b;

}

    public static void main(String[] args) {

    int[] niz1 = {2, 5, 7, 8, 9};
    int[] niz2 = {2, 5, 7, 8, 3};

        //System.out.println(poredjenjeNiza(niz1, niz2));

        if (!poredjenjeNiza(niz1, niz2))
            System.out.println("Niz nije isti.");
        else
            System.out.println("Niz je isti");


    }
}

