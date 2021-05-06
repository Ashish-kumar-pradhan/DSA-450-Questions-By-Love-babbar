package searchingAndSorting;

import java.util.ArrayList;

public class FirstAndLastOccurrencesX {
	
	public static ArrayList<Long> find(long arr[], int n, int x){
		
		int si = 0;
		int ei = arr.length-1;
		int midI = 0;
		
		while((ei-si)>-2) {
			
			if(arr[midI] == n) {
				
			}if(arr[midI+1] > n) {
				
			}
			else {
				if (arr[midI]>n) {
				   ei = midI - 1;
				} else{
				    si = midI + 1; 
			
				}
				
			}
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
