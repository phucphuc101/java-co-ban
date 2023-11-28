import java.util.Scanner;
public class TongUocChan
	{	
		public static void main(String[]args)
{
		System.out.println("Nhap n: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int tong = 0;
		int check = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && i%2==0)
			{
				check = 1;
				tong = tong + i;
			}
			else
			{
				check=0;
			}
		}
		if(check == 1)
		{	
			System.out.print("Tong la: "+ tong);
		}
		else
			System.out.print("Khong co uoc so chan");	
}		
	}