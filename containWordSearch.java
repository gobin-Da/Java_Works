import java.util.Scanner;

public class containWordSearch {
    public static void main(String[] args) {
        String s1, s2;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter First String: ");
        s1 = sc1.nextLine();
        System.out.print("Enter Second String: ");
        s2 = sc2.nextLine();

        System.out.println(s1.contains(s2));
    }
}
