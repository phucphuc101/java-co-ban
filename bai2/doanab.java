import java.util.Scanner;

public class doanab{
    
    public static void doanab(int X[],int n,int a,int b){
        int t=0,sum=0,tbc=0;
        System.out.println("Cac so trong doan [a,b] la :");
        for(int i=0;i<n;i++){
            if(X[i]>=a && X[i]<=b){
                System.out.println(X[i]);
                t++;
                sum+=X[i];
            }
        }
        tbc = sum/t;
        System.out.println("Tong cac so trong doan [a,b] la: "+sum);
        System.out.println("Trung binh cong cac so trong doan [a,b] la: "+tbc);
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int [] a = new int [n];
		int i=0;
		while(i<n)
		{
		    a[i] = Nhap.nextInt();
		    i++;
		}
		int c,d;
		
        System.out.println("Nhap doan [a,b]: ");
        c = Nhap.nextInt();
        d = Nhap.nextInt();
        doanab(a,n,c,d);
    }
}