/*
Perfect Number In Normal Method
Input: 6
Output:Perfect Number
Explanation: Factors of 6 --> 1, 2, 3 --> --> 1+2+3 = 6
Therefore, Sum of the factors will be equivalent to the given number.
*/
import java.util.Scanner;
class PerfectNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		if (num==sum)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}
}