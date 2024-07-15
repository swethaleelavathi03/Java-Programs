import java.util.Scanner;
class DoWhileNCount
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int start=1;
		do
		{
			Thread.sleep(50);
			System.out.println("Tabrez:"+start);
			start++;
		}
		while (start<=n);
	}
}