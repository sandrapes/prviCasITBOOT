package prva.nedelja.vezbanje;

import java.util.Scanner;

public class SvakiTreciElementObrnutimRedosledom {
    public static void main(String[] args) {

        // 4. -//-. Ispisati svaki treci element u obrnutom redosledu.


        Scanner sc = new Scanner(System.in);

        int duzinaNiza = sc.nextInt();
        int[] niz = new int[duzinaNiza];

        for (int i = 0; i < niz.length; i++) {

            int elementi = sc.nextInt();
            niz[i] = elementi;

        }

        for (int i = niz.length - 1; i >= 0; i -= 3) {

            System.out.print(niz[i] + " ");

        }

    }
}
