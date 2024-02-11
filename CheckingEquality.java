import java.util.Scanner;

public class CheckingEquality {
    public static void main(String[] args) {
        String s1, s2;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter first string: ");
        s1 = sc1.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc2.nextLine();

        boolean b = s1.equals(s2);

        System.out.println("\"" + s1 + "\"" + " equals to " + "\"" + s2 +"\" : "+ b);
    }
}
