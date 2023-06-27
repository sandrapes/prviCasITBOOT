package cetvrta.nedeljaOOP.test;

import java.util.ArrayList;


public class Test {


    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {



        ArrayList<String> recenzije = new ArrayList<>();

        recenzije.add("Odlican");
        recenzije.add("Doabar");
        recenzije.add("super");
        recenzije.add("vrlo dobar");


        Restoran r1 = new Restoran("Neki Restoran", 5.0, 3, recenzije, 20);

        System.out.println(r1);



    }
}



