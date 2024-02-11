import java.util.Scanner;
public class comparingString {
    public static void main(String[] args) {
        String s1, s2;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter First String: ");
        s1 = sc1.nextLine();
        System.out.print("Enter Second String: ");
        s2 = sc2.nextLine();

        CharSequence cs = s1;

        System.out.println("Comparing "+s1+" and "+cs+" : "+s1.contentEquals(cs));
        System.out.println("Comparing "+s2+" and "+cs+" : "+s2.contentEquals(cs));

        /*int b = s1.compareTo(s2);
        if(b==0){
            System.out.println("Comparing "+s1+" and "+s2+" : "+true);
        }
        else{
            System.out.println("Comparing "+s1+" and "+s2+" : "+false);
        }*/
    }
}
