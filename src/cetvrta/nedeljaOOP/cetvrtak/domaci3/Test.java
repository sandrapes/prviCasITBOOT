package cetvrta.nedeljaOOP.cetvrtak.domaci3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Planina a = new Planina(1500, "A");
        Planina b = new Planina(2000, "B");
        Planina c = new Planina(2500, "C");

        ArrayList planine = new ArrayList<>();
        planine.add(a);
        planine.add(b);


        Planinar neki = new Planinar(planine, 3000, 25 );

        neki.popniSe(c);


        System.out.println(neki);

    }
}
