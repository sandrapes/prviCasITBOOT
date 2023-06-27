package druga.nedelja.sreda;

import java.util.Scanner;

public class NIzovi_Sabloni {

    public static void main(String[] args) {
        /*
         * Evo par sablona oko nizova
         * koje uvek treba znati!
         * */

        Scanner sc = new Scanner(System.in);

        /*
         * 1. Unosenje niza preko skenera
         * (ili unapred znamo njegovu duzinu ili unosimo duzinu preko skenera
         * */

        System.out.println("Unesite duzinu niza:");
        int duzina = sc.nextInt();
        double[] niz = new double[duzina]; //implicitna deklaracija niza

        System.out.println("Unesite " + duzina + " elemenata niza:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextDouble();
        }

        /*
         * 2. Ispisivanje elemenata niza
         * */
        System.out.println("Elementi niza su: ");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " "); //koristimo obican print da sve bude u jednom redu
        }
        System.out.println(); //ispisujemo samo jedan <ENTER> tj prelazimo u novi red


        /*
         * 2.5 Malo lepse formatiranje niza - ovo je sada samo igranje sa sout-om. Nista supstancijalno bitno
         * Zelimo da ispisemo niz ovako
         * [n1, n2, ... , nduzina]
         * Vidimo da:
         * 1.Imamo otovorenu uglastu zagradu [
         * 2.Nakon svakog osim poslednjeg elementa ide ", "
         * 3.Posle poslednjeg elementa niza ide zatvorena uglasta zagrada ]
         * */
        System.out.print("[");//1.
        for (int i = 0; i < niz.length - 1; i++) { //2. idemo do pretposlednjeg elementa niza jer oni prate isti sablon
            System.out.print(niz[i] + ", "); //koristimo obican print da sve bude u jednom redu
        }
        //3. ispisujemo poslednji element niza bez ", " i ispisujemo zatvorenu uglastu zagradu i novi red (tj koristimo sada println)
        System.out.println(niz[niz.length - 1] + "]"); //poslednji element niza je na poziciji duzina niza - 1!!!!


        /*
         * 3. Duboko kopiranje niza
         * */
        double[] kopija = new double[niz.length]; //kopija i original moraju biti iste duzine
        for (int i = 0; i < kopija.length; i++) { //mogli smo da idemo i do niz.length; posto je to isti interval
            kopija[i] = niz[i]; //na index i u kopiji stavljamo element na indexu i u originalu. Drugim recima, kopiramo niz element-po-element
        }

        /*
         * 4. Provera da li su dva niza identicna
         * Dva niz su identicna ako i samo ako imaju isti broj elemenata i  iste elemente na istim indexima
         *
         * */
        boolean daLiSuIsti = true; //Pretpostavljamo da su isti
        if (kopija.length == niz.length){ //ako nisu istih duzina nema sta dalje da proveravamo - nisu isti!
            for (int i = 0; i < kopija.length; i++) { //sada znamo da su barem iste duzine - tako da nije bitno do kog .length idemo
                if (kopija[i] != niz[i]){
                    //Naisli smo na dva razlicita elementa na istim indeksima ==> nisu isti
                    daLiSuIsti = false; //postavljamo da nisu isti
                    break; //izlazimo iz petlje - nije nam bitno da li su elementi na ostalim indeksima isti, ako se razlikuju za barem jedan nisu isti!
                }
            }
        }
        else{ //nisu iste duzine pa postavljamo da nisu isti
            daLiSuIsti = false;
        }
        if (daLiSuIsti){ //ako su isti ispisujemo da su isti!
            System.out.println("Isti su");
        }
        else{
            System.out.println("Nisu isti");
        }


        double[] niz2 = {1, 2, 3}; //Eksplicitno zadavanje niza
        double[] niz3;
        niz3 = new double[3]; //mozemo i ovako zadati niz
        niz3[0] = -1;
        niz3[1] = -2;
        niz3[2] = 151.1;
        double[] niz4;
        niz4 = new double[]{-1, 0.0, 1};





    }
}
