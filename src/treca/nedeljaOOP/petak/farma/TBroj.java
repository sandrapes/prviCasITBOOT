package treca.nedeljaOOP.petak.farma;

public class TBroj {

    public static void main(String[] args) {

        //3. [25] Napisati funkciju prostiBrojevi koja za zadati ceo broj n, 2 < n ≤ 50,
        //ispisuje za svaki broj t, 2 ≤ t ≤ n poruku oblika:
        //1 "<t> je prost "; ako je t prost broj
        //2 "<t> je slozen "; ako t nije prost broj
        //OBJASNJENJE:
        //Broj je prost ako je deljiv samo sa 1 i sa samim sobom.
        //Broj x je deljiv brojem y ako je ostatak operacije x/y jedank 0.



        for (int i = 3; i <= 10; i++) {
            boolean slozen = false;
            for (int t = 2; t < i; t++) {

                    if (i % t == 0) {
                        slozen = true;
                        break;
                    }
                }

            if (slozen) {
                System.out.println( i + " slozen");
            }
            else {
                System.out.println(i + " prost");
            }
            }


        }


    }


