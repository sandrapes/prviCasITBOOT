package cetvrta.nedeljaOOP.motorno.vozilo;

public abstract class MotornoVozilo {

    //



        private int brojTockova;
        private double cena;
        private int godinaProizvodnje;

    public MotornoVozilo( int brojTockova, double cena, int godinaProizvodnje){
            this.brojTockova = brojTockova;
            this.cena = cena;
            this.godinaProizvodnje = godinaProizvodnje;
        }

        public int getBrojTockova () {
            return brojTockova;
        }

        public int getGodinaProizvodnje () {
            return godinaProizvodnje;
        }

        public double getCena () {
            return cena;
        }


        public abstract int brojRezervnihGuma ();
        public abstract double popust ();

    }

