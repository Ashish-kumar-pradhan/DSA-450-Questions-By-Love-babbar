package array;

import java.util.PriorityQueue;

public class KthSmalestElement {
	
	public static int kthMin(int[] arr, int l, int r, int k) 
	{ 
	    //Your code here
	    int ans = 0;
	    int index = 0 ;
	    for(int i = 0 ; i < k ; i++ ){
	    	int minValue = Integer.MAX_VALUE;
	        int j = i;
	        for( ; j < r+1 ; j++ ){
	           
	            if (arr[j] < minValue){
	                minValue = arr[j];
	                index = j ;
	            }
	        }
	        
	        arr[index] = arr[i];
	        arr[i] = minValue;
	        
	        if (i == k-1) {
	        	ans = minValue;
	        }
	    }
	    return ans;
	}
	
     public static int kthMin2(int arr[] , int k) {
		
		int kthelem = 0;
		
		PriorityQueue<Integer> hp = new PriorityQueue<Integer>();
		for(int i : arr) {
			hp.add(i);
		}
		
		for(int i = 0 ; i < k ; i++) {
			kthelem = hp.remove();
		}
		
		return kthelem;
		
	}
	
	public static int kthMax2(int arr[] , int k) {
		
		int kthelem = 0;
		
		PriorityQueue<Integer> hp = new PriorityQueue<Integer>();
		for(int i : arr) {
			hp.add(i);
		}
		
		for(int i = 0 ; i < arr.length + 1 - k ; i++) {
			kthelem = hp.remove();
		}
		
		return kthelem;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7 ,10 ,4 ,3 ,20 ,15};
		
		System.out.println( kthMax2(arr , 2));
		System.out.println( kthMin2(arr , 2));
		

	}

}
