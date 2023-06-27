package druga.nedelja.vezbanjeZaTest;

import javax.imageio.stream.ImageInputStream;

public class Zadatak_15paNadalje {

    // 15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

    static boolean daLiJeSumaVecaOdProizvoda(int[] niz) {

        boolean b = true;

        int suma = 0;
        int proizvod = 1;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
            proizvod *= niz[i];
        }

        if (suma > proizvod) {
            return true;
        } else
            return false;

    }

    // 17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

    public static void daLiImePostoji(String[] niz) {

        boolean b = true;

        for (int i = 0; i < niz.length; i++) {

            if (niz[i].equalsIgnoreCase("Marija") || niz[i].equalsIgnoreCase("Petar")) {
                b = false;
            }

        }
        if (!b)
            System.out.println("Postoji");
        else
            System.out.println("Ne postoji");

    }

    // 18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.

    public static void deljenjeISabiranjeNiza(int[] niz) {

        int[] niz1 = new int[niz.length];
        int[] niz2 = new int[niz.length];


        if (niz.length % 2 == 0) {
            niz1 = new int[niz.length / 2];
            niz2 = new int[niz.length / 2];

            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length];

            }

        } else {
            niz1 = new int[(niz.length / 2) + 1];
            niz2 = new int[(niz.length / 2) + 1];

            for (int i = 0; i < niz1.length; i++) {
                niz1[i] = niz[i];
                niz2[i] = niz[i + niz1.length - 1];

            }
        }

        int[] resenjeNiz = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            resenjeNiz[i] = niz1[i] + niz2[i];
            System.out.println(resenjeNiz[i]);
        }


    }

    // 19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.

    static void sabiranjeDvaNiza(int[] niz1, int[] niz2) {

        int[] noviNiz = new int[1];

        if (niz1.length > niz2.length) {

            noviNiz = new int[niz1.length];

            for (int i = 0; i < niz2.length; i++) {
                noviNiz[i] = niz1[i] + niz2[i];

            }
            for (int i = niz2.length; i < noviNiz.length; i++) {
                noviNiz[i] = niz1[i];

            }

        } else {
            noviNiz = new int[niz2.length];

            for (int i = 0; i < niz1.length; i++) {
                noviNiz[i] = niz1[i] + niz2[i];
            }

            for (int i = niz1.length; i < noviNiz.length; i++) {
                noviNiz[i] = niz2[i];

            }

        }

        for (int i = 0; i < noviNiz.length; i++) {
            System.out.println(noviNiz[i] + " ");
        }


    }

    // 32. Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta udesno
    // [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]

    public static int[] rotiranjeMestaUdesno (int[] niz) {

        int[] rotiraniNiz = new int[niz.length];

        for (int i = 0; i < 2; i++) {
            rotiraniNiz[i] = niz[niz.length - 2 + i];

        }

        for (int i = 0; i < niz.length - 2; i++) {
            rotiraniNiz[i + 2] = niz[i];
        }

    return rotiraniNiz;
    }


    // 32. Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta ulevo
    // [1, 2, 3, 4, 5] -> [3, 4, 5, 1, 2]

    public static int[] rotiranjeMestaUlevo (int[] niz) {

        int[] rotiraniNiz = new int[niz.length];

        for (int i = 0; i < niz.length - 2; i++) {
            rotiraniNiz[i] = niz[i + 2];

        }
        for (int i = 0; i < 2; i++) {
            rotiraniNiz[i + niz.length - 2] = niz[i];

        }


        return rotiraniNiz;

    }




    public static void ispisiNiz (int[] niz) {

        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
    }


    // 25.
    //a)Napisati funkciju koja konvertuje stepene u radijane.
    //b)Napisati funkciju koja konvertuje radijane u stepene.
    //(360 stepeni = 2*PI radijana)


    public static double stepeniUradijane (double stepeni) {

        double radijani = stepeni * Math.PI / (360.0 / 2);

        return radijani;

    }

    public static double radijaniUStepene (double radijani) {

        double stepeni =  radijani * (360.0 /2) / Math.PI;

                return stepeni;

    }


    // 26. Napisati funkciju koji za zadat ugao u radijanima racuna zbir sinusa, kosinusa, tangensa i kotangensa tog ugla.










/// poredjenje elemenata u nizu

    public static String[] imenaPoredjenje(String[] niz) {

        int brojac=0;

        for(int i=0; i<niz.length;i++) {
            String trenutni = niz[i];
            for(int j = i+1; j< niz.length;j++) {
                if(trenutni.equalsIgnoreCase(niz[j]) && !trenutni.equalsIgnoreCase("")) {
                    niz[j] = "";
                    brojac++;
                }
            }
        }
        String[] rezultat = new String[niz.length-brojac];
        int j =0;
        for(int i=0; i< niz.length;i++) {
            if(!niz[i].equalsIgnoreCase("")) {
                rezultat[j] = niz[i];
                j++;
            }
        }
        return rezultat;
    }









        public static void main (String[]args){

          //  Given a list of integers, determine whether the sum of its elements is odd or even.

           // Give your answer as a string matching "odd" or "even".

                    //If the input array is empty consider it as: [0] (array with a zero).


            int[] niz = {1, 2, 3};

            int a = 50;

            double time = 3;

            //System.out.println(radijaniUStepene(a));






        }





    }


