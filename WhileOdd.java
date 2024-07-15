import java.util.Scanner;
class WhileOdd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=1;
		while (start<=n)
		{
			if (start%2!=0)
			{
				Thread.sleep(50);
				System.out.print(start+" ");
			}
			start++;
		}
	}
}