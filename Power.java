//Number raised to the power
import java.util.Scanner;
class Power
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		
		System.out.println("Enter the X value:");
		int x=sc.nextInt();
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		int res=1;
		for (int i=1;i<=n;i++)
		{
			res=res*x;
		}
		System.out.println(res);
	}
}

class Power1
{
	public static void main(String [] args)
	{
		int x=2;
		int n=4;
		int i=1;
		int res=1;
		while (i<=n)
		{
			res*=x;
			i++;
		}
		System.out.println(res);
	}
}