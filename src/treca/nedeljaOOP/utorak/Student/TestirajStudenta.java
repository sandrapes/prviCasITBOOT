package treca.nedeljaOOP.utorak.Student;

public class TestirajStudenta {

    public static void main(String[] args) {

        Student sandraPesic = new Student("Sandra", "Pesic", 5, 4);



        System.out.print("Student " + sandraPesic.name + " " + sandraPesic.sur + ", koji ima ocenu " + sandraPesic.ser + " iz srpskog "
        + " i ocenu " + sandraPesic.math + " iz matematike, ima prosek: " + sandraPesic.avg(5, 4));

    }
}
