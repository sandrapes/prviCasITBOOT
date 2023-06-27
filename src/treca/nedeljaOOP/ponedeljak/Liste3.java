package treca.nedeljaOOP.ponedeljak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Liste3 {

        public static void main(String[] args) {
            List<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); //int[] a = new int[]{1, 2, 3, 4, 5};
            System.out.println(lst);
            List<Integer> lista = List.of(-1, -2, -3, -4, -5, -6, -7); //int[] b = {-1, -2, -3, -4, -5, -6, -7};
            System.out.println(lista);


            /*
             * 9. contains(Object o) -> za prosljedjen "broj" (objekat) vrati boolean da li postoji u nizu
             * */
            System.out.println("Da li broj 2 postoji u lst listi?");
            boolean daLiPostoji = lst.contains(2);
            if (daLiPostoji)
                System.out.println("Postoji");
            else System.out.println("Ne postoji");
            System.out.println("Da li postoji broj 100 u lst listi? A: " + lst.contains(100));


            /*
             * 10. equals(Object o) -> provera da li su dve "liste" iste
             * */
            if (lst.equals(lista))
                System.out.println("Liste su iste");
            else
                System.out.println("Liste su razlicite");

            System.out.println(Arrays.toString(new int[]{1, 2, 3}));



        }
}
