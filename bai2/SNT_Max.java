import java.util.Scanner;
class SNT_Max
{
    public static void main (String[] args) {
        System.out.print("Nhap so phan tu cua mang n = ");
        Scanner Nhap = new Scanner(System.in);
        int n = Nhap.nextInt();
        int i=0;
        int []a = new int [n];
        while(i<n)
        {
            a[i]=Nhap.nextInt();
            i++;
        }
        
            
        int max =0;
        for( i=0; i<n;i++)
        { 
            int tong = 0;
	for(int j=1;j<=a[i];j++)
        {
            if(a[i]%j==0)
            {
                tong = tong + j;
            }
        }
        if(tong==a[i]+1)
        {
            if(tong > max)
            {
                max = a[i];
            }
        }
        }
        if(max==0)
        {
            System.out.println("Khong co so nguyen to trong mang");
        }
        else
        System.out.println("So nguyen to lon nhat trong mang la : " + max);
        }
}