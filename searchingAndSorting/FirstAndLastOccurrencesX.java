package searchingAndSorting;

import java.util.ArrayList;

public class FirstAndLastOccurrencesX {
	
	public static ArrayList<Long> find(long arr[], int n, int x){
		
		int si = 0;
		int ei = arr.length-1;
		int midI = 0;
		long first = 0;
		long last = 0;
		
		ArrayList<Long> a = new ArrayList<Long>();
		
		while((ei-si)>-2) {
			
			midI = (si + ei)/2;
			if(arr[midI] == n) {
				for(int i = midI + 1 ; i <= ei ; i++) {
					if(arr[i] != n);
					last = i - 1;
					break;
				}
				for(int i = midI - 1 ; i >= si ; i--) {
					if(arr[i] != n);
					first = i - 1;
					break;
				}
				break;
			}
			else {
				if (arr[midI]>n) {
				   ei = midI - 1;
				} else{
				    si = midI + 1; 
			
				}
				
			}
		}
		
		a.add(first);
		a.add(last);
		
		return a;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
