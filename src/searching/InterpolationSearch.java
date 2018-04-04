package searching;

import java.util.Arrays;

public class InterpolationSearch 
{
	/**
	 * It parallels how humans search through a telephone book for a particular name, 
	 * the key value by which the book's entries are ordered. 
	 */

	public static int interpolationSearchForNumber(int[] arrNum, int ser) 
	{
		System.out.println("Performing Interpolation Search for Numbers.......");
		Arrays.sort(arrNum);
		System.out.println("Array after sorting......." + Arrays.toString(arrNum));
		int li = 0;
		int hi = arrNum.length - 1;
		int mi = 0;
		
		System.out.println("Array size...." + arrNum.length);
		
		while(li <= hi) //while( arrNum[li] <= ser && arrNum[hi] >= ser )
		{
//			if ( arrNum[hi] - arrNum[li] == 0 )
//				return (li + hi)/2;
			
			mi = li +  ( (ser - arrNum[li]) * (hi - li) ) / (arrNum[hi] - arrNum[li]);
			
			if ( arrNum[mi] > ser )
				hi = mi - 1;
			else if ( arrNum[mi] < ser )
				li = mi + 1;
			else
				return mi;
		}
		return -1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int interpolationSearchForString(String[] arrStr, String searchName) 
	{
		
		return -1;
	}

}
