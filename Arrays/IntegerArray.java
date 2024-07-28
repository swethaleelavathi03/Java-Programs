//Integer Array
import java.util.Scanner;
class IntegerArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the size of the Array:");
		int size=sc.nextInt();
		int [] a=new int[size];
		solve(a);
	}

	//Method
	public static void solve(int [] a)
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the integer a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.println("***********************************");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}