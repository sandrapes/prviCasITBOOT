package treca.nedeljaOOP.ponedeljak;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Liste2 {

        static List<Double> kreirajListu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Unesite koliko elemenata zelite da ubacite u listu:");
            int n = sc.nextInt();
            List<Double> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lista.add(sc.nextDouble());
            }
            return lista;
        }

        //Ispisati svaki drugi element liste
        static void svakiDrugiElement(List<Double> lista){
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.print(lista.get(i) + " ");
            }
            System.out.println();
        }

        static double sumaListe(List<Double> lista){
            double sum = 0;
            for(Double d : lista)
                sum += d;
            return sum;
        }

        public static void main(String[] args) {
            List<Double> lista = kreirajListu();
            System.out.println(lista);
            svakiDrugiElement(lista);
            System.out.println(sumaListe(lista));
        }
}
