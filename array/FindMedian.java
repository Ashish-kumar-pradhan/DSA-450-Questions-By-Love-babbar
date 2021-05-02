package array;

import java.util.Arrays;

public class FindMedian {
	
	public static int median(int[] v) {
		Arrays.sort(v);
		int n = v.length;
		
		int ans = 0;
		
		if(n%2==0) {
			ans = (v[n/2 - 1]+v[n/2])/2;
		} else {
			ans = v[n/2];
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {56, 67, 30 ,79};
		
		System.out.println(median(arr));

	}

}
