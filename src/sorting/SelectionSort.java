package sorting;

public class SelectionSort 
{
	public static void selectionsortForNumbers(int[] arr, int n) 
	{
		System.out.println("\nImplementing Selection Sort for Numbers......");
		for(int i = 0; i < arr.length;i++)
		{
			int min_idx = i;
			for(int j = i + 1; j < arr.length; j++)
				if ( arr[j] < arr[min_idx] )
					min_idx = j;
			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	public static void selectionsortForString(String[] arrStr, int arrSize) 
	{
		System.out.println("\nImplementing Selection Sort for Strings......");
		for(int i = 0; i < arrSize;i++)
		{
			int min_idx = i;
			for(int j = i + 1; j < arrSize; j++)
				if ( arrStr[j].compareToIgnoreCase(arrStr[min_idx]) < 0 )
					min_idx = j;
			
			String temp = arrStr[min_idx];
			arrStr[min_idx] = arrStr[i];
			arrStr[i] = temp;
		}
	}
};
