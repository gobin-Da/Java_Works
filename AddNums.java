import java.util.Scanner;;
public class AddNums {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        Scanner inp3 = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter number one: ");
        a = inp1.nextInt();
        System.out.print("Enter number two: ");
        b = inp2.nextInt();
        System.out.print("Enter number three: ");
        c = inp3.nextInt();

        System.out.println("The sum of the three number is: "+addNum(a,b,c));
    }

    public static int addNum(int a, int b, int c){
        return a+b+c;
    }
}
