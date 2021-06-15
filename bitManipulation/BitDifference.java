package bitManipulation;

public class BitDifference {
	
	public static int countBitsFlip(int a, int b){
	        
	        // Your code here
	        int AxorB = a^b;
	        int i = 0;
	        while(AxorB > 0){
	            AxorB =AxorB & (AxorB - 1);
	            i++;
	        }
	        return i;
	        
	    }

}
