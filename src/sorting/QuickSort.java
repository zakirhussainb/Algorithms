package gfg.algorithms.Sorting;

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
			quickSort(arr,li,pi-1);
			quickSort(arr,pi+1,hi);
		}
	}
	static int partition(int[] arr, int li, int hi) 
	{
		int pivot = arr[hi];
		int i = li - 1;
		
		for(int j = li; j < hi; j++)
		{
			if(arr[j] <= pivot)
			{
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[hi];
		arr[hi] = temp;
		
		return i+1;
	}
}
