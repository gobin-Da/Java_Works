import java.util.*;

public class DateAndTime {
    public static void main(String[] args) {
        Calender ca = Calender.getInstance();
        System.out.println("Current Date and Time: ");
        System.out.format("%tB %te, %tY%n", ca, ca, ca);
        System.out.format("tl:%tM %tp%n", ca, ca, ca);
    }
}
