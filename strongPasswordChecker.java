import java.util.Scanner;

public class strongPasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter Your Password: ");
        str = sc.nextLine();
        int size = str.length();
        checkmypw(str, size);
    }

    public static void checkmypw(String s, int l){
        int cnt=0, mnt=0, ch=0;
        for(int i=0; i<l; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                cnt++;
            }
            else if((s.charAt(i) >= 'A' && s.charAt(i) == 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) == 'z')){
                ch++;
            }
            else{
                mnt++;
            }
        }

        if(l < 8 || (cnt < 2 || cnt >2) || mnt > 0){
            System.out.println("Your password must have eight characters.");
            System.out.println("Your password must have two digits.");
            System.out.println("Your password must contain letters and digits.");
        }
        else{
            System.out.println("Strong Password.");
        }

    }
}
