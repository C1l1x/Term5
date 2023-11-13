package Java.up2;

import java.io.*;

public class Uravnenie2 {
    public static void main(String[] args) throws IOException {
        double a=0,b=0,c=0,x1=0,x2=0,D;
        int count = 0;
        String buf = null;
        InputStreamReader is= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Programa za reshavane na kvadratno uravnenie");
        try {
            System.out.println("a= ");
            buf = br.readLine(); a = Double.parseDouble(buf);
        }catch (NumberFormatException ex) {
            System.out.println(buf + " ----> ne e chislo..., a = 0");
            a = 0;
        }
        try {
            System.out.println("b=");
            buf = br.readLine(); b = Double.parseDouble(buf);
        } catch (NumberFormatException ex) {
            System.out.println(buf + " ---> ne e chislo...");
            System.exit(0);
        }
        try {
            System.out.println("c=");
            buf = br.readLine(); c = Double.parseDouble(buf);
        } catch (NumberFormatException ex) {
            System.out.println(buf + " -----> ne e chislo...");
            return;
        }

        D = Math.pow(b, 2)-4*a*c;
        if (D > 0) {
            count = 2;
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b+Math.sqrt(D))/2/a;
        }else if (D == 0) {
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
