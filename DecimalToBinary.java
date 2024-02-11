import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int rem = 0;

        while(num != 0){
            rem = num%2;

            num = num/2;

            System.out.print(rem);
        }
    }
}
