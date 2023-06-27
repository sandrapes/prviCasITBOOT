package pastebin.zadatak10;

public class Film {

    ///Ovaj zadatak je dosta dugacak!
    //Procitajte zadatak u celosti i razmislite tacno sta se trazi od Vas pre nego sto krenete da kucate kod!
    //Klasa korpa je verovatno najteza klasa od svih ovih. Tu morate bas dobro da razmislite sta se desava!
    //#####
    //
    //Napisati klasu Film koja sadrzi atribute:
    //	- String ime
    //	- int godinaPremijere (godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
    //	- double ocena (ocena filma, [1.0, 10.0]) (default = 1.0)
    //	- String sadrzaj (kratak sadrzaj filma)
    //	- int sati, minuti, sekunde (koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)
    //
    //Napisati konstruktor(e) i proveriti da li su unosi validni. Ako uslovi nisu validni, postaviti ih na default vrednosti.
    //Napisati toString() metod:
    //	"{ime} {godinaPremijere} {ocena}
    //	 Duzina trajanja: {sati} : {minuti} : {sekunde}
    //	 {sadrzaj}"
    //
    //---------------------------------------------------------------------------------------------------------------------------------------

    private String ime;
    private  int godinaPremijere;
    private double ocena;
    private String sadrzaj;
    private int sati;
    private int minuti;
    private int sekunde;

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;
        if (godinaPremijere < 1888 || godinaPremijere > 2021)
            this.godinaPremijere = 2021;
        else {
            this.godinaPremijere = godinaPremijere;
        }

        if (ocena < 1.0 || ocena > 10.0)
            this.ocena = 1.0;
        else {
            this.ocena = ocena;
        }
        this.ocena = ocena;
        this.sadrzaj = sadrzaj;

        if (sati < 0 || sati > 10)
            this.sati = 1;
        else {
            this.sati = sati;
        }

        if (minuti < 0 || minuti > 59)
            this.minuti = 30;
        else {
            this.minuti = minuti;
        }

        if (sekunde < 0 || sekunde > 59)
            this.sekunde = 0;
        else {
            this.sekunde = sekunde;
        }
    }

    public Film() {
    }

    //	"{ime} {godinaPremijere} {ocena}
    //	 Duzina trajanja: {sati} : {minuti} : {sekunde}
    //	 {sadrzaj}"


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        this.godinaPremijere = godinaPremijere;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        this.sekunde = sekunde;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(godinaPremijere).append(" ").append(ocena).append("\n");
        sb.append("Duzina trajanja: ").append(" ").append(sati).append(" ").append(minuti).append(" ").append(sekunde).append("\n");
        sb.append(sadrzaj);
        return sb.toString();
    }
}
