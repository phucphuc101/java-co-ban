import java.util.Scanner;
class DemSHH_TBC
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
        int tong2 = 0;
        int dem=0;
        for(i=0; i<n;i++)
        { 
            int tong = 0;
            
	    for(int j=1;j<=a[i];j++)
        {
            if(a[i]%j==0)
            {
                tong = tong + j;
            }
        }
        if(tong==2*a[i])
        {
            dem++;
            tong2+=a[i];
        }
        }
        if(dem==0)
        {
            System.out.println("Khong co so hoan hao trong mang");
        }
        else
        System.out.println("So luong so hoan hao trong mang la : " + dem  + " va TBC la " + (double)tong2/dem);
        }
}