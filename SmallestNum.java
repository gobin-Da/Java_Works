import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        int num1, num2, num3;

        num1 = in1.nextInt();
        num2 = in2.nextInt();
        num3 = in3.nextInt();

        System.out.println("The smallest number is: "+small(num1, num2, num3));
        
    }

    public static int small(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }
}
