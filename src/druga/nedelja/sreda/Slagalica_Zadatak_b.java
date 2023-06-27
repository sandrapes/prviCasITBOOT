package druga.nedelja.sreda;

import java.util.Scanner;

public class Slagalica_Zadatak_b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String najduza = "";
        String unos = sc.next();
        while (!unos.equalsIgnoreCase(".")){
            if (unos.length() >= najduza.length()){
                najduza = unos;
            }
            unos = sc.next();
        }
        System.out.println("Najduza rec je: " + najduza);
        System.out.println("br poena je: " + najduza.length()*2);
    }
}
