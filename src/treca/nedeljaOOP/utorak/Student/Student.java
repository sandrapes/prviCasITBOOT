package treca.nedeljaOOP.utorak.Student;

public class Student {

    /*
     * Napraviti klasu "Student" koja opisuje uopsteno jednog studenta.
     * Student ima:
     * - ime
     * - prezime
     * - ocenuIzSrpskog
     * - ocenuIzMatematike
     *
     * Napisati kontruktor koji prima kao argumente vrednosti za sve atribute
     * Napisati metodu "prosek" koja vraca prosek tog studenta.
     *
     * */

    String name;
    String sur;
    int ser;
    int math;

    public Student( String n, String s, int a, int b) {

        name = n;
        sur = s;
        ser = a;
        math = b;

    }

    static double avg (int a, int b) {

        double average = ((double)a + b) / 2;
        return average;
    }


}
