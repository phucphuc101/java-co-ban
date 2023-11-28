import java.util.Scanner;
public class TBC_UocChan
{
	public static void main(String[] args) 
	{
		System.out.println("Nhap so n = ");
		Scanner Nhap = new Scanner(System.in);
		int tong = 0;
		int dem = 0;
        int check=0;
		int n = Nhap.nextInt();
		for(int i  = 1 ;i<=n;i++)
		{
		    if(n%i==0 && i%2==0)
		    {
		        tong = tong + i;
                	check=1;
		        dem++;
		    }
		}
		if(check == 1)
		{
		    System.out.println("Trung binh cong cac uoc so chan cua n la: " + (double)tong/dem);
		}
		else
		System.out.println("Khong co uoc so chan");
		
	}
}