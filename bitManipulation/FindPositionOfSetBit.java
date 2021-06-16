package bitManipulation;

public class FindPositionOfSetBit {
	
	static int findPosition(int n) {
        // code here
        int x = (int)(Math.log(n) / Math.log(2));
        long v = (long)(Math.pow(2 , x));
        if( n == 0 || n != v ) return -1;
        else return x + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
