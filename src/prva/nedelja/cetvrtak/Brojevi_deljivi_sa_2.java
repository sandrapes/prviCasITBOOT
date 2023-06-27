package prva.nedelja.cetvrtak;

public class Brojevi_deljivi_sa_2 {
    public static void main(String[] args) {

        // 1. Napisati program koji ispisuje sve parne brojeve od 1 do 100

        for (int i = 2; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        // SA WHILE

        int i = 1;

        while (i <= 100) {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);

            }


        }





    }
}

