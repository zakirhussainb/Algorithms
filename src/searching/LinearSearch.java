package searching;

public class LinearSearch 
{
	public static int linearSearchForNumber(int[] arrNum,int ser) 
	{
		System.out.println("Performing Linear Search for Numbers.....");
			int comparisons = 0;
			for(int i = 0; i < arrNum.length; i++)
			{
				comparisons++;
				if ( arrNum != null || arrNum.length == 0 )
				{
					System.out.println("Number of comparisons made using linear search..." + comparisons);
					if( arrNum[i] == ser )
					{
						
						return i;
					}
				}
			}
			return -1;
	}
	public static int linearSearchForString(String[] arrStr,String ser) 
	{
		System.out.println("Performing Linear Search for Strings.....");
		int comparisons = 0;
		for(int i = 0 ; i < arrStr.length; i++ )
		{
			comparisons++;
			if ( arrStr[i].compareToIgnoreCase(ser) == 0 )
			{
				System.out.println("Number of comparisons made using linear search..." + comparisons);
				return i;
			}
		}
		return -1;
	}
};
