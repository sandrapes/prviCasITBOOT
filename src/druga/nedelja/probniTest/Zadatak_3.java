package druga.nedelja.probniTest;

public class Zadatak_3 {

    /// 3. Napisati funkciju rotirajULevo koja prima niz celih brojeva i vraca taj niz
    //zarotiran za jedno mesto u levo.
    //Primer a)
    //1 Input : [1, 2, 3, 4, 5]
    //2 Output : [2, 3, 4, 5, 1]


    public static int[] zarotirajUlevo (int[] niz) {

        int[] rotiraniNiz = new int[niz.length];

        for (int i = 0; i < rotiraniNiz.length - 1; i++) {
            rotiraniNiz[i] = niz[i + 1];

        }
        for (int i = 0; i < 1; i++) {
            rotiraniNiz[rotiraniNiz.length - 1] = niz[i];

        }
        System.out.println("Zarotirani niz je: ");
        return rotiraniNiz;

    }


    public static void stampajNiz (int[] niz) {



        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] niz = {1, 2, 3, 4, 5};

       stampajNiz(zarotirajUlevo(niz));



    }




}
