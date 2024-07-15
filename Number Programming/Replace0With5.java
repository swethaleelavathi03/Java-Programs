/*Given an integer as input and replace all the ‘0’ with ‘5’ in the integer. 

Examples: 

Input: 102 
Output: 152
Explanation: All the digits which are '0' is replaced by '5' 

Input: 1020 
Output: 1525
Explanation: All the digits which are '0' is replaced by '5'
*/
import java.util.Scanner;
class Replace0With5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		String s=sc.next();
		char [] ch=s.toCharArray();
		for (int i=1;i<ch.length;i++)
		{
			if (ch[i]=='0')
			{
				ch[i]='5';
			}
		}
		System.out.println(ch);
	}
}