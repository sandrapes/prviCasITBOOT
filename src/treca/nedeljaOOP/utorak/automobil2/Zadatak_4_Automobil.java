package treca.nedeljaOOP.utorak.automobil2;

public class Zadatak_4_Automobil {

    //4. Napisati klasu Automobil koja ima atribute:
    //- String marka
    //- String zemljaPoreka
    //- int godinaProizvodnje
    //- double kilometraza
    //Napraviti dva konstruktora koja prima sve argumente, s tim da prvi prima godinu proizvodnja kao int, a drugi kao String (pa ga parsirati kasnije).
    //Napisatit gettere i setere za sva polja (atribute) i automatski generisati toString() metodu.

    String marka;
    String zemljaPorekla;
    int godinaProizvodnje;
    double kilometraza;

    public Zadatak_4_Automobil (String marka, String zemljaPorekla, int godinaProizvodnje, double kilometraza) {
        this.marka = marka;
        this.godinaProizvodnje = godinaProizvodnje;
        this.zemljaPorekla = zemljaPorekla;
        this.kilometraza = kilometraza;

    }

    public Zadatak_4_Automobil (String marka1, String zemljaPorekla1, String godinaProizvodnje1, double kilometraza1) {

        this.marka = marka1;
        this.zemljaPorekla = zemljaPorekla1;
        this.godinaProizvodnje = Integer.parseInt(godinaProizvodnje1);
        this.kilometraza = kilometraza1;
    }

    @Override
    public String toString() {
        return "Automobil " +
                "marka ='" + marka + '\''
                +
                ", zemlja porekla = " + zemljaPorekla + '\''
                +
                ", godina proizvodnje = " + godinaProizvodnje
                +
                ", kilometraza = " + kilometraza;
    }
}
