package druga.nedelja.sreda;

public class Duboko_Kopiranje_Niza {

    public static void main(String[] args) {

        int[] niz = {1, 5, 8, 45, 77, 12, 4};

        int[] kopija = new int[niz.length];

        for (int i = 0; i < kopija.length; i++) {
            kopija[i] = niz[i];
            System.out.println(kopija[i]);
        }

        System.out.println("============================================");


        String[] nizStringova = {"Sandra", "Dejan", "Natalija"};

        String[] kopijaNizaStringova = new String[nizStringova.length];

        for (int i = 0; i < kopijaNizaStringova.length; i++) {
            kopijaNizaStringova[i] = nizStringova[i];
            System.out.println(kopijaNizaStringova[i]);

        }

        System.out.println("============================================");

        double[] nizDouble = {4.2, 1.2, 40.0, 48.1};

        double[] kopijaNizaDouble = new double[nizDouble.length];

        for (int i = 0; i < kopijaNizaDouble.length; i++) {

            kopijaNizaDouble[i] = nizDouble[i];
            System.out.println(kopijaNizaDouble[i]);

        }





    }
}
