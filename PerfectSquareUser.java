//Perfect Square using User defined function
import java.util.Scanner;
class PerfectSquareUser
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String ans="Not a perfect square";
		for (int i=1;i*i<=num;i++)
		{
			if (num%i==0 && num/i==i)
			{
				ans="Perfect square";
				break;
			}
			
		}
		System.out.println(ans);
		
	}
}