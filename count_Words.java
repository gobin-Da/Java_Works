import java.util.Scanner;

public class count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;

        System.out.println("Enter a string to count words :- " );
        str = sc.next();

        int size = str.length();
        cntWrds(str, size);
    }
    
    public static void cntWrds(String s, int l){
        int cnt = 0;

        for(int i=0; i<l; i++){
            if(s.charAt(i) == ' '){
                cnt++;
            }
        }
        cnt = cnt+1;
        System.out.println("There are "+cnt+" words in the string.");
    }
}
