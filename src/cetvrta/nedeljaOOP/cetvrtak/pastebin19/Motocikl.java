package cetvrta.nedeljaOOP.cetvrtak.pastebin19;

public class Motocikl extends Vozilo {


    //Napisati klasu Motocikl koja prosiruje klasu Vozilo i nema atribute
    //
    //Motocikl se pokrece tako sto ispisuje poruku "Vozim"
    //Motocikl trosi "Dizel" kao gorivo
    //
    //Overridovati toString() metod:
    //"<marka> <tip> je presao <kilometraza>km."


    public Motocikl(String marka, String tip, double kilometraza) {
        super(marka, tip, kilometraza);
    }

    public Motocikl() {
    }

    @Override
    public void pokreniSe() {
        System.out.println("Vozim");

    }

    @Override
    public String potrosnja() {
        return "Dizel";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMarka()).append(" ").append(getTip()).append(" je presao ").append(getKilometraza()).append(" km.").append("\n");
        return sb.toString();
    }
}
