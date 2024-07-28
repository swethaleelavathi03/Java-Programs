//Double Array
import java.util.Scanner;
import java.util.Arrays;
class DoubleArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the size of the Array:");
		int size=sc.nextInt();
		double [] a=new double[size];
		solve(a);
	}

	//Method
	public static void solve(double [] a)
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the percentage a["+i+"]:");
			a[i]=sc.nextDouble();
		}
		System.out.println("*********************************");
		System.out.print(Arrays.toString(a));
	}
}
