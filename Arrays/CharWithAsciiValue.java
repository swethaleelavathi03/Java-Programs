//Store and Print Characters with Ascii Values
import java.util.Scanner;
class CharWithAsciiValue
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.println("Hello From Swetha");
		Thread.sleep(50);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		char [] a=new char[size];
		solve(a);
		Thread.sleep(50);
		System.out.println("Bye From Swetha");
	}

	//Method
	public static void solve(char [] a)
	{
		for (int i=0;i<a.length;i++)
		{
			Thread.sleep(50);
			System.out.println("Enter the character:");
			a[i]=sc.next().charAt(0);
		}
		for (int i=0;i<a.length;i++)
		{
			Thread.sleep(50);
			System.out.println(a[i]+":"+(int)a[i]);
		}
	}
}