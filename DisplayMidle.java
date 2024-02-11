import java.util.Scanner;

public class DisplayMidle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = in.nextLine();

        int size = str.length();

        MiddleNum(str, size);
    }

    public static void MiddleNum(String str, int l){
        int m, n;
        if(l%2 == 0){
            m = l/2 -1;
            n = l/2;
            System.out.println("The middle number is : "+ str.charAt(m) +" "+str.charAt(n));
        }
        else{
            m = l/2;
            System.out.println("The middle number is: "+ str.charAt(m));
        }

    }

}
