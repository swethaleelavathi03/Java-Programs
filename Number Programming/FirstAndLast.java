//Add First and Last digit of a given number
import java.util.Scanner;
class FirstAndLast
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the number:");
		int num=sc.nextInt(); //234
		int last_num; 
		last_num=num%10; //Get Last Digit --> 234%10 --> 4
		for (int i=num;num>9;num/=10) //(num>9) --> Stops with a single digit --> 2
		{//We can update the value inside the for loop or in the updation
			// (num/=10); 
		}
		System.out.println("Sum:"+(num+last_num));

		/*
		while (num>9)
		{
			num/=10;
		}
		*/
	}
}