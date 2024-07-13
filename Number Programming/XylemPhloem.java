//CHECK THE GIVEN NUMBER IS XYLEM OR PHLOEM
import java.util.Scanner;
class XylemPhloem
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		//Using FOR loop

		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int sum1=0;
		int last=num%10;
		int temp=num;
		//To print first and last digit
		for (int i=num;num>9;sum+=num)
		{
			num=num/10;
		}
		sum=num+last;
		System.out.println(sum);		
		//To print middle digits
		temp=temp/10; //Removing last digit
		for (int j=temp;temp>9;)
		{
			sum1+=temp%10;
			temp=temp/10;
		}
		System.out.println(sum1);
		//Validating the numbers
		if (sum==sum1)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Phloem");
		}
	}
}



//Using WHILE loop
class PhloemXylem
{
	public static void main(String [] args)
	{
		int num=2345;
		int sum=0;
		int sum1=0;
		int temp=num;
		int last=num%10;
		while (num>9)
		{
			num/=10;
		}
		sum=num+last;
		System.out.println(sum);
		temp/=10;
		while (temp>9)
		{
			sum1+=temp%10;
			temp/=10;
		}
		System.out.println(sum1);
		if (sum==sum1)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("Phloem");
		}

	}
}