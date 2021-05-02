package array;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
	
	public static long findMinDiff(ArrayList<Long> a, long n, long m){
		Collections.sort(a);
		
		long minDiff = Integer.MAX_VALUE;
		for(long i = 0 ; i + m - 1 < n ; i++) {
			if(minDiff > a.get((int) (i+m-1)) - a.get((int) i) ) {
				minDiff = a.get((int) (i+m-1)) - a.get((int) i);
			}
		}
		
		return minDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] B = {17, 83, 59, 25, 38, 63, 25, 1, 37};
		ArrayList<Long> A = new ArrayList<Long>();
		
		for(int i = 0 ; i < B.length ; i++) {
			A.add(B[i]);
		}
		
		System.out.println(findMinDiff(A, 9 , 9));

	}

}
