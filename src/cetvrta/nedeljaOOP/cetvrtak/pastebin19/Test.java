package cetvrta.nedeljaOOP.cetvrtak.pastebin19;

public class Test {

    public static void main(String[] args) {

        Auto a = new Auto("Audi", "a4", 200);

        System.out.println(a);

        a.pokreniSe();
        System.out.println(a.potrosnja());

        Osoba o = new Osoba("Marko", "Markovic", 44);

        System.out.println(o);
    }
}
