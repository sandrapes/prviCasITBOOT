package pastebin.geometrija.baza;

import pastebin.geometrija.interfejsi.MerljivoU3D;

public abstract class Telo extends Oblik implements MerljivoU3D{

    public Telo() {
    }

    @Override
    public String getOsobine() {
        return "Obim: " + obim() + "\n" + "Povrsina: " + povrsina() + "\n" + "Zapremina: " + zapremina() + "\n";

    }
}
