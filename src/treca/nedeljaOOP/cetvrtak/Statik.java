package treca.nedeljaOOP.cetvrtak;

public class Statik {

    /*
     * static modifikator
     *
     * static modifikator nam kreira staticke promenjive/metode
     * staticke promenjive/metode su promenjive/metode koje su vezane za samu KLASU.
     * Dakle, one su svojstva samih KLASA a ne OBJEKATA
     *
     * Nestaticke promenjive/metode ne mozemo da pozivamo iz statickih referenci!
     * Obrnuto vazi!
     * (npr. ako imamo staticku metodu ona ne moze da pozove ne-staticku metodu).
     *
     * */
    static int x = 17;


    static int uvecajZaDva(int a) {
        x++;
        return a + 2;
    }


    public void uradiNesto() {
        System.out.println("sdsds");
    }



    /*
     * Staticki blok
     * */
    static {
        /*
         * U ovom bloku koda
         * mozemo da baratamo samo statickim stvarima,
         * i ujedno, on se izvrsava SAMO JEDMOM
         * i to prilikom prvog "poziva" klase
         * */
    }


    public static void main(String[] args) {
        x--; //Ovo moze
        uvecajZaDva(2);
        //uradiNesto(); //Ovo ne moze

        /*
         * Pozivanje statickih metoda i atributa
         * se radi po sablonu:
         * <imeKlase>.<imeAtributa/imeMetode>
         * a ne preko objekata!
         * */
    }
}
