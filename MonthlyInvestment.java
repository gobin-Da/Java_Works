import java.util.Scanner;

public class MonthlyInvestment {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        double investment, rate, year;
        System.out.print("Enter the amount to be invest: ");
        investment = sc1.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = sc2.nextDouble();
        System.out.print("Enter time(in year): ");
        year = sc3.nextDouble();

        rate *= 0.01;

        for(int i=1; i<=year; i++){
            int format=19;
            if(i>=10) format=18;
            System.out.printf(i + "%" + format + ".2f\n", CountInvest(investment, rate/12, i));
        }
    }

    public static double CountInvest(double p, double r, double t){
       
        return p* Math.pow(1+r, t*12);
       
    }
}
