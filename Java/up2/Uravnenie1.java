package Java.up2;

import java.util.Scanner;

public class Uravnenie1 {
    public static void main(String[] args) {
        double a,b,c,x1=0,x2=0,D;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa za reshavane na kvadratno uravnenie");
        System.out.println("a="); a = sc.nextDouble();
        System.out.println("b="); b = sc.nextDouble();
        System.out.println("c="); c = sc.nextDouble();

        D = Math.pow(b, 2) - 4*a*c; // b*b-4ac
        if (D > 0)
        {
            count = 2;
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/2/a;
        }else if (D == 0){
            count = 1;
            x1 = -b/2/a;
        }else {
            count = 0;
        }

        switch (count) {
            case 2:
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
                break;
            case 1:
                System.out.println("x1=x2="+x1);
                break;
            case 0:
                System.out.println("U.N.R.K.");
                break;
            default:
                break;
        }
    }

}
