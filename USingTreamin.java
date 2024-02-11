import java.util.Scanner;

public class USingTreamin {
    public static void main(String[] args) {
        String s;
        System.out.print("Enter your string(Including front & back spaces): ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        System.out.println("New string after trim: "+s.trim());
    }
}
