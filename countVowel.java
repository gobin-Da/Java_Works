import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int size = str.length();
        cntVow(str, size);
    }

    public static void cntVow(String s, int l){
        int cnt = 0;
        s = s.toUpperCase();
        for(int i=0; i<l; i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'  || s.charAt(i) == 'U'){
                cnt++;
            }
        }

        System.out.println("In the string there are "+cnt+" vowels.");
    }
}
