package druga.nedelja.sreda;

public class Zadatak_2_Niz_Brojeva_Zbir_Razlika {

    public static void main(String[] args) {

        //Zadatak 2: Napraviti niz int-ova gde cete kao rezultat vratiti dve vrednosti,
        // jedna ce biti zbir svih parnih a druga zbir svih neparnih brojeva.

        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int zbir1 = 0;
        int zbir2 = 0;

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                zbir1 += niz[i];

            }
            if (niz[i] % 2 !=0) {
                zbir2 += niz[i];
            }

        }
        System.out.println(zbir1);
        System.out.println(zbir2);


    }
}
