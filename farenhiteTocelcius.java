import java.util.Scanner;

public class farenhiteTocelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        double celcius = scan.nextDouble();
        double farenhite = (celcius * 9/5) + 32;
        System.out.println("The temperature in farenhite is: " + farenhite);
    }
}
