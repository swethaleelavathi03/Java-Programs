//Perfect Number in Method
import java.util.Scanner;
class PerfectNumberMethodRange
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		checkPerfectNumberOrNot(num, num2);
	}

	//Method
	public static void checkPerfectNumberOrNot(int start, int end)
	{
		for (int i=start;i<=end;i++)
		{
			int num=i;
			int sum=0;
			for (int j=1;j<num;j++)
			{
				if (num%j==0)
				{
					sum+=j;
				}
			}
			if (num==sum)
			{
				System.out.println(num+": Perfect Number");
			}
			else
				System.out.println(num+": Not a Perfect Number");
		}
		
		
	}
}