import java.util.Scanner;

public class Tolower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter your string: ");
        s = sc.nextLine();

        System.out.println("in lower case: "+s.toLowerCase());
        System.out.println("in UPPER case: "+s.toUpperCase());
    }
}
