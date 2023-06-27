package prva.nedelja.ponedeljak;

public class Primeri_Za_Vezbanje {

    public static void main(String[] args) {

                /*
                 * Pre pocetka izvrsavanja koda probajte
                 * da pretpostavite sta ce svaki sout da ispise.
                 *
                 * Ako hocete samo parcijalno neke sout komande
                 * da izvrsavate, samo zakomentarisite one koje
                 * NECETE da se ispisuju, a odkomentarisite one
                 * koje HOCETE da se ispisuju
                 *
                 * */

                int x = 5;
                int y = 3;

                //System.out.println("Primer 1: " + (x + y));
                //System.out.println("Primer 2: " + (x - y));
                //System.out.println("Primer 3: " + x * y);
                //System.out.println("Primer 4: " + x + y);

                int a = 2, b = 2;

                a += 10;
                //System.out.println("Primer 5: " + a);

                a += b;
                //System.out.println("Primer 6: " + a);

                a++;
                //System.out.println("Primer 7: " + a);

                a--;
                //System.out.println("Primer 8: " + a);

                --a;
                //System.out.println("Primer 9: " + a);



                //System.out.println("Primer 10: " + (b++));
               //System.out.println("Primer 11: " + b);
                //System.out.println("Primer 12: " + (++b));
                //System.out.println("Primer 13: " + b);

                int p = 5, q = 10;

                p = q++;
                //System.out.println("Primer 14:\nVrednost p: " + p + "\nVrednost q: " + q);

                p = 5;
                q = 10;
                p = ++q;
                //System.out.println("Primer 15:\nVrednost p: " + p + "\nVrednost q: " + q);

                p = 5;
                q = 10;
                p += p + --q;
                //System.out.println("Primer 16:\nVrednost p: " + p + "\nVrednost q: " + q);

                p = 5;
                q = 10;
                p -= ++p * q++;
                //System.out.println("Primer 17:\nVrednost p: " + p + "\nVrednost q: " + q);



                 //int ftw = 5;
                 //ftw = --ftw++;




                double d = 2;
                //System.out.println("Primer 19: " + d++);
                //System.out.println("Primer 20: " + ++d);

            }
        }




