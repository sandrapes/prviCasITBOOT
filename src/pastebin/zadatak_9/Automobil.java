package pastebin.zadatak_9;

public class Automobil {

    //marka, godinaProizvodnje, kilometraza

    private String marka;
    private int godinaProizvodnje;
    private int kilometraza;

    public Automobil(String marka, int godinaProizvodnje, int kilometraza) {
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kilometraza = kilometraza;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getKilometraza() {
        return kilometraza;
    }

    public void setKilometraza(int kilometraza) {
        this.kilometraza = kilometraza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(marka).append(" ").append(godinaProizvodnje).append(" ").append(kilometraza).append("\n");
        return sb.toString();
    }
}
