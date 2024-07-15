import java.util.Scanner;
class SkillAnalyzer
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("\t\t\tMay I know your skills:");
		System.out.println("1.Java\n2.Python\n3.SQL\n4.Web-Tech");
		System.out.println("Enter your skill:");
		System.out.println("*************************");
		int input=sc.nextInt();
		if (input==1)
		{
			System.out.println("Dosa");
		}
		else if (input==2)
		{
			System.out.println("Biryani");
		}
		else if (input==3)
		{
			System.out.println("Idli");
		}
		else if (input==4)
		{
			System.out.println("Chappathi");
		}
		else
		{
			System.out.println("Sorry! No dishes available");
		}
	}
}