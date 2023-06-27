package prva.nedelja.petak;

public class NizBrojeva {
    public static void main(String[] args) {

        //definisati niz brojeva od 1 do 10 i  istampati samo parne brojeve

        int [] niz = new int[10];
        niz[0] = 1;
        niz[1] = 2;
        niz[2] = 3;
        niz[3] = 4;
        niz[4] = 5;
        niz[5] = 6;
        niz[6] = 7;
        niz[7] = 8;
        niz[8] = 9;
        niz[9] = 10;

        for (int i = 1; i < niz.length; i+= 2) {
            System.out.println(niz[i]);

        }
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0) {
                System.out.println(niz[i]);
            }

        }



    }
}
