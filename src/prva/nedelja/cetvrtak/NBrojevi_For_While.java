package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class NBrojevi_For_While {
    public static void main(String[] args) {

        // 3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
        //        //*   a) [1, n]
        //        //   b) [-14, 2n]
        //        //*   c) [n, -n]

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //1)

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }


        System.out.println("=============================");

        int i = 1;

        while (i <= n) {
            System.out.println(i);
            i++;
        }

        //2)

        System.out.println("=============================================");

        for (int j = -14; j <= n*2; j++) {
            System.out.println(j);
        }

        System.out.println("=============================================");

        //SA WHILE

        int j = -14;

        while (j <= n*2) {

            System.out.println(j);
            j++;
        }

        //3)
        System.out.println("=============================================");

        for (int k = n; k >= -n; k--) {
            System.out.println(k);
        }

        //SA WHILE
        System.out.println("=============================================");

        int k = n;

        while (k >= -n);

        System.out.println(k);
        k--;



    }
}

