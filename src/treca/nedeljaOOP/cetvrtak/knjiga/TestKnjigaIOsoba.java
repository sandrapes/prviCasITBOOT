package treca.nedeljaOOP.cetvrtak.knjiga;

import treca.nedeljaOOP.cetvrtak.osoba.Osoba;

public class TestKnjigaIOsoba {

    public static void main(String[] args) {

        Osoba sandra = new Osoba("Sandra", "Pesic", 27);
        Knjiga gospodarMuva = new Knjiga("Gospodar muva", new Osoba("William", "Golding", 123), sandra, 200, 1950);

        System.out.println(sandra);
        System.out.println(gospodarMuva);
        System.out.println(gospodarMuva.getNaziv() + " je " + gospodarMuva.velicinaKnjige());


    }
}
