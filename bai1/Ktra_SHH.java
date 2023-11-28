import java.util.Scanner;
public class Ktra_SHH
	{	
		public static void main(String[]args)
{
		System.out.println("Nhap n: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int tong = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				tong = tong + i;
			}
		}
		if(tong==n*2)
			System.out.print("la so hoan hao");
	    else
	    System.out.print("Khong la so hoan hao");
}		
	}