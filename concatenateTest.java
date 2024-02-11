import java.util.Scanner;

public class concatenateTest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        String str1, str2;

        System.out.print("Enter first string: ");
        str1 = s1.nextLine();
        System.out.print("Enter first string: ");
        str2 = s2.nextLine();

        String str3 = str1.concat(str2);
        System.out.println("The concatenated string is: "+str3);
    }
}
