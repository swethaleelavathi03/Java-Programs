//Natural Numbers in Reverse
import java.util.Scanner;
class ReverseNaturalNumbers
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.print("Enter the N value:");
		int n=sc.nextInt();
		for (int i=n;i>=1;i--)
		{
			Thread.sleep(50);
			System.out.print(i+" ");
		}
	}
}