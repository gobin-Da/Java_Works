public class checkRegionString {
    public static void main(String[] args) {
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        boolean b1 = str1.regionMatches(0, str2, 28, 8);
        boolean b2 = str1.regionMatches(9, str2, 9, 8);

        System.out.println("String-1 matches String-2 ? " + b1);
        System.out.println("String-1 matches String-2 ? " + b2);
    }
}
