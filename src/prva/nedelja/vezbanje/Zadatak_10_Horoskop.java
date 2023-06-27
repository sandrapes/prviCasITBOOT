package prva.nedelja.vezbanje;

import java.util.Scanner;

public class Zadatak_10_Horoskop {

    public static void main(String[] args) {

        // Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        // Ovan: od 21. marta do 20. aprila
        // Bik: od 21. aprila do 21. maja
        // Blizanci: od 22. maja do 21. juna
        // Rak: od 22. juna do 22. jula
        // Lav: od 23. jula do 22. avgusta
        // Devica: od 23. avgusta do 22. septembra
        // Vaga: od 23. septembra do 23.oktobra
        // Škorpija: od 24. oktobra do 22. novembra
        // Strelac: od 23. novembra do 21. decembra
        // Jarac: od 22. decembra do 20. januara
        // Vodolija: od 21. januara do 19. februara
        // Ribe: od 20. februara do 20. marta

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dan rodjenja");
        int dan = Integer.parseInt(sc.nextLine());

        System.out.println("Unesite mesec rodjenja");
        String mesec = sc.nextLine();




        if (((dan >= 21 && dan <= 31) && mesec.equalsIgnoreCase("mart")) ||
                (dan >= 1 && dan <= 20) && mesec.equalsIgnoreCase("april")) {
            System.out.println("Ovan");
        }
        else if (((dan >= 21 && dan <= 30) && mesec.equalsIgnoreCase("april")) ||
                (dan >= 1 && dan <= 21) && mesec.equalsIgnoreCase("maj")) {
            System.out.println("Bik");}

        else if (((dan >= 22 && dan <= 31) && mesec.equalsIgnoreCase("maj")) ||
                    (dan >= 1 && dan <= 21) && mesec.equalsIgnoreCase("jun")) {
                System.out.println("Blizanci");}

        else if (((dan >= 22 && dan <= 30) && mesec.equalsIgnoreCase("jun")) ||
                (dan >= 1 && dan <= 22) && mesec.equalsIgnoreCase("jul")) {
            System.out.println("Rak");}

        else if (((dan >= 23 && dan <= 31) && mesec.equalsIgnoreCase("jul")) ||
                (dan >= 1 && dan <= 22) && mesec.equalsIgnoreCase("avgust")) {
            System.out.println("Lav");}

        else if (((dan >= 23 && dan <= 31) && mesec.equalsIgnoreCase("avgust")) ||
                (dan >= 1 && dan <= 22) && mesec.equalsIgnoreCase("septembar")) {
            System.out.println("Devica");}

        else if (((dan >= 23 && dan <= 30) && mesec.equalsIgnoreCase("septembar")) ||
                (dan >= 1 && dan <= 23) && mesec.equalsIgnoreCase("oktobar")) {
            System.out.println("Vaga");}

        else if (((dan >= 24 && dan <= 31) && mesec.equalsIgnoreCase("oktobar")) ||
                (dan >= 1 && dan <= 22) && mesec.equalsIgnoreCase("novembar")) {
            System.out.println("Skorpija");}

        else if (((dan >= 23 && dan <= 30) && mesec.equalsIgnoreCase("novembar")) ||
                (dan >= 1 && dan <= 21) && mesec.equalsIgnoreCase("decembar")) {
            System.out.println("Strelac");}

        else if (((dan >= 22 && dan <= 31) && mesec.equalsIgnoreCase("decembar")) ||
                (dan >= 1 && dan <= 20) && mesec.equalsIgnoreCase("januar")) {
            System.out.println("Jarac");}

        else if (((dan >= 21 && dan <= 31) && mesec.equalsIgnoreCase("januar")) ||
                (dan >= 1 && dan <= 19) && mesec.equalsIgnoreCase("februar")) {
            System.out.println("Vodolija");}

        else if (((dan >= 20 && dan <= 29) && mesec.equalsIgnoreCase("februar")) ||
                (dan >= 1 && dan <= 20) && mesec.equalsIgnoreCase("mart")) {
            System.out.println("Blizanci");}

        else System.out.println("Pogresan datum");

    }
}
