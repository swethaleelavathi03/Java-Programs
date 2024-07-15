//Perfect Number or Not
import java.util.Scanner;
class PerfectNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the number:");
		int num=sc.nextInt(), sum=0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0) //Given number is diving by the 'i'
			{
				sum+=i; //Summing the given number which is divided by 'i'
			}
						
		}
		if (num==sum)//Checking whether the given number and summation of a number are same
		{
			System.out.println(sum+": is a perfect number");
		}
		else 
		{
			System.out.println(sum+": is not a perfect number");
		}

	}
}