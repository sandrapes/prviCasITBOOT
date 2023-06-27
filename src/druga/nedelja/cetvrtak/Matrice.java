package druga.nedelja.cetvrtak;

public class Matrice {

    public static void main(String[] args) {

        /*
         * int[] - deklarisemo jedan niz podataka
         * <tip>[]
         * int[][] - matrica - niz nizova
         * Matrica - tabela koja samo jednu vrstu padtka
         *
         * int[][][] - niz  matrice = kocka
         *
         * */

        /*
         * [[1, 2, 3]
         * [4, 5, 6]
         * [7, 8, 9]]
         * */

        int br = 1;
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = br; //u red i u kolonu j staviti vrednost promenjive br
                br++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===================");

        int[] prviRed = a[0]; //ovo mi vraca niz - prvi red
        for (int i = 0; i < prviRed.length; i++) {
            System.out.print(prviRed[i] + " ");
        }
        System.out.println();

        //Izracunati sumu svih elemenata matrice

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[0][i] + " ");
        }
        System.out.println();


        //Izvuci u niz prvu kolonu



    }

}

