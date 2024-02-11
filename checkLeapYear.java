import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        year = sc.nextInt();
        leapyear(year);
    }

    public static void leapyear(int y){
        if(y%4 == 0 && (y%400==0 || y%100!=0)){
            System.out.println("The year "+y+" is a leap year.");
        }
        else{
            System.out.println("The year "+y+" is NOT a leap year.");
        }
    }
}
