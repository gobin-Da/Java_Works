import java.util.Random;

public class RendomDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        //int randomNum = rand.nextInt(10); // 0 - 9

        //int randomNum = rand.nextInt(91) + 10;

        int randomNum = (int)(Math.random()*10);
        System.out.println(randomNum);        
    }
}
