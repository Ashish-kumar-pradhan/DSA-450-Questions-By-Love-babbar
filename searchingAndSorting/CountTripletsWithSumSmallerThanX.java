package searchingAndSorting;

import java.util.Arrays;

public class CountTripletsWithSumSmallerThanX {
	
	public static long countTriplets(long arr[], int n,int sum) {
		Arrays.sort(arr);
		long count = 0;
		for(int i = 0 ; i < n ; i++) {
			int l = i + 1;
			int r = n-1;
			while(l < r) {
				if (arr[i] + arr[l] + arr[r] < sum ) {
					count += (r-l);
					l++;
				}
				else {
					r--;
				}
			}
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
