package bitManipulation;

public class PowerOf2 {
	
	public static boolean isPowerofTwo(long n){
	        
        // Your code here
        int x = (int)(Math.log(n) / Math.log(2));
        long v = (long)(Math.pow(2 , x));
        if( n == 0 || n != v ) return false;
        else return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
