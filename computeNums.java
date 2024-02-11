import java.util.Scanner;

public class computeNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        System.out.println("The sum is: "+addNums(num));
    }

    public static int addNums(int a){
        int b = 0;
        while(a > 0){
            b = b + a%10;
            a = a / 10;
        }
        return b;
    }
}
