import java.util.Scanner;
import java.lang.Math;

public class UCLN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=a, d=b;
        while(a*b!=0){
            if(a>b){a=a%b;}
            else b=b%a;
        }
        int ucln = a+b;
        int bcnn = (c*d)/(a+b);
        System.out.println("UCLN: "+ucln);
        System.out.println("BCNN: "+bcnn);
    }
}