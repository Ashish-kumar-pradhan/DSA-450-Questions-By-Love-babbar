package dp;

public class PaintingTheFence {
	
	 long countWays(int n,int k)
	    {
	        
	        long K = (long)k;
	        if(n == 1){
	            return K;
	        }
	        long big = 1000000007;
	        long same = K;
	        long dif = K*(K-1);
	        long total = same + dif;
	        
	        
	        for(int i = 3 ; i <= n ; i++){
	          same = dif;
	          dif = ((K-1)*total)%big;
	          total = (same + dif)%big;
	        }
	        
	        return total;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
