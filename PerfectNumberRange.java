//Perfect Number in Range
import java.util.Scanner;
class PerfectNumberRange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the start:");
		int start=sc.nextInt();
		System.out.print("Enter the end:");
		int end=sc.nextInt();
		
		for (int i=start;i<=end;i++)
		{
			int num=i, sum=0; //initializing num and sum variables
			for (int j=1;j<num;j++)
			{
				if (num%j==0)
				{
					sum+=j;
				}
			}
			if (num==sum)
			{
				System.out.println(num);
			}
		}
	}
}