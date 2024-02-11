import java.util.Scanner;

public class ResultCGPA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int yourMarks = sc.nextInt();

        if(yourMarks>=80){
            System.out.println("You got CGPA 4.00");
        }
        else if(yourMarks>=70){
            System.out.println("You got CGPA 3.75");
        }
        else if(yourMarks>=60){
            System.out.println("You get CGPA 3.50");
        }
        else{
            System.out.println("You are failed");
        }

        sc.close();
    }
}