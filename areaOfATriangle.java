import java.util.Scanner;

public class areaOfATriangle {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter side-1: ");
        a = sc1.nextDouble();

        System.out.print("Enter side-2: ");
        b = sc2.nextDouble();

        System.out.print("Enter side-3: ");
        c = sc3.nextDouble();

        System.out.println("The area of the triangle is : "+ calculateArea(a, b, c));
    }

    public static double calculateArea(double a, double b, double c){
        double ans = 0;
        double s = 0;
        if((a+b > c )&& (a+c > b )&&( b+c > a)){
            s = (a+b+c)/2;
            ans = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return ans;
        }

        else{
            return 0;
        }
    }
}
