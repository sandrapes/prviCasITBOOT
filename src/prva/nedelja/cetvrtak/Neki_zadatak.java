package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Neki_zadatak {

    public static void main(String[] args) {

        // 3. Racuna zbir prvih n brojeva

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int zbir = 0;

        for (int i = 1; i <= n; i++) {

           zbir += i;
        }
        System.out.println(zbir);






    }
}
