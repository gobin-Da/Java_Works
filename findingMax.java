import java.util.Scanner;

public class findingMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double[] num = new double[5];

        System.out.print("Enter five numbers: ");

        for(int i=0; i<5; i++){
            num[i] = input.nextDouble();
            sum += num[i];
        }

        double max = num[0], min = num[0];

        for(int i=0; i<5; i++){
            if(max < num[i]){
                max = num[i];
            }
            if(min > num[i]){
                min = num[i];
            }
            
        }

        System.out.println("The sum of the given numbers is: "+sum);
        double avg = sum/5;
        System.out.println("The average of the given numbers is: "+avg);
        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min);

    }
}
