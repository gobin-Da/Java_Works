import java.util.Scanner;

public class length_of_a_string {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        str = sc.nextLine();

        System.out.println("The length of the given string is: "+str.length());
    }
}
