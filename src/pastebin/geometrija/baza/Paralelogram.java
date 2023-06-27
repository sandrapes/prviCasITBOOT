package pastebin.geometrija.baza;

public abstract class Paralelogram extends Figura {


    //Napisati abstraktnu klasu Paralelogram koja prosiruje klasu Figure i ima atribute:
    //- double a, b;
    //
    //Napraviti konstruktor koji prima sve argumente pazeci na logiku.
    //
    //Napisati sve gettere i settere
    //
    //Implementovati metode
    //1. getIme() - vraca "Paralelogram"
    //2. obim()

    private double a, b;

    public Paralelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

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


    @Override
    public String getIme() {
        return "Paralelogram";
    }

    @Override
    public double obim() {
        return (a + b) * 2;
    }




}
