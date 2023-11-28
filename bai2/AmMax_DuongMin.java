import java.util.Scanner;
public class AmMax_DuongMin
{
    public static int soammax(int a[],int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                max = a[i];
                break;
            }
        }
        for(int j=0;j<n;j++){
            if(max<a[j] && a[j]<0)
                 max = a[j];
            }  
        return max;
        }
    public static int soduongmin(int a[],int n){
        int min = 0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                min = a[i];
                break;
            }
        }
                for(int j=0;j<n;j++){
                    if(min>a[j] && a[j]>0)
                        min = a[j];
                }
        return min;
        }
	public static void main(String[] args) 
	{
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
        System.out.println("So am lon nhat cua mang la: "+soammax(a,n));
        System.out.println("So duong nho nhat cua mang la: "+soduongmin(a,n));
	}
}