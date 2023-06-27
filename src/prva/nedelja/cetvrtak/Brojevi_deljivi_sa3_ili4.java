package prva.nedelja.cetvrtak;

public class Brojevi_deljivi_sa3_ili4 {

    public static void main(String[] args) {

        //2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else if (i % 4 == 0) {
                System.out.println(i);
            }
        }

            // SA WHILE

        int i = 1;

        while (i <= 100) {
            i++;
            if (i % 3 ==0) {
                System.out.println(i);
            } else if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
