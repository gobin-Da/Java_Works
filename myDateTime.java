import java.util.Calendar;

public class myDateTime{
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();

        System.out.println("Current Date and Time: ");
        System.out.format("%tB %te, %tY%n", ca, ca, ca);
        System.out.format("%tl:%tM %tp%n", ca, ca, ca);
    }
}