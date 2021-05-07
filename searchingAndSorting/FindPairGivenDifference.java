package searchingAndSorting;

import java.util.Arrays;

public class FindPairGivenDifference {
	
	 public static boolean findPair(int arr[], int size, int n) {
		 
		 Arrays.sort(arr);
		 int l = 0;
		 int r = 1;
		 
		 while(r < size ) {
			
			 if(arr[r] - arr[l] == n) {
				 return true;
			 }
			 else if(arr[r]-arr[l] < n) {
				 r++;
			 }
			 else if(arr[r]-arr[l] > n) {
				 if (r == l + 1) {
					 r++;
					 l++;
				 }
				 else {
					 l++;
				 }
			 }
		 }
		 
		 return false;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
