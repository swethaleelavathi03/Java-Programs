//CountRange
import java.util.Scanner;
class CountRange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=1;
		while (start<=n)
		{
			System.out.println(start);
			start++;
		}
	}
}