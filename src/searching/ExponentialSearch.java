package searching;

import java.util.Arrays;

public class ExponentialSearch 
{

	public static int expoSearchForNumber(int[] arrNum, int ser) 
	{
		System.out.println("Performing Exponential Search for Number.......");
		Arrays.sort(arrNum);
		System.out.println("Array after sorting......." + Arrays.toString(arrNum));
		if(arrNum[0] == ser)
			return 0;

		int bound = 1;
		while( bound < arrNum.length && arrNum[bound] < ser )
		{
			bound = bound * 2;
		}
		return binaSearchNum(arrNum,bound/2,Math.min(bound,arrNum.length),ser);
	}
	private static int binaSearchNum(int[] arrNum, int li, int hi, int ser) 
	{		
		int mi = li + (hi - li) / 2;
		
		if ( arrNum[mi] > ser )
			return binaSearchNum(arrNum,li,mi-1,ser);
		else if ( arrNum[mi] < ser )
			return binaSearchNum(arrNum,mi+1,hi,ser);
		else
			return mi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int expoSearchForString(String[] arrStr, String searchName)
	{
		System.out.println("Performing Exponential Search for String.......");
		Arrays.sort(arrStr);
		System.out.println("Array after sorting......." + Arrays.toString(arrStr));
		
		if ( arrStr[0].compareToIgnoreCase(searchName) == 0 )
			return 0;
		
		int bound = 1;
		while( bound < arrStr.length && arrStr[bound].compareToIgnoreCase(searchName)<0 )
		{
			bound = bound * 2;
		}
		return binaSearchStr(arrStr, bound/2, Math.min(bound,arrStr.length), searchName);
	}
	private static int binaSearchStr(String[] arrStr, int li, int hi, String searchName) 
	{
		int mi = li + (hi - li) / 2;
		
		if (li > hi)
			return -1;
		
		if (arrStr[mi].compareToIgnoreCase(searchName) >0 )
			return binaSearchStr(arrStr,li,mi-1,searchName);
		else if (arrStr[mi].compareToIgnoreCase(searchName) <0 )
			return binaSearchStr(arrStr,mi+1,hi,searchName);
		else
			return mi;
	}

};
