package prva.nedelja.vezbanje;

public class NekiZadatak {

    public static int nadjiNajveci (int[] niz) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {

            if(niz[i] > max)
                max = niz[i];

        }
        System.out.println("Najveci element niza je: ");
        return max;

    }

    public static void main(String[] args) {

        int[] niz = {1, 24, 52, 23, 11, 1};

        System.out.println(nadjiNajveci(niz));



    }

}
