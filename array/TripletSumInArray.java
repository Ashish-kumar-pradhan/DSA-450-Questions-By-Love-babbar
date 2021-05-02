package array;

import java.util.Arrays;
import java.util.HashMap;

public class TripletSumInArray {
	
	 public static boolean sum2(int A[], int n, int X) {
		 
		 HashMap<Integer,String> hp = new HashMap<Integer,String>();
		 
		 for(int i = 0 ; i < n ; i ++){
			 for(int j = 0 ; j < n ; j ++){
				 if(i == j) {
					 hp.put(Integer.MIN_VALUE, " ");
				 }
				 else {
					 hp.put(A[i] + A[j] , i+""+j );
				 }
			 }
		 }
		 
         for(int i = 0 ; i < n ; i ++){
        	 
        	 if(hp.containsKey(X - A[i])) {
        		 if(hp.get(X-A[i]).contains(i+"")) {
            		 return false;
            	 }
        		 else {
        			 return true;
        		 }
        	 }
		 }
         return false;
	 }
	 
	public static boolean sum3(int A[], int n, int X) {
		
		Arrays.sort(A);
		
		for(int i = 0 ; i < n ; i++) {
			int l = 0;
			int r = n-1;
			while(l < r){
				if(A[i] + A[l] + A[r] == X) {
					if(l == i || r == i) {
						return false;
					}
					else {
						return true;
					}
					
				}
				else if(A[i] + A[l] + A[r] < X) {
					l++;
				}
				else{
					r--;
				}
			}
		}
		return false;
	}
	
	
	  public static boolean sum4(int A[], int n, int X) { 
		    
	       // Your code Here
	       
			int l; 
			int r;
	 
	        Arrays.sort(A);
	 
	        for (int i = 0; i < n - 2; i++) {
	            l = i + 1; 
	            r = n - 1; 
	            while (l < r) {
	                if (A[i] + A[l] + A[r] == X) {
	                    return true;
	                }
	                else if (A[i] + A[l] + A[r] < X)
	                    l++;
	 
	                else 
	                    r--;
	            }
	        }
	 
	        return false;
	    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1 ,1 ,2, 1 ,1, 4};
		System.out.println(sum3(arr , 6 , 10));

	}

}
