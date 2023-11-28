import java.util.Scanner;
public class Array_Sapxep_2somin_2somax
{
    public static void sapxep(int a[],int n){
        int tg;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
            }
        }
    }
}
    public static void inMang(int a[],int n){
        
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int [] a = new int [n];
		int i=0;
		
		while(i<n)
		{
		    a[i] = Nhap.nextInt();

		    i++;
		}
		sapxep(a,n);
        System.out.println("Mang da sap xep theo thu tu giam dan:");
        inMang(a,n);
        System.out.println("Hai so lon nhat cua mang la: "+a[n-1]+","+a[n-2]);
        System.out.println("Hai so nho nhat cua mang la: "+a[0]+","+a[1]);
    }
}