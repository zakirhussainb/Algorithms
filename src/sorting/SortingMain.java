package sorting;

import java.util.Arrays;
public class SortingMain 
{

	public static void main(String[] args) 
	{
//		int[] arr = {5,2,6,7,8,12,34,20,3,67};
		int[] arr = {38, 27, 43};//2,6,3,4,5,1
		int n = arr.length;
		
		String[] arrStr = {"GeeksforGeeks","Quiz","Practice","Gblogs","Coding"};
		int arrSize = arrStr.length;
		
		System.out.println("Array Before Sorting...." + Arrays.toString(arr));
		
//		SelectionSort.selectionsortForNumbers(arr,n);
//		SelectionSort.selectionsortForString(arrStr,arrSize);
		
//		BubbleSort.bubblesortForNumbers(arr,n);
//		BubbleSort.bubblesortForString(arrStr,arrSize);

//		MergeSort.mergesortForNumbers(arr,n);
		
		QuickSort.quicksortForNumbers(arr,n);
		
		
		printSortedArray(arr);
//		printSortedArray(arrStr);
		
	}
	private static void printSortedArray(int[] arr) 
	{
		System.out.println("\nArray After Sorting...." + Arrays.toString(arr));
	}
	private static void printSortedArray(String[] arr) 
	{
		System.out.println("\nArray After Sorting...." + Arrays.toString(arr));
	}

	

}
