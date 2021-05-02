package array;

import java.util.Arrays;

public class MinimizeHeight {
	
	
	
	public static int getMin1(int[] arr, int n, int k) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < n ; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		return max - min - 2*k;
		
	}
	
	
	public static int getMin2(int[] arr, int n, int k) {
		
		int maxB = Integer.MIN_VALUE;
		int minB = Integer.MAX_VALUE;
		
		
		int maxS = Integer.MIN_VALUE;
		int minS = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < n ; i++) {
			if(maxB < arr[i]) {
				maxB = arr[i];
			}
			if(minB > arr[i]) {
				minB = arr[i];
			}
			
			arr[i] = arr[i] - k;
		}
		
		maxB = maxB + k;
		minB = minB + k;
		
		
		for(int i = 0 ; i < n ; i++) {
			if(maxS < arr[i] ) {
				maxS = arr[i];
			}
			if(minS > arr[i] && arr[i] >= 0 ) {
				minS = arr[i];
			}
		}
		
		if (minB > maxS) {
			return Math.min(maxB-maxS, minB-minS);
		}
		else {
			return maxS - minB;
		}
	}
	
	
	public static int getMinDiff(int[] arr, int n, int k) {
		
	
		Arrays.sort(arr);
	    int result = arr[n - 1] - arr[0];
	    for (int i = 1; i < n; i++) {
	        int min = Math.min(arr[0] + k, arr[i] - k);
	        int max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
	        result = Math.min(result, max - min);
	    }
	    return result;
	}

	public static void main(String[] args) {
		
		int arr[] = {8 , 1 ,5, 4, 7, 5, 7, 9, 4 , 6};
		
		System.out.println(getMin2(arr , 10 , 5));
		System.out.println(getMinDiff(arr , 10 , 5));
		

	}

}
