package treca.nedeljaOOP.cetvrtak.student;

public class Student {


    private String ime;
    private String prezime;
    private int ocenaMatatematika;
    private int ocenaSrpski;
    private double prosek;

    public Student(String ime, String prezime, int ocenaMatatematika, int ocenaSrpski, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocenaMatatematika = ocenaMatatematika;
        this.ocenaSrpski = ocenaSrpski;
        this.prosek = prosek;
    }

    public Student(String ime, String prezime, int ocenaMatatematika, int ocenaSrpski) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocenaMatatematika = ocenaMatatematika;
        this.ocenaSrpski = ocenaSrpski;
        this.prosek = izracunajProsek();
    }


        /*
         * Getteri i setteri
         *
         * Getteri su metode koje omogucavaju drugim klasama da pristupe privatnim promenjivima.
         * Setteri su metode koje omogocavaju drugim klasama da na neki odredjen nacin menjaju privatne promenjive.
         *
         * Konvencija pisanja:
         * getImePromenjive()
         *
         * setImePromenjive(argument)
         *
         * */


    //Ova metoda nam omogucava da pristupimo atributu "ime"
    public String getIme(){
        return ime;
    }


    //Ova metoda nam omogucava da menjamo atribut ime
    public void setIme(String ime){
        this.ime = ime;
    }

    public int getOcenaMatatematika(){
        return ocenaMatatematika;
    }

    public void setOcenaMatatematika(int ocena){
        if (ocena >= 1 && ocena <= 5)
            this.ocenaMatatematika = ocena;
        else
            System.out.println("Ocena mora da bude izmedju 1 i 5");
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getOcenaSrpski() {
        return ocenaSrpski;
    }

    public void setOcenaSrpski(int ocenaSrpski) {
        if (ocenaSrpski >= 1 && ocenaSrpski <= 5)
            this.ocenaSrpski = ocenaSrpski;
        else
            System.out.println("Ocena mora da bude izmedju 1 i 5");
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        if (prosek >= 1.0 && prosek <= 5.0)
            this.prosek = prosek;
        else
            System.out.println("Prosek mora da bude izmedju 1.0 i 5.0");
    }



    public double izracunajProsek(){
        return (double)(this.ocenaMatatematika + this.ocenaSrpski) / 2;
    }
}
