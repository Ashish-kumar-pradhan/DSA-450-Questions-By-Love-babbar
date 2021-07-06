package dp;

public class CoinChange {
	
	public static long countR(int S[], int m, int n) {
		return countRHelp(S , m , n , 0);
	}
	
	public static long countRHelp(int S[], int m, int n , int pastCoinIndex) {
		if(n < 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		long count = 0; 
		for(int i = pastCoinIndex ; i < m ; i++) {
			count += countRHelp(S , m , n - S[i] , i);
		}
		return count;
	}
	
	public static long countM(int S[], int m, int n) {
		long memo[] = new long[n + 1];
		memo[0] = 1;
		for(int i = 1 ; i <= n ; i++) {
			memo[i] = -1;
		}
		return countMHelp(S , m , n , 0 , memo);
	}
	
	public static long countMHelp(int S[], int m, int n , int pastCoinIndex , long[] memo) {
		if(n < 0) {
			return 0;
		}
		
		long count = 0;
		for(int i = pastCoinIndex ; i < m ; i++) {
			if(n >= S[i] && memo[n - S[i]] != -1) {
				count += memo[n - S[i]];
			}
			else {
				count += countMHelp(S , m , n - S[i] , i , memo);
			}
			
		}
		memo[n] = count;
		return memo[n];
		
		
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
		System.out.println(countM(S , 3 , 4));

	}

}
