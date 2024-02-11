import java.util.Scanner;

public class checkFirstElement {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your string: ");
        str = s.nextLine();

        String str1;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the checking string: ");
        str1 = s1.nextLine();

        System.out.println("\""+str+"\""+" starts with "+"\""+str1+"\" "+ str.startsWith(str1));
    }
}
