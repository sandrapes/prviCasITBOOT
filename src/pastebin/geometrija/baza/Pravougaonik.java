package pastebin.geometrija.baza;

public class Pravougaonik extends Paralelogram {

    //Napisati klasu Pravougaonik koja nasledjuje klasu Paralelogram i nema atribute
    //
    //Napisati sve odgovarajuce konstruktore pazeci na logiku
    //
    //Implementovati metode:
    //1. povrsina()
    //
    //Overridovati metode:
    //1. getIme() - vraca "Pravougaonik"


    public Pravougaonik(double a, double b) {
        super(a, b);
    }

    @Override
    public double povrsina() {
        return getA() * getB();
    }

    @Override
    public String getIme() {
        return "Pravougaonik";
    }
}
