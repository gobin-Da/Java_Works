import java.util.Scanner;

public class CheckingIndex {
    public static void main(String[] args) {
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        s = sc.nextLine();

        int a = s.lastIndexOf("a");
        //int a = s.indexOf("a", 0);
        int b = s.indexOf("b", 0);
        int c = s.indexOf("c", 0);
        int d = s.indexOf("d", 0);
        int e = s.indexOf("e", 0);
        int f = s.indexOf("f", 0);
        int g = s.indexOf("g", 0);
        int h = s.indexOf("h", 0);
        int i = s.indexOf("i", 0);
        int j = s.indexOf("j", 0);
        int k = s.indexOf("k", 0);
        int l = s.indexOf("l", 0);
        int m = s.indexOf("m", 0);
        int n = s.indexOf("n", 0);
        int o = s.indexOf("o", 0);
        int p = s.indexOf("p", 0);
        int q = s.indexOf("q", 0);
        int r = s.indexOf("r", 0);
        int ss = s.indexOf("s", 0);
        int t = s.indexOf("t", 0);
        int u = s.indexOf("u", 0);
        int v = s.indexOf("v", 0);
        int w = s.indexOf("w", 0);
        int x = s.indexOf("x", 0);
        int y = s.indexOf("y", 0);
        int z = s.indexOf("z", 0);

        System.out.println();
        System.out.println("a  b c  d  e  f  g h  i j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j + "\n");

        System.out.println("k  l m  n  o  p  q r  s t");
        System.out.println("=========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r + " " + ss + " " + t + "\n");

        System.out.println("u  v w  x  y  z");
        System.out.println("===============");
        System.out.println(u + " " + v + " " + w + " " + x + " " + y + " " + z + "\n");
    }
}
