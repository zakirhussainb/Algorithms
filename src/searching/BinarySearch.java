package searching;

import java.util.Arrays;

public class BinarySearch 
{
	public static int binarySearchForNumber(int[] arrNum, int ser) 
	{
		System.out.println("Performing Binary Search for Numbers.......");
		Arrays.sort(arrNum);
		System.out.println("Array after sorting......." + Arrays.toString(arrNum));
		int li = 0;
		int mi = 0;
		int hi = arrNum.length - 1;
		int comparisons = 0;
		
		while ( li <= hi )
		{
			mi = li + (hi - li) / 2;

			if( arrNum[mi] > ser )
				hi = mi - 1;
			else if( arrNum[mi] < ser )
				li = mi + 1;
			else
				return mi;
		}
		
		return -1;
	}

	public static int binarySearchForString(String[] arrStr, String searchName) 
	{
		System.out.println("Performing Binary Search for String.......");
		Arrays.sort(arrStr);
		System.out.println("Array after sorting......." + Arrays.toString(arrStr));
		
		int fi = 0;
		int mi = 0;
		int ei = arrStr.length - 1;
		int comparisons = 0;
		
		for(int i = 0; i < arrStr.length; i++)
		{
			mi = (fi + ei) / 2;
			comparisons++;
			if ( searchName.compareToIgnoreCase(arrStr[mi]) == 0 )
			{
				System.out.println("Number of comparisons made using binary search..." + comparisons);
				return mi;
			}
			else if ( searchName.compareToIgnoreCase(arrStr[mi]) < 0 )
			{
				ei = mi - 1;
			}
			else if ( searchName.compareToIgnoreCase(arrStr[mi]) > 0 )
			{
				fi = mi + 1;
			}
		}
		
		return -1;
	}
	
};
