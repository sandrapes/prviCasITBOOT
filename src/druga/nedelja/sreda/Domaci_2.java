package druga.nedelja.sreda;

public class Domaci_2 {

    public static void main(String[] args) {

        // Domaci Zadatak 2:
        //
        //Definisati dva jednaka niza brojeva, kao rezultat vratiti niz gde ce se sabrati svi elementi sa istim indeksima.

        int[] niz1 = {2, 12, 15, 3, 7, 19, 22, 34};
        int[] niz2 = {2, 12, 15, 4, 8, 19, 22, 0};

        System.out.print("Prvi niz je: ");

        int[] niz3 = new int[niz1.length];
        for (int i = 0; i < niz1.length ; i++) {
            System.out.print(niz1[i] + " ");

                niz3[i] = niz1[i] + niz2[i];

            }
        System.out.println();
        System.out.print("Drugi niz je: ");

        for (int i = 0; i < niz2.length; i++) {
            System.out.print(niz2[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < niz1.length; i++) {

            System.out.println(i + "-i element novog niza je: " + niz3[i] + " ");
        }

    }



}








