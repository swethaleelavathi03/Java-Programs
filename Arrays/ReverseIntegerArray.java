import java.util.Scanner;
import java.util.Arrays;
class ReverseIntegerArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
			System.out.println("Enter the size:");
			int size=sc.nextInt();
			int [] a=new int[size];
			solve(a);

	}

	//Method
	public static void solve(int [] a)
	{
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println("Enter the number a["+i+"]");
			a[i]=sc.nextInt();
		}
		/*for (int i=0;i<a.length;i++ )
		{
			System.out.print(a[i]+" ");
		}*/
		System.out.println(Arrays.toString(a));
	}
}