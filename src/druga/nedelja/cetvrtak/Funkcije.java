package druga.nedelja.cetvrtak;

public class Funkcije {


    /*
     * Definisanje funkcije duplirajMe
     * */
    static int duplirajMe(int x){
        int resenje = 2 * x;
        return resenje;
    }

    static int upoloviMe(int x){
        int resenje = x / 2;
        return resenje;
        // return x / 2;
    }

    //Funkcija duzine nize
    static int duzinaNiske(String s){
        return s.length();
    }


    public static void main(String[] args) {
        //Korsnik unos ....
        //Za dobijen ceo broj ispisati njegovu dupliranu vrednost
        int x = 5;
        int xDuplirano = duplirajMe(x); //pozivanje funkcije duplirajMe i smestanje njenog rezultata u promenjivu xDuplirano;'
        System.out.println(xDuplirano);

        int y = 20;
        int yDuplirano = duplirajMe(y);
        System.out.println(yDuplirano);
        int yUpolovljeno = upoloviMe(y);
        System.out.println(yUpolovljeno);

        String q = "Tomasevic";
        int duzinaQ = duzinaNiske(q);
        System.out.println(duzinaQ);
    }
}
