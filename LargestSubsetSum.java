public class LargestSubsetSum{
{
	public static long[] maxSubsetSumIS( int [], k )
	{
		int i, j, max = 0;
		int lss[] = new int[n];

	
		for ( i = 0; i < n; i++ )
			lss[i] = arr[i];

		
		for ( i = 1; i < n; i++ )
			for ( j = 0; j < i; j++ )
				if ( arr[i] > arr[j] &&
					lss[i] < lss[j] + arr[i])
					lss[i] = lss[j] + arr[i];

		
		for ( i = 0; i < n; i++ )
			if ( max < lss[i] )
				max = lss[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = new int[]{2, 2, 4};
		int n = arr.length;
		System.out.println("Sum of maximum sum is:"
		maxSubestSumIS( arr, n ) );
	}
}