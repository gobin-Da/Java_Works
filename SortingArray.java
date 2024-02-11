import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int [] num = {100, 9, -5, 0, 77, -88};

        Arrays.sort(num);

        System.out.print("Assending: ");
        for(int x: num){
            System.out.print(x+" ");
        }

        System.out.println();


        System.out.print("Dessending: ");
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
