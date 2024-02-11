import java.util.Scanner;

public class stringBeginsEndsWith {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        String chk;
        Scanner cc = new Scanner(System.in);

        System.out.print("Enter the checking characters: ");
        chk = cc.nextLine();

        System.out.println("\""+str+ "\" ends with "+ "\""+ chk + "\" : "+ str.endsWith(chk));
    }
}
