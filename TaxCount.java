import java.util.Scanner;
public class TaxCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your ammount : ");
        double TotalAmount = scan.nextDouble();
        double Tax = TotalAmount * 0.5;
        int finalTax = (int)Tax;
        System.out.println("You have to pay a TAX of ammount : "+ finalTax);
    }
}
