import java.util.Scanner;

public class lexicographicallyCheck {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter first string: ");
        s1 = sc1.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc2.nextLine();

        int cmp = 0;
        cmp = s1.compareTo(s2);

        if(cmp < 0){
            System.out.print(s1 + " is less then "+s2);
        }
        else if(cmp == 0){
            System.out.print(s1 + " is equal to "+s2);
        }
        else{
            System.out.print(s1 + " is greater then "+s2);
        }
    }
}
