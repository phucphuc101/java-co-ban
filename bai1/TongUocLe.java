import java.util.Scanner;
public class TongUocLe
	{	
		public static void main(String[]args)
{
		System.out.println("Nhap n: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int tong = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && i%2!=0)
			{
				tong = tong + i;
			}
		}
			System.out.print("Tong la: "+ tong);
}		
	}