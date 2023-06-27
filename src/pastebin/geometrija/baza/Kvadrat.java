package pastebin.geometrija.baza;

public class Kvadrat extends Pravougaonik {

    //Napisati klasu Kvadrat koja nasledjuje kalsu Pravougaonik i nema atribute
    //
    //Napisati sve odogvarajuce konstruktore pazeci na logiku
    //
    //Overridovati metode:
    //1. getIme() - vraca "Kvadrat"


    public Kvadrat(double a, double b) {
        super(a, b);
    }

    @Override
    public String getIme() {
        return "Kvadrat";
    }
}
