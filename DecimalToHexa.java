import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decNum, rem = 0;

        char [] hexNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexVal = "";

        System.out.print("Enter a decimal number: ");
        
        decNum = sc.nextInt();

        while(decNum > 0){
            rem = decNum % 16;
            hexVal = hexNum[rem] + hexVal;

            decNum = decNum/16;
        }

        System.out.println("The Hexadecimal number is: "+hexVal);
    }
}
