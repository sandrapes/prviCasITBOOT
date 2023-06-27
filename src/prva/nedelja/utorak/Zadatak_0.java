package prva.nedelja.utorak;

import java.util.Scanner;

public class Zadatak_0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jedan broj: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Unesite drugi broj: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Zbir tih brojeva je: " + (a + b));
        System.out.println("Razlika tih brojeva je: " + (a - b));
        System.out.println("Proizvod tih brojeva je: " + a * b);
        System.out.println("Kolicnik tih brojeva je: " + a / b);
        System.out.println("Ostatak pri deljenju je: " + a % b);




    }
}
