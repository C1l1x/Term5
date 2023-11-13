import java.util.Scanner;

public class Demo2 {
    static int a,b,max,s;

    static void input()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("a=");
            a = sc.nextInt();
            System.out.print("b=");
            b = sc.nextInt();
        }
    }
    static int maxAB(int a, int b)
    {
        int mm;
        if (a > b) {
            mm = a;
        }else{
            mm = b;
        }
        return mm;
    }
    static int sum(int a, int b)
    {
        return a + b;
    }
    static void output()
    {
        System.out.println("MAX (" + a + ", " + b + ")= " + max);
        System.out.println(a + " + " + b + " = " + s);
    }
    public static void main(String[] args) {
        input();
        max = maxAB(a, b);
        s = sum(a, b);
        output();
    }
}
