//Perfect Number in Method
import java.util.Scanner;
class PerfectNumberMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=checkPerfectNumberOrNot(num);
		System.out.println(res+":"+num);
	}

	//Method
	public static String checkPerfectNumberOrNot(int num)
	{
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
			return "Perfect Number";
		}
		return "Not a Perfect Number";
	}
}