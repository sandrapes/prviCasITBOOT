package druga.nedelja.vezbanjeZaTest;

public class ZbirDrugogNajvecegIDrugogNajmanjeg {

    public static void main(String[] args) {
        //14.* Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.

        int[] niz = {32, 43, 2, 26, 4, 13, 45, 17};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int drugiMin = Integer.MAX_VALUE;
        int drugiMax = Integer.MIN_VALUE;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i] > max) {
                max = niz[i];
            }
            if (niz[i] < min) {
                min = niz[i];

            }

            }

        int[] noviNiz = new int[niz.length - 2];

        int brojac = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != min && niz[i] != max) {
                noviNiz[brojac] = niz[i];
                brojac++;

            }

        }


        for (int i = 0; i < noviNiz.length; i++) {
            if (noviNiz[i] < drugiMin) {
                drugiMin = noviNiz[i];
            }
            if (noviNiz[i] > drugiMax) {
                drugiMax = noviNiz[i];
            }


        }


        System.out.println(min);
        System.out.println(max);
        System.out.println(drugiMin);
        System.out.println(drugiMax);



            }



        }




