package cetvrta.nedeljaOOP.test;

import java.util.ArrayList;

public abstract class UgostiteljskiObjekat {

    //g.
//1. UgostiteljskiObjekat
//Kreirati apstraktnu klasu UgostiteljskiObjekat koja opisuje uopsteno neki ugostiteljski objekat.
//Svaki ugostiteljski objekat ima svoje ime, svoju prosecnu ocenu (realan broj [1.0, 5.0]),
// broj Michelin zvezda (ceo broj [0, 3]), i listu recenzija.
//Popuniti ovu klasu na sledeci nacin:
//1. Polja:
//String naziv
//double prosecnaOcena
//int brMichelinZvezda
//ArrayList<String> recenzije
    //2. Konstruktori:
//Pun konstruktor koji popunjava svaki atribut preko argumenata metode
//Konstruktor koji prima argumente String naziv, double prosecnaOcena, int brMichelinZvezda, a listu recenzija postavlja na novu, praznu ArrayListu
//Konstruktor koji prima argumente String naziv, double prosecnaOcena, a broj Michelin zvezda postavlja na 0 i listu recenzija postavlja na novu, praznu ArrayListu
//Konstruktor koji samo prima argument String naziv, a prosecnu ocenu postavlja na 3.0, broj Michelin zvezda na 0 i listu recenzija postavlja na novu, praznu ArrayListu
//3. Napisati sve potrebne gettere i settere.

    private String naziv;
    private double prosecnaOcena;
    private int brMichelinZvezda;
    private ArrayList<String> recenzije;


    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda, ArrayList<String> recenzije) {
        this.naziv = naziv;
        if (prosecnaOcena < 1.0)
            this.prosecnaOcena = 1.0;
        else if (prosecnaOcena > 5.0)
            this.prosecnaOcena = 5.0;
        else
            this.prosecnaOcena = prosecnaOcena;

        if (brMichelinZvezda < 1)
            this.brMichelinZvezda = 0;
        else if (brMichelinZvezda > 3)
            this.brMichelinZvezda = 3;
        else
            this.brMichelinZvezda = brMichelinZvezda;

        this.recenzije = recenzije;
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezda) {
        this.naziv = naziv;
        if (prosecnaOcena < 1.0)
            this.prosecnaOcena = 1.0;
        else if (prosecnaOcena > 5.0)
            this.prosecnaOcena = 5.0;
        else
            this.prosecnaOcena = prosecnaOcena;

        if (brMichelinZvezda < 1)
            this.brMichelinZvezda = 0;
        else if (brMichelinZvezda > 3)
            this.brMichelinZvezda = 3;
        else
            this.brMichelinZvezda = brMichelinZvezda;
        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv, double prosecnaOcena) {
        this.naziv = naziv;
        if (prosecnaOcena < 1.0)
            this.prosecnaOcena = 1.0;
        else if (prosecnaOcena > 5.0)
            this.prosecnaOcena = 5.0;
        else
            this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezda = 0;
        this.recenzije = new ArrayList<>();
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.brMichelinZvezda = 0;
        this.prosecnaOcena = 3.0;
        this.recenzije = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getProsecnaOcena() {
        if (prosecnaOcena < 1.0)
            return 1.0;
        else if (prosecnaOcena > 5.0)
            return 5.0;
        else
            return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        if (prosecnaOcena < 1.0)
            this.prosecnaOcena = 1.0;
        else if (prosecnaOcena > 5.0)
            this.prosecnaOcena = 5.0;
        else
            this.prosecnaOcena = prosecnaOcena;

    }

    public int getBrMichelinZvezda() {
        if (brMichelinZvezda < 1)
            return  0;
        else if (brMichelinZvezda > 3)
            return  3;
        else
            return brMichelinZvezda;
    }

    public void setBrMichelinZvezda(int brMichelinZvezda) {
        if (brMichelinZvezda < 1)
            this.brMichelinZvezda = 0;
        else if (brMichelinZvezda > 3)
            this.brMichelinZvezda = 3;
        else
            this.brMichelinZvezda = brMichelinZvezda;
    }

    public ArrayList<String> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(ArrayList<String> recenzije) {
        this.recenzije = recenzije;
    }
    //4. Omoguciti da inspektor moze da doda recenziju i obrise recenziju.

    public void dodajRecenziju(String recenzija) {
        recenzije.add(recenzija);
    }

    public void oduzmiRecenziju(String recenzija) {
        recenzije.remove(recenzija);
    }

//5. Napisati metodu public void dodajViseOcena(ArrayList<Double> ocene) koja:
//racuna prosecnu ocenu iz proslednjene liste, a zatim pamti novu prosecnu ocenu ugostiteljskog objekta kao
// prosek dobijene prosecne ocene iz liste i trenutne prosecne ocene ugostiteljskog objekta.
//Zatim azurirati broj zvezdi.

    public void dodajViseOcena(ArrayList<Double> ocene) {
        int prosek = 0;
        for (int i = 0; i < ocene.size(); i++) {
            prosek += ocene.get(i);
        }
        prosek = prosek / ocene.size();

        this.prosecnaOcena = (prosek + prosecnaOcena) / 2;

        azurirajZvezdu();
    }

//6. Napisati abstraktne metode:
//public abstract void dodajOcenu(double ocena); koja prima double ocenu i
//na odredjeni nacin azurira ocenu ugostiteljskog objekta.
    //public abstract void azurirajZvezdu(); koja na odredjeni nacin procenjuje da li treba nekom ugostiteljskom objektu
//da se doda ili oduzme zvezda. Paziti na cinjenicu da nijedan takav objekat ne moze da ima strogo manje od 0 niti strogo vise od 3 zvezde!

    public abstract void dodajOcenu(double ocena);

    public abstract void azurirajZvezdu();




//7. Preopteretiti toString() metod:
//"\t-----<naziv>-----"
//"\t*****(<brMichelinZvezda>)*****"
//""
//"Prosecna ocena: <prosecnaOcena>"
//"Recenzije:"
//"1) <recenzija[0]>"
//"2) <recenzija[1]>"
//...
//"N) <recenzija[N]>"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" -----").append(naziv).append("----- ").append("\n");
        sb.append(" *****(").append(brMichelinZvezda).append(")*****").append("\n");
        sb.append("\n");
        sb.append("Prosecna ocena: ").append(prosecnaOcena).append("\n");
        sb.append("Recenzije: ").append("\n");
        for (String s : recenzije) {
            sb.append(s).append("\n");
        }
        return sb.toString();

    }
}


