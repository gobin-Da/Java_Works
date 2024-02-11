public class codePointCnt {
    public static void main(String[] args) {
        String str = "w3resource.com";

        System.out.println("Original string: "+str);
        
        int cnt = str.codePointCount(1, 10);

        System.out.println("Codepoint at string is: "+cnt);
    }
}
