package treca.nedeljaOOP.petak.farma;

public class FarmaTest {

    public static void main(String[] args) {

        /*
         * 1. Klasa (domacih) Zivotinja koja opisuje zivotinje
         * - Vrsta zivotinje ("Krava" "Ovca")
         * - broj nogu
         * - kilaza
         *
         *
         *
         * -Napraviti konstruktor(e) / gettere i settere
         * - toString() metod:
         *  <vrstaZivotinje> ima <brojNogu> nogu i teska je: <kilaza>kg.
         *
         * - (staticka) Metoda cenaPoKilogramu() koja vraca koliko kosta jedan kilogram te zivotinje na sledeci nacin:
         * Ako je vrsta zivotinje:
         * 1. "Krava" - 100 din/kg
         * 2. "Ovca" - 200 din/kg
         * 3. ostalo - 150 din/kg
         *
         * -Metoda cenaZivotinje() koja vraca cenu za celokupnu zivotinju
         *
         *
         * 2. Klasa Farmer koja opisuje farmera:
         * - Ime
         * - Prezime
         * - broj godina
         * - Listu zivotinja
         * - novac
         *
         * -Napraviti sve kontrusktore i gettere i settere
         *
         * -toString() metod:
         * <ime> <prezime> <brGodina> ima zivotinje:
         * zivotinja1.toString()
         * ...
         * zivotinjaN.toString()
         *
         *
         * -Napisati metode:
         * 1. dodajZivotinju koja dodaje zivotinju farmeru
         * 2. oduzmiZivotinju koja oduzima neku zivotinju farmeru i dodaje mu na njegov novac iznos koji je dobio prodavajuci zivotinju
         * 3. prebrojZivotinje koja vraca broj zivotinja koje farmer ima
         * 4. kolikoMozeZaraditi koja vraca najveci mogci broj koji farmer moze da zaradi kada prodaje zivotinje
         *
         *
         * */

            Zivotinja krava = new Zivotinja("Krava", 4, 200);
            Zivotinja ovca = new Zivotinja("Ovca", 4, 500);
            Zivotinja patka = new Zivotinja("Patka", 2, 10);

            System.out.println(krava);
            System.out.println(ovca);
            System.out.println(patka);

            System.out.println(krava.cenaZivotinje());
            System.out.println(Zivotinja.cenaPoKilogramu("patka"));

            System.out.println("================");

        /*ArrayList<Zivotinja> list = new ArrayList<>();
        list.add(krava);
        list.add(ovca);
        list.add(patka);*/
            Farmer f = new Farmer("F", "F", 47, 0, krava, ovca, patka);
            System.out.println(f);
            f.dodajZivotinju(new Zivotinja("Krava", 3, 170)); //U main metodi nemamo referencu na ovu kreiranu zivotinju
            System.out.println(f);
            System.out.println("Farmer ima " + f.getNovac() + " novca");
            f.oduzmiZivotinju(patka);
            System.out.println("Farmer ima " + f.getNovac() + " novca");
            System.out.println(f);
            System.out.println("Farmer moze ukupuno zaraditi: " + f.kolikoMozeZaraditi());


            System.out.println("====================");
            f.oduzmiZivotinju(krava); //Koju kravu oduzima? -> Prvu zato sto je to referenca koju smo prosledili
            f.oduzmiZivotinju(ovca);
            System.out.println(f);
            f.oduzmiZivotinju(f.getZivotinje().get(0));
            System.out.println(f);
        }


    }



