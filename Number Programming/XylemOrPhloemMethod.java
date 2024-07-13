//XYLEM OR PHLOEM IN METHOD
import java.util.Scanner;
class XylemOrPhloemMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=checkXylemOrPhloem(num);
		System.out.println(res);
	}

	//Method
	public static String checkXylemOrPhloem(int num)
	{
		int temp=num, temp1=num, sum=0, sum1=0;
		int last=temp%10;
		if (num<=99)
		{
			return "Invalid";
		}
		else
		{
			
			while (temp>9)
			{
				temp/=10;
			}		
			sum=temp+last;
			temp1/=10;
			while (temp1>9)
			{
				sum1+=temp1%10;
				temp1/=10;
			}
		}
		if (sum==sum1)
		{
			return "Xylem";
		}
		return "Phloem";
	}
}