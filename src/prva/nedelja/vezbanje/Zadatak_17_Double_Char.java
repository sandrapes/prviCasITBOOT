package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_17_Double_Char {

    public static void main(String[] args) {

        // 17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^}
        // i ispisuje resenje odgovarajuce operacije.

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite neki broj: ");
        double a = sc.nextDouble();

        System.out.println("Unesite znak operacije: ");
        char operacija = sc.next().charAt(0);

        System.out.println("Unesite drugi broj: ");
        double b = sc.nextDouble();

        switch (operacija) {
            case '+':
                System.out.println("Zbir tih brojeva je: " + (a + b));
                break;
            case '-':
                System.out.println( "Razlika tih brojeva je: " + (a - b));
                break;
            case '*':
                System.out.println("Proizvod tih brojeva je: " + a * b);
                break;
            case '/':
                System.out.println( "Kolicnik tih brojeva je: " + a / b);
                break;
            case '%':
                System.out.println( "Ostatak pri deljenju je: " + a % b);
                break;
            case '^':
                System.out.println( "A na B je : " + Math.pow(a,b));
                break;
            default:
                System.out.println("Pokusajte ponovo.");

        }

    }
}
