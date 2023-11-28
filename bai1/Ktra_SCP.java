import java.util.Scanner;
public class Ktra_SCP
	{	
		public static void main(String[]args)
{
		System.out.println("Nhap n: ");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int check = 0;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n==i*i)
			{
				check=1;
				break;
			}
		}
		if(check==1)
			System.out.print("la so chinh phuong");
	    else
	    System.out.print("Khong la so chinh phuong");
}		
	}