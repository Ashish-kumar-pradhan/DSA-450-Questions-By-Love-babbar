package dp;

public class LCS {
	
	 static int lcsDP(int m, int n, String s, String t)
	    {
	        // your code here
	        int storage[][] = new int[m+1][n+1];
			
			for(int i = 1; i <= m ; i++) {
				for(int j = 1; j <= n ; j++ ) {
					if(s.charAt(m -i) == t.charAt(n - j)) {
						storage[i][j] = 1 + storage[i - 1][j -1];
					} else {
						storage[i][j] = Math.max(storage[i][j-1], storage[i-1][j]);
					}
				}
			} 
			
			return storage[m][n];
	    }


	 static int lcsM(int m, int n, String s, String t , int[][] dp)
	    {
	        if(m == 0 || n == 0){
	            return 0;
	        }
	        if(dp[m][n] != -1){
	            return dp[m][n];
	        }
	        if(s.charAt(m-1) == t.charAt(n-1)){
	          dp[m][n] = 1 + lcsM( m - 1 , n - 1 , s, t , dp); 
	          return dp[m][n];
	        }
	        else {
	            int op1 = lcsM( m - 1 , n , s, t , dp);
	            int op2 = lcsM( m , n - 1 , s, t , dp);
	        
	            dp[m][n] = Math.max(op1 , op2);
	            return dp[m][n];
	        }
	        
	    }

	 static int lcsMEMO(int m, int n, String s, String t)
	    {
	        // your code here
	        int dp[][] = new int[m + 1][n + 1];
	        for(int i = 1; i <= m ; i++) {
	            for(int j = 1; j <= n ; j++ ) {
	                dp[i][j] = -1;
	            }
	        }
	        
			return lcsM( m , n , s, t , dp) ;
	    }

	static int lcsR(int m, int n, String s, String t )
	    {
	        if(m == 0 || n == 0){
	            return 0;
	        }
	        if(s.charAt(m-1) == t.charAt(n-1)){
	          return 1 + lcsR( m - 1 , n - 1 , s, t ); 
	        }
	        else {
	            int op1 = lcsR( m - 1 , n , s, t );
	            int op2 = lcsR( m , n - 1 , s, t );
	        
	            return Math.max(op1 , op2);
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
