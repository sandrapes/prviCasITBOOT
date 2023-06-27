package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_20_Double_Konstante {
    public static void main(String[] args) {

        //20.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n.
        // Zatim se unose n double brojeva jedan po jedan. Cim se unese jedan od tih brojeva,
        // na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c, gde je x taj uneti broj.

        double a = 2.4;
        double b = 2.3;
        double c = 1.8;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x = sc.nextDouble();

            System.out.println(a*(x*x) + b*x + c);

        }

    }
}
