package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_26_Prestupna_Godina {

    public static void main(String[] args) {

        // 26.* Za unete dve godine g1 i g2 ispisati koliko ima prestupnih godina u intervalu [g1, g2].
        // Godina je prestupna ako:
        //- Deljiva je sa 4
        //- Nije deljiva sa 100 ili je deljiva sa 400

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite godinu: ");
        int g1 = sc.nextInt();

        System.out.println("Unesite drugu godinu: ");
        int g2 = sc.nextInt();


        int brojac = 0;
        if (g1 > g2) {
            for (int i = g2; i <= g1; i++) {
                if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                    brojac++;
                }

            }
        }
        else {
            for (int i = g1; i <= g2; i++) {
                if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0 )) {
                        brojac++;
                }


                }
            }
        System.out.println(brojac);



        }
    }


