package array;

import java.util.Arrays;

public class MergeWithoutExtraSpace {

	  public static void merge1(int arr1[], int arr2[], int n, int m) {
	        
		  for (int i = 0 ; i < Math.min(arr1.length, arr2.length) ; i++) {
			  if(arr1[arr1.length-1 -i] > arr2[i]){
				  int temp = arr1[arr1.length-1 -i];
				  arr1[arr1.length-1 -i] = arr2[i];
				  arr2[i] = temp;
			  }
			  else {
				  break;
			  }
		  }
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
	    }
	  
	  public static void merge2(int arr1[], int arr2[], int n, int m) {
		  int gap = m + n ;
		  do {
			  gap = (gap+1)/2;
			  int s = 0;
			  int f = s + gap;
			 
			  while(f < n + m) {
				  int temp;
				  
				  if( s >= n && f >= n ) {
					  if(arr2[s%n] > arr2[f%n]) {
						  temp = arr2[f%n];
						  arr2[f%n] = arr2[s%n];
						  arr2[s%n] = temp;
					  }
				  }
				  
				  if( s < n && f < n ) {
					  if(arr1[s] > arr1[f]) {
						  temp = arr1[s];
						  arr1[s] = arr1[f];
						  arr1[f] = temp;
					  }
				  }
				  
				  if( s < n && f >= n ) {
					  if(arr1[s] > arr2[f%n]) {
						  temp = arr1[s];
						  arr1[s] = arr2[f%n];
						  arr2[f%n] = temp;
					  }
				  }
				   
				  s++;
				  f++;
			  }
			  
		  }
		  while(gap!=1); 
	  }

	public static void main(String[] args) {
		
		
		int array1[] = {1 , 3 , 5 , 7 , 4};
		int array2[] = {0 , 2 , 6 , 8 , 9 , 11 , 12};
		
		merge2(array1 , array2 , 5 , 7);
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(array1[i]+" ");
		}
		
		for(int i = 0 ; i < 7 ; i++) {
			System.out.print(array2[i]+" ");
		}

	}

}
