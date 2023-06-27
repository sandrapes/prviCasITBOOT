package druga.nedelja.sreda;

public class Prazni_Null_nizovi {

    public static void main(String[] args) {
        /*
         * Razlika izmedju 0 i nicega u programiranju
         * 0 - kroz zicu ne tece struja
         * nista - nemas zicu - NULL
         * */

        //Prazan niz
        int[] prazanNiz = new int[0]; //niz duzine nule - implicitno zadavanje praznog niza
        double[] prazanNiz2 = {}; //duzina nula - eksplicitno zadavanje praznog niza
        if (prazanNiz == null){
            System.out.println("Prazan niz nije isto sto i null niz");
        }
        System.out.println(prazanNiz2.length); //ispis je 0

        //Null niz
        int[] nullNiz = null;
        if (nullNiz == null){
            System.out.println("Ovo je dozvoljeno");
        }
        System.out.println(nullNiz.length);//greska - nemamo nikakav niz da bi ispisivali njenu duzinu


    }
}
