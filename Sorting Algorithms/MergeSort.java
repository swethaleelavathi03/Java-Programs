/*
MERGE SORT
*/

import java.util.Arrays;
class MergeSort
{
	public static void main(String [] args)
	{
		int [] a={8,3,4,16,14,2,46};
		System.out.println(Arrays.toString(a));
		divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	//Method to divide
	public static void divide(int [] a, int low, int high)
	{
		if (low==high)
		{
			return;
		}

		int mid=(low+high)/2;
		//To divide left side
		divide(a, low, mid);
		//To divide right side
		divide(a, mid+1, high);
		//To merge the elements
		merge(a, low, mid, high);
	}

	//Method to Merge
	public static void merge(int [] a, int low, int mid, int high)
	{
		int [] b=new int[a.length];
		int left=low, right=mid+1;
		int m=0;
		while (left<=mid && right<=high)
		{
			if (a[left]<a[right])
			{
				b[m]=a[left];
				m++;
				left++;
			}
			else if (a[left]>a[right])
			{
				b[m]=a[right];
				m++;
				right++;
			}
		}

		while (left<=mid)
		{
			b[m++]=a[left++];
		}

		while (right<=high)
		{
			b[m++]=a[right++];
		}

		for (int i=low,k=0;i<=high;i++,k++)
		{
			a[i]=b[k];
		}
	}
}