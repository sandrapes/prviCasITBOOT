package druga.nedelja.sreda;

public class Poredjenje_nizova {

    public static void main(String[] args) {

        int[] niz1 = {15, 14, 88, 2, 17};
        int[] niz2 = {15, 14, 88, 89, 45};

        // prvo poredimo length

        boolean daLiJeIsti = true;
        if (niz1.length == niz2.length) {
            for (int i = 0; i < niz1.length; i++) {
                if (niz1[i] != niz2[i]) {
                    daLiJeIsti = false;
                    break;

                }

            }
        }
        else
            daLiJeIsti = false;

        if (daLiJeIsti) {
            System.out.println("Isti su");
        }
        else
            System.out.println("Nisu isti");


    }
}
