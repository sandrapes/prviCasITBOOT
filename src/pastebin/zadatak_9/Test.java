package pastebin.zadatak_9;

public class Test {

    public static void main(String[] args) {

        String s = "Sandra Pesic";
        String a = "Milan Vuckovic";
        String b = "Natalija Tosic";

        double brzina = 120.2;

        Osoba n = new Osoba("Nikola", "Markovic");
        Osoba m = new Osoba("Marko", "Markovic");
        Automobil auto = new Automobil("Audi", 2015, 500);
        Grad gradic = new Grad("Beograd", 7000, "Srbija");


        Putovanje p = new Putovanje(gradic, n, auto, 420);

        //System.out.println(p);
       // p.prijava(n);
        //p.prijava(m);

        //System.out.println(p);

        System.out.println(p.vremeDoDestinacije(brzina));




    }
}
