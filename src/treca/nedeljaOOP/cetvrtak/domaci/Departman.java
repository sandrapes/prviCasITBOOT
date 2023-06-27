package treca.nedeljaOOP.cetvrtak.domaci;

public class Departman {


    //Domaci Zadatak 1:
    //a) Napraviti klasu Departman koja ima atribute za naziv departmana(Informatika,
    //matematika, biologija,..), broj studenta na tom departmanu i broj strucnih predmeta na tom
    //departmanu(Ispisati poruku ukoliko korisnik unese negativne brojeve).

    private String nazivDepartmana;
    private int brojStudenata;
    private int brojStrucnihPredmeta;


    public Departman(String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta) {
        this.nazivDepartmana = nazivDepartmana;
        ubaciBrojStudenata(brojStudenata);
        ubaciBrojStrucnihPredmeta(brojStrucnihPredmeta);
    }

    // doterano da radi kako treba bez else u narednim funkcijama
    // ako dodam else onda ispisuje i to cak i kada uneti podaci nisu u tom opsegu

    private void ubaciBrojStudenata(int brojStudenata) {
        if (brojStudenata >= 0) {
            this.brojStudenata = brojStudenata;
        }

    }

    private void ubaciBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta >= 0) {
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        }

    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        if (brojStudenata < 0) {
            System.out.println("Broj studenata ne moze biti negativan broj.");

        }
        else
            this.brojStudenata = brojStudenata;
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if (brojStrucnihPredmeta < 0) {
            System.out.println("Broj strucnih predmeta ne moze biti negativan broj.");

        }
        else
             this.brojStrucnihPredmeta = brojStrucnihPredmeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv katedre: ").append(nazivDepartmana).append("\n");
        if (this.brojStudenata <= 0 ) {
            sb.append("Broj studenata ne moze biti negativan broj. Molimo unesite broj opet.\n");
        }
        else {
            sb.append("Broj studenata na toj katedri: ").append(brojStudenata).append("\n");
        }
        if (this.brojStrucnihPredmeta <= 0 ) {
            sb.append("Broj strucnih predmeta ne moze biti negativan broj. Molimo unesite broj opet. \n");
        }
        else{
            sb.append("Broj strucnih predmeta na toj katedri: ").append(brojStrucnihPredmeta).append("\n");
        }

        return sb.toString();
    }
}
