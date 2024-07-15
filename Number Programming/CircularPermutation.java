/*Permutations to arrange N persons around a circular table
Input: 4
Output:6

Input:5
Output:24

Hint: (n-1)!
*/
import java.util.Scanner;
class CircularPermutation
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int fact=1;
		for (int i=1;i<num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}