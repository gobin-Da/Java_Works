import java.util.Scanner;

public class findaCharAt {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("The character at index 0 is: "+str.charAt(0));
        System.out.println("The character at index 10 is: "+str.charAt(10));
    }
}
