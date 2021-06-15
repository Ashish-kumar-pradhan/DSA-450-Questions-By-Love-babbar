package bitManipulation;

public class NonRepeatingNumbers {
	
	 public int[] singleNumber(int[] nums)
	    {
	        // Code here
	        int arr[] = new int[2];
	        int XxorY = 0;
	        for(int i : nums){
	            XxorY ^= i;
	        }
	        
	        int rsbm =  XxorY & -XxorY;
	        
	        int x = 0;
	        int y = 0;
	        
	        for(int i : nums){
	            if((rsbm & i) == 0){
	                x ^= i; 
	            }
	            else {
	                y ^= i;
	            }
	        }
	        if(x > y){
	            arr[0] = y;
	            arr[1] = x;
	        }
	        else{
	            arr[1] = y;
	            arr[0] = x;
	        }
	        
	        return arr;
	        
	    }

}
