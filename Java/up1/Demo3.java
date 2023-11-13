import java.util.Scanner;

public class Demo3 {
    static int a,b,max,s;

    static int input(char ch)
    {
        int aa;
        Scanner sc = new Scanner(System.in);
        System.out.print(ch + "=");
        aa = sc.nextInt();
        return aa;
    }
    static void getInput() {
        a = input('a');
        b = input('b');
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
        getInput();
        max = maxAB(a, b);
        s = sum(a, b);
        output();
    }
}
