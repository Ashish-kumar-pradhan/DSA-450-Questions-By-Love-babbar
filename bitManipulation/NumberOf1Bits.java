package bitManipulation;

public class NumberOf1Bits {
	
	static int setBits(int N) {
        // code here
        int res=0;
        while (N>0){
        	System.out.println(N);
            N= N&(N-1);
            res++;
        }
        return res;
    }
	
	public static void main(String[] args) {
		int n = 10;
		int ans = setBits(n);
		System.out.println(ans);
	}

}
