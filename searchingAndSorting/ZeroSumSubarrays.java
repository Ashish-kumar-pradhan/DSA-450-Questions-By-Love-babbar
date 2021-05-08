package searchingAndSorting;

import java.util.HashMap;

public class ZeroSumSubarrays {
	
	public static long findSubarray(long[] arr ,int n) {
		
		long count = 0;
		HashMap<Long , Integer> hp = new HashMap<Long , Integer>();
		long a[] = new long[n + 1];
		a[0] = 0;
		for(int i = 1 ; i < n + 1 ; i++) {
			a[i] = a[i - 1] + arr[i - 1];
		}
		
		for(int i = 0 ; i < n + 1 ; i++) {
			
			if(hp.containsKey(a[i])) {
				count += hp.get(a[i]);
				hp.put(a[i] , hp.get(a[i]) + 1);

			}
			else {
				hp.put(a[i], 1);
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
		long arr1[] = {0,0,5,5,0,0};
//		System.out.println(findSubarray(arr , 10));
//		System.out.println();
		System.out.println(findSubarray(arr1 , 6));
	}

}
