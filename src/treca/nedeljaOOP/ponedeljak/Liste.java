package treca.nedeljaOOP.ponedeljak;
import java.util.ArrayList;
import java.util.List;


public class Liste {




        public static void main(String[] args) {
            /*
             *
             * List<OmotacTipa> identifikator = new ArrayList<>();
             *
             * List<Integer> lista = new ArrayList<>();
             *
             * Imamo dve vrste listi
             * 1) ArrayList - koristi niz u pozadini
             * 2)
             * */

            List<Integer> lista = new ArrayList<>(); // ovo za sada je prazna lista
            int[] niz = new int[5];


            lista.add(2);
            lista.add(4);
            lista.add(7);




            /*
             * 1. add(Integer e) - dodaj int e na kraj liste
             * */
            lista.add(1); //[1] -> size() = 1
            lista.add(2); //[1, 2] -> size() = 2
            lista.add(3); //[1, 2, 3]
            lista.add(4);// [1, 2, 3, 4]
            lista.add(5);// [1, 2, 3, 4, 5] -> size() = 5

            niz[0] = 1;
            niz[1] = 2;
            niz[2] = 3;
            niz[3] = 4;
            niz[4] = 5;


            /*
             * 2. size() -> vraca duzinu liste
             * */
            System.out.println("Lista ima " + lista.size() + " elemenata.");
            System.out.println("Niz ima " + niz.length + " elemenata.");

            /*
             * 3. get(int index) -> vraca element na prosledjenom indeksu
             * Opet indekse brojimo od nule
             * */
            System.out.println("Prvi element liste je: " + lista.get(0));
            System.out.println("Prvi element niza je: " + niz[0]);

            /*
             * 4. set(int index, Integer e) -> postavlja int e na poziciju index
             * */
            //lista : [-5, 2, 3, 4, 5]
            //niz : [-5, 2, 3, 4, 5]
            lista.set(0, -5);
            niz[0] = -5;
            System.out.println("Prvi element liste je: " + lista.get(0));
            System.out.println("Prvi element niza je: " + niz[0]);
            // lista.set(100, 2); -> greska! Ne mozemo postaviti element na nepostojeci index

            /*
             * 5. remove(int index) -> brise element na poziciji index
             * */
            lista.remove(0); // [-5, 2, 3, 4, 5] -> [2, 3, 4, 5]
            /*
             * Primetimo:
             * 1. Lista je kraca za jedan element (size() = 5 -> size() = 4)
             * 2. Svi elementi "se pomeraju u levo" (lista.get(0) = 2)
             * */
            System.out.println("Sada je prvi element liste: " + lista.get(0));
            lista.remove(1); // Brise element na indeksu 1, a to je 3 -> [2, 4, 5]
            //Nizu ne mozemo da brisemo elemente
            //Za domaci, odraditi onaj zadatak sa duplikatima preko liste.

            /*
             * 6. isEmpty() -> vraca boolean ako je lista prazna
             * */
            System.out.println("Da li je moja lista prazna?");
            if (lista.isEmpty())
                System.out.println("Jeste");
            else
                System.out.println("Nije");


            /*
             * 7. Ispis liste
             * */
            System.out.println("A koji su elementi te liste?");
            //System.out.println(niz); nista nam ne znaci
            System.out.println(lista);


            lista.set(0, lista.get(0) + 5);
            System.out.println(lista);

            /*
             * 8. clear() -> brise sve elemente niza
             * */
            lista.clear();
            System.out.println(lista);
            lista.add(1);
            lista.add(2);
            lista.add(3);

        }
    }



