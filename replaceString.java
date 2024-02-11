import java.util.Scanner;

public class replaceString {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("Original String: ");
        str = s.nextLine();

        String str2 = str.replace("dog", "fog");

        System.out.println("New String: "+str2);
    }
}
