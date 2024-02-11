public class findingUnicode {
    public static void main(String[] args) {
        String str = "w3resource.com";

        System.out.println("Original string: "+str);

        int val1 = str.charAt(1);
        System.out.println("The unicode value is : "+val1);

        int val2 = str.charAt(9);
        System.out.println("The unicode value is: "+val2);
    }
}
