package prva.nedelja.ponedeljak;

public class Domaci_Zadatak_1 {

    public static void main(String[] args) {

        // Domaci Zadatak 1:
        //Napraviti Java program koji ce ispisati podatke o korisniku. Podaci o korisniku ce se
        //cuvati u vidu promenljivih, potrebne su nam promenljive za:
        //-Ime
        //-Prezime
        //-Godina rodjenja
        //-Godina zaposlenja (opciono)
        //U ispisu treba istampati u jednom redu ime i prezime korisnika, zatim u novom redu godinu njegovog
        //rodjenja i u jos jednom redu ukupan broj godina radnog staza.

        String ime = "Sandra";
        String prezime = "Pesic";
        int godinaRodjenja = 1995;
        int godinaZaposlenja = 2019;

        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Godine radnog staza: " + (2023 - godinaZaposlenja));

    }



}
