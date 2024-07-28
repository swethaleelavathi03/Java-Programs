//Char Array
import java.util.Scanner;
import java.util.Arrays;
class CharArray
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
		for (int i=0;i<a.length;i++)
		{
			System.out.print("Enter the char a["+i+"]:");
			a[i]=sc.next().charAt(0);
		}
		System.out.println("***************************");
		System.out.println(Arrays.toString(a));
	}
}

/*
import java.util.Scanner;
import java.util.Arrays;
class CharArray
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		solve(a, size);
	}

	//Method
	public static void solve(char [] a, int [] size)
	{
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		char a=new char[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter the character a["+i+"]:");
			a[i]=sc.next().charAt(0);
		}
		System.out.println("*****************************************");
		System.out.println(Arrays.toString(a));
	}
}*/