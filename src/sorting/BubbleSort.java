package sorting;

public class BubbleSort 
{
	public static void bubblesortForNumbers(int[] arr, int n)
	{
		System.out.println("\nImplementing Bubble Sort for Numbers......");

		for(int i = 0; i < n - 1; i++)
		{
			boolean swapped = false;
			for(int j = 0; j < n - i - 1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	public static void bubblesortForString(String[] arrStr, int arrSize) 
	{
		System.out.println("\nImplementing Bubble Sort for Strings......");

		boolean swapped;
		for(int i = 0; i < arrSize - 1; i++)
		{
			swapped = false;
			for(int j = 0; j < arrSize - i - 1; j++)
			{
				if (arrStr[j].compareToIgnoreCase(arrStr[j+1])>0)
				{
					String temp = arrStr[j];
					arrStr[j] = arrStr[j+1];
					arrStr[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}
}
