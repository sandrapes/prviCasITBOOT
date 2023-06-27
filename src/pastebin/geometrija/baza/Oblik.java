package pastebin.geometrija.baza;

public abstract class Oblik {

    public Oblik() {
    }

    public abstract String getIme();
    public abstract String getOsobine();


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIme()).append("/n");
        sb.append(getOsobine()).append("/n");
        return sb.toString();
    }
}
