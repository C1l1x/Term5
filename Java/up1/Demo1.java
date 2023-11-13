import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int a,b,max,s;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("a=");
            a = sc.nextInt();
            System.out.print("b=");
            b = sc.nextInt();
        }
        if (a > b) {
            max = a;
        }else{
            max = b;
        }
        s = a + b;
        System.out.println("MAX (" + a + ", " + b + ")= " + max);
        System.out.println(a + " + " + b + " = " + s);
    }
}
