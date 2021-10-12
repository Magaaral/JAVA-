
import java.util.Scanner;

/*
 * To develop a personal finance application that helps to manage your money
 * By entering your income as 5000.
 */

/**
 *
 * @author personal
 */
public class Management {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in); //As standard input stream
        System.out.print("Enter your income of this month:");
        int y=sc.nextInt();
        System.out.println(y);
        double a=0.55;
        a=a*y;
        double b=0.1;
        b=b*y;
        double c=0.1;
        c=c*y;
        double d=0.1;
        d=d*y;
        double e=0.1;
        e=e*y;
        double f=0.1;
        f=f*y;
        System.out.println("NEC- "+(int)a);
        System.out.println("FFA- "+(int)b);
        System.out.println("EDU- "+(int)c);
        System.out.println("LTSS- "+(int)d);
        System.out.println("PLAY- "+(int)e);
        System.out.println("GIVE- "+(int)f);
               
    }
    
}
