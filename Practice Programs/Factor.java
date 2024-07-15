//Finding the factor of a given number
import java.util.Scanner;
class Factor
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		//Using FOR loop
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				System.out.println("The factor of "+n+" is:"+i);
			}
		}
	}
}

//Using WHILE loop
class Factors
{
	public static void main(String [] args)
	{
		int n=6;
		int i=1;
		while (i<=n)
		{
			if (n%i==0)
			{
				System.out.println("The factors of "+n+" is:"+i);
			}
			i++;
		}
	}
}