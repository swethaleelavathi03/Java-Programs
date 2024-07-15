//Frequency of each element
import java.util.*;
class FrequencyEach
{
	public static void main(String [] args)
	{
		int[] num={2,3,4,5,1,2,4,2};
		frequency(num);
	}

	//Method
	public static void frequency(int [] array)
	{
		HashSet<Integer> freq=new HashSet<>();
		for (int i=0;i<array.length;i++)
		{
			freq.add(array[i]);
		}

		//for each loop
		for (int i:freq)
		{	
			int count=0;
			for (int j=0;j<array.length;j++)
			{
				if (i==array[j])
				{
					count++;
				}
			}
			System.out.println(i+":"+count);
		}
	}
}