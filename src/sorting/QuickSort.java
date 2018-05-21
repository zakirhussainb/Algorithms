package sorting;
/*  
 * Concepts:-
 * 
 * 1. Divide:- # Divide by choosing rightmost element in the array.
 * 			   # Call this element pivot.
 * 			   # Rearrange so as, elements less than pivot are to the left and 
 * 			   elements greater than pivot are to the right.(Partitioning Procedure).
 * 2. Conquer:- # Recursively sort subarrays arr[p...q-1](elements to left of pivot  <= to pivot).
 * 				# Recursively sort subarrays arr[q+1...r](elements to right of pivot >= to pivot).
 * 3. Combine:- This step has no roll to offer. After conquer is done. Everything is sorted.
 * 
 * */

/*
 * Important Links:-
 * 	1. http://me.dt.in.th/page/Quicksort/
 *  2. https://www.khanacademy.org/computing/computer-science/algorithms/quick-sort/a/linear-time-partitioning
 *  3. 
 */

public class QuickSort 
{
	public static void quicksortForNumbers(int[] arr, int n)
	{
		System.out.println("****** Performing Quick Sort for Numbers *******");
		int li = 0;
		int hi = arr.length-1;
		quickSort(arr,li,hi);
	}
	static void quickSort(int[] arr,int li, int hi)
	{
		if(li < hi)
		{
			int pi = partition(arr,li,hi);
			System.out.println("pi..." + pi);
			quickSort(arr,li,pi-1);
			quickSort(arr,pi+1,hi);
		}
	}
	static int partition(int[] arr, int li, int hi) 
	{
		int pivot = arr[hi];
		System.out.println("pivot..." + pivot);
		System.out.println("li..." + li);
		int i = li - 1;
		System.out.println("i..." + i);
		System.out.println("hi..." + hi);
		for(int j = li; j < hi; j++)
		{
			if(arr[j] <= pivot)
			{
				i++;
				System.out.println("i..in..." + i);
				int temp = arr[i];
				System.out.println("temp..." + temp);
				arr[i] = arr[j];
				System.out.println("arr[i]..." + arr[i]);
				arr[j] = temp;
				System.out.println("arr[j]..." + arr[j]);
				System.out.println("j..." + j);
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[hi];
		arr[hi] = temp;
		
		return i+1;
	}
}
