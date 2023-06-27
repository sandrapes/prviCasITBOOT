package pastebin.zadatak5;

public class TrougaoTest {

    public static void main(String[] args) {

        Zadatak_5_trougao nekiTrougao = new Zadatak_5_trougao(5.2, 3.0, 1.0);

        nekiTrougao.daLiJeValidan();

        if (nekiTrougao.daLiJeValidan()) {
            System.out.println("Obim je: " + nekiTrougao.obim());
            System.out.println("Povrsina je: " + nekiTrougao.povrsina());
        }


        System.out.println(nekiTrougao);

    }
}
