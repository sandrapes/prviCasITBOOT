package pastebin.geometrija.baza;

public class Elipsa extends Figura {

    //Napisati klasu Elipsa koja nasledjuje klasu Figura i ima atribute
    //- double a, b
    //
    //Napisati sve odogvarajuce konstruktore pazeci na logiku
    //
    //Napisati sve settere i gettere
    //
    //Implementovati metode:
    //1. getIme() - vraca "Elipsa"
    //2. obim() - vraca 0 ; nije analiticki resivo :(
    //3. povrsina()

    private double a, b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Elipsa(double a, double b) {


        this.a = a;
        this.b = b;
    }

    @Override
    public String getIme() {
        return "Elipsa";
    }

    @Override
    public double obim() {
        return 0;
    }

    @Override
    public double povrsina() {
        return Math.PI * a * b;
    }
}
