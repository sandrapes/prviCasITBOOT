package cetvrta.nedeljaOOP.motorno.vozilo;

public class Test {

        /*
        * Napraviti apstraktnu klasu MotornoVozilo koja ima atribute za broj tockova, cenu i godinu proizvodnje.
        * Ova klasa ce imati apstraktne metode:
          - brojRezervnihGuma -> Metoda koja nam vraca koliko vozilu treba rezervnih guma,
          * ako znamo da nam treba jedna guma za svaka dva tocka.
          - popust() -> metoda koja daje 50% popusta na Kamion ako je stariji od 20 godina,
                  30% popusta na Automobil ako je stariji od 5 godina, i 20% popusta na  Motor ako je stariji od 2     godine.
          Napraviti Klase Kamion,Motor i Automobil koje nasledjuju klasu MotornoVozilo.
          *
        * */

        public static void kolikiJePopust(MotornoVozilo x) {
            System.out.println(x.popust());
        }

        public static void main(String[] args) {
            Kamion k = new Kamion(16, 20000, 2000);
            System.out.println(k.brojRezervnihGuma());
            //System.out.println(k.popust());

            MotornoVozilo mv = new Automobil(10000, 2021);
            System.out.println(mv.brojRezervnihGuma());
            kolikiJePopust(k);
            kolikiJePopust(mv);
        }
    }

