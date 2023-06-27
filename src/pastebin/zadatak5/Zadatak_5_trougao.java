package pastebin.zadatak5;

public class Zadatak_5_trougao {

    ///5. Napisati klasu Trougao koja ima 3 double atributa za polja.
    //Napraviti metodu 'daLiJeTrougaoValidan', koji proverava da li 3 prosledjene stranice mogu da budu stranice nekog trougla.
    //Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece ili ako je neka stranica nepozitivne duzine.
    //Napraviti konstruktor koji prima 3 argumenta za atribute i proverava njihovu validnost. Ako nisu validni, ispisati neku odgovarajucu poruku i postaviti sve stranice na -1.
    //Napraviti gettere i settere za svako polje, kao i metode 'obim' i 'povrsina'
    //(Pogledati heronov obrazac: https://en.wikipedia.org/wiki/Heron%27s_formula)
    //Napraviti toString() metod:
    //Duzina stranice A je: {stranicaA}
    //Duzina stranice B je: {stranicaB}
    //Duzina stranice C je: {stranicaC}

   private double a;
   private double b;
   private double c;

    public Zadatak_5_trougao (double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean daLiJeValidan () {

        boolean b = false;

        if (this.a + this.b < this.c || this.b + this.c < this.a || this.a + this.c < this.b || this.a <= 0 || this.b <= 0 || this.c <= 0) {
            System.out.println("Prosledjene stranice ne mogu biti stranice trougla. ");
            this.a = -1;
            this.b = -1;
            this.c = -1;
            return false;
        }
        else
            System.out.println("Prosledjene stranice mogu biti stranice trougla. ");
        return true;
    }

    public double obim() {
        double obim = this.a + this.b + this.c;
        return obim;

    }

    public double povrsina() {
        double s = (a + b + c) / 2;
        double povrsina = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return povrsina;

    }

    public double getA() {
        return a;

    }

    public void setA (double a) {
        this.a = a;

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public String toString() {
        return "Duzina stranice A je: " + getA() +'\n' + //zato sto ova metoda poziva stranice iz iste klase
                                                        // (gore, bez obzira na to sto su private),
                "Duzina stranice B je: " + b + '\n' +// ona je vidljjiva u toj klasi isto
                "Duzina stranice C je: " + c;
    }
}
