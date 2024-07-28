//Reverse Char Array
import java.util.Scanner;
import java.util.Arrays;
class ReverseCharArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the size of the Array:");
		int size=sc.nextInt();
		char [] a=new char[size];
		solve(a);
	}

	//Method
	public static void solve(char [] a)
	{
		for (int i=a.length-1;i>=0;i--) //int i=3-1; 2>=0; 2--[1]
		{
			System.out.println("Enter the character a["+i+"]:");
			a[i]=sc.next().charAt(0);
		}
		System.out.println("***************************");
		System.out.println(Arrays.toString(a));
	}
}