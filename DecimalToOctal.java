import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        int decNum, rem=0;

        Scanner sc = new Scanner(System.in);

        String octNum = "";

        char [] ar = {'0', '1', '2', '3', '4', '5', '6', '7'};

        System.out.print("Enter your decimal number: ");
        decNum = sc.nextInt();

        while(decNum > 0){
            rem = decNum%8;
            octNum = ar[rem] + octNum;

            decNum = decNum/8;
        }

        System.out.println("The octal number is: "+octNum);
    }
}
