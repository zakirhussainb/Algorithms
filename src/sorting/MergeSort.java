package sorting;

import java.util.Arrays;

public class MergeSort 
{
	public static void mergesortForNumbers(int[] arr, int n)
	{
		mergesort(arr,0,n-1);
	}
	public static void mergesort(int[] arr,int li, int ri)
	{
		if (li < ri)
		{
			int mi = (li + ri ) / 2;
			System.out.println("mergesort...mi..." + mi);
			mergesort(arr,li,mi);
			mergesort(arr,mi+1,ri);
			merge(arr,li,mi,ri);
		}
	}
	public static void merge(int[] arr, int li,int mi, int ri)
	{
		System.out.println("merge...li..." + li);
		System.out.println("merge...mi..." + mi);
		System.out.println("merge...ri..." + ri);
		// Find sizes of two subarrays to be merged
		int n1 = mi - li + 1;
		int n2 = ri - mi;
		
		System.out.println("n1..." + n1);
		System.out.println("n2..." + n2);
		
		/* Create temp arrays */
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		/*Copy data to temp arrays*/
		for (int i=0; i<n1; i++)
			L[i] = arr[li + i];
	    for (int i=0; i<n2; i++)
            R[i] = arr[mi + 1+ i];
	    
	    System.out.println("L..." + Arrays.toString(L));
	    System.out.println("R..." + Arrays.toString(R));
	    
	    /* Merge the temp arrays */
	    
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
	    
        // Initial index of merged subarray
        int k = li;
        System.out.println("k..." + k);
        while (i < n1 && j < n2)
        {
        	System.out.println("L[i]..." + L[i]);
        	System.out.println("R[j]..." + R[j]);
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
	    
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
}
