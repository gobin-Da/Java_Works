public class stringArray {
    public static void main(String[] args) {
        char[] myar = {'1', '2', '3', '4'};

        String str = String.copyValueOf(myar, 1, 3);

        System.out.println("The book contains "+str+" pages.");
    }
}
