package treca.nedeljaOOP.utorak.osobe;

public class TestirajOsobe {

    public static void main(String[] args) {
        /*
         * Kreiranje objekta:
         * <tip, tj Ime klase> identifikator = new kontruktor(arg ...);
         * */

        //Jedan objekat klase Osoba | jedna instanca klase Osoba | Realizacija klase Osoba
        Osoba strahinjaTrninic = new Osoba("Strahinja", "Trninic", 25);
        //Drugi objekat klase Osoba
        Osoba jovanaJezdovic = new Osoba("Jovana", "Jezdovic", 26);

        System.out.println(strahinjaTrninic.ime + " " + strahinjaTrninic.prezime + " " + strahinjaTrninic.brojGodina + " godina");
        System.out.println(jovanaJezdovic.ime + " " + jovanaJezdovic.prezime + " " + jovanaJezdovic.brojGodina + " godina");
        strahinjaTrninic.rodjendan();
        System.out.println(strahinjaTrninic.ime + " " + strahinjaTrninic.prezime + " " + strahinjaTrninic.brojGodina + " godina");
        System.out.println(jovanaJezdovic.ime + " " + jovanaJezdovic.prezime + " " + jovanaJezdovic.brojGodina + " godina");
    }
}
