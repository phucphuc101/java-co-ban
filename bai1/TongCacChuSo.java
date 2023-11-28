import java.util.Scanner;
public class TongCacChuSo
{
	public static void main(String[] args) {
		System.out.println("Nhap n =");
		Scanner Nhap = new Scanner(System.in);
		int n = Nhap.nextInt();
		int sotachra;
		int s =0;
		for(;n!=0;)
		{
        sotachra = n % 10;
        s += sotachra;
        n /= 10;
	    }
	    System.out.println("Tong cac chu so cua n la : "+s);
	}
}