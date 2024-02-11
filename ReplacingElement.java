import java.util.Scanner;

public class ReplacingElement {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = s.nextLine();

        String str2 = str.replace("fox", "cat");
        System.out.println("New String: "+str2);
    }
}
