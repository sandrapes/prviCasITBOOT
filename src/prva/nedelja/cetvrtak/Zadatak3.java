package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String odgovor = a % 2 == 0 ? "Paran" : "Neparan";

        System.out.println(odgovor);



    }
}
