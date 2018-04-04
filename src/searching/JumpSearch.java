package searching;

import java.util.Arrays;

public class JumpSearch 
{
	public static int jumpSearchForNumber(int[] arrNum, int ser) 
	{
		System.out.println("Performing Jump Search for Numbers.......");
		Arrays.sort(arrNum);
		System.out.println("Array after sorting......." + Arrays.toString(arrNum));
		
		int size = arrNum.length;
		int step = (int)Math.floor(Math.sqrt(size));
		System.out.println("step..." + step);
		
		int prev = 0;
		while( arrNum[(int)Math.min(step, size)-1] < ser )
		{
			prev = step;
			step += Math.floor(Math.sqrt(size));
//			System.out.println("prev..in.." + prev);
//			System.out.println("step..in.." + step);
			if( prev >= size )
			{
				return -1;
			}
		}
		
		System.out.println("prev..out.." + prev);
		System.out.println("step..out.." + step);
		while( arrNum[prev] < ser )
		{
			prev++;
//			System.out.println("prev..1..." + prev);
			if ( prev == Math.min(step, size) )
			{
				return -1;
			}
			
		}
		System.out.println("prev..outer...out.." + prev);
		if ( arrNum[prev] == ser )
			return prev;
		
		return -1;
	}
	
	public static int jumpSearchForString(String[] arrStr, String ser) 
	{
		System.out.println("Performing Jump Search for String.......");
		Arrays.sort(arrStr);
		System.out.println("Array after sorting......." + Arrays.toString(arrStr));
		
		int size = arrStr.length;
		int step = (int)Math.floor(Math.sqrt(size));
		int prev = 0;
		
		while( arrStr[(int)Math.min(step,size)-1].compareToIgnoreCase(ser) < 0 )
		{
			prev = step;
			step = step + (int)Math.floor(Math.sqrt(size));
			
			if ( prev >= size )
				return -1;
		}
		System.out.println("prev...." + prev);
		System.out.println("step...." + step);
		while( arrStr[prev].compareToIgnoreCase(ser) < 0 )
		{
			prev++;
			if ( prev == Math.min(step, size) )
				return -1;				
		}
		
		if (arrStr[prev].compareToIgnoreCase(ser) == 0 )
			return prev;
		
		return -1;
	}
	
};
