import java.util.Scanner;
class WhileCount
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.println("Enter a number:");
		int n=sc.nextInt(); //100
		int count=1;
		while (count<=n) //1<=100
		{
			Thread.sleep(50);
			System.out.println(count);
			count++;
		}
	}
}