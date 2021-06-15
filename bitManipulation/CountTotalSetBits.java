package bitManipulation;

public class CountTotalSetBits {
	
	public static int countSetBits(int n){
	    
        // Your code here
        if(n == 0){
            return 0;
        }
        int x = (int)(Math.log(n) / Math.log(2));
        
        int px = (int)Math.pow(2 , x);
        
        return px*x/2 + (n - px + 1) + countSetBits(n - px);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
