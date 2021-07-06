package dp;

public class CoinChange {
	
	public static long countR(int S[], int m, int n) {
		if(n < 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		long count = 0; 
		for(int i = 0 ; i < m ; i++) {
			count += countR(S , m , n - S[i]);
		}
		return count;
	}
	
	public static long countDP(int S[], int m, int n) 
    { 
  
        long dp[] = new long[n + 1];
        dp[0] = 1;
        
        for(int j = 0 ; j < m ; j++ ){
            for(int i = S[j] ; i <= n ; i++){
                int ind = i - S[j];
                if(ind >= 0){
                    dp[i] += dp[ind];
                }
            }
        }
        
        return dp[n];
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S[] ={1,2,3};
		System.out.println(countR(S , 3 , 4));

	}

}
