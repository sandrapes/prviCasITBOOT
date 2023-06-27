package prva.nedelja.petak;

import java.util.Scanner;

public class Domaci_1_Ceo_broj {
    public static void main(String[] args) {

        //Domaci Zadatak 1:
        //Uneti neki ceo broj N preko Scannera. Proci kroz svaki broj od 0 do N i za svaki broj koji je
        //deljiv sa 3 istampati “Fizz”, za svaki broj koji je deljiv sa 5 ispisujemo “Buzz”, a u slucaju da
        //je broj deljiv i sa 5 i sa 3, ispisujemo “FizzBuzz” (Obratiti paznju da broj bude pozitivan)

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite neki broj: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 == 0) {

                    System.out.println( i + " FizzBuzz ");
                    continue;
                }
            else if (i % 5 == 0) {

                System.out.println( i + " Buzz ");
                continue;
            }
            else if (i % 3 == 0) {
                System.out.println( i + " Fizz ");
            }

            System.out.println(i);
            }


    }
}
