package strings;

import java.util.ArrayList;

public class WordWrap {
	
	public int[][] solveWordWrap (int[] nums, int k){
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int i = 0 ;
		while(i < nums.length ){
			int j = i;
			int l = nums[i];
			while(l <= k && j < nums.length){
				l++;
				j++;
				l += nums[j];
			}
			a.add(i);
			b.add(j-1);
			i++;
		}
		int[][] arr = new int[a.size()][2];
		for(int n = 0 ; n < a.size() ; n++) {
			arr[n][0] = a.get(n);
			arr[n][1] = b.get(n);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
