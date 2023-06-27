package pastebin.geometrija.baza;

import pastebin.geometrija.interfejsi.MerljivoU2D;

public abstract class Figura extends Oblik implements MerljivoU2D {

    //Napisati abstrakntu klasu Figura koja nasledjuje klasu Oblik unutar baza paketa i
    // imeplementuje interfejs merljivoU2D i nema atribute
    //
    //Figura je 2D geometrijsko telo
    //
    //Napisati prazan konstruktor
    //
    //Implementovati metod:
    //1. getOsobine():
    //"Obim: <obim>
    // Povrsina: <povrsina>"


    public Figura() {
    }

    @Override
    public String getOsobine() {

        return "Obim: " + obim() + "\n" + "Povrsina: " + povrsina();
    }
}


