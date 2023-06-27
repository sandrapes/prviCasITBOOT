package prva.nedelja.cetvrtak;

import java.util.Scanner;

public class Domaci_1_Stop_String {
    public static void main(String[] args) {

        //Domaci Zadatak 1:
        //Napraviti program koji ce Vam omoguciti da unosite neke Stringove sve dok ne napisete "stop".
        //Nakon sto napisete "stop", program treba da ispise sve Stringove koje ste do tada uneli.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neke stringove: ");
        String s = sc.nextLine();

        String str = " ";

        while (!s.equalsIgnoreCase("stop")) {

                str += s;
                s = sc.nextLine();

            }
        System.out.println(str);



    }
}


















