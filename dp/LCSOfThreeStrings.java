package dp;

public class LCSOfThreeStrings {
	
	 static int lcsM(String A, String B, String C, int n1, int n2, int n3 , int[][][] dp)
	    {
	        
	        if(dp[n1][n2][n3] != -1){
	            return dp[n1][n2][n3];
	        }
	        if(A.charAt(n1-1) == B.charAt(n2-1) && A.charAt(n1-1) == C.charAt(n3-1)){
	          dp[n1][n2][n3] = 1 + lcsM(A , B , C , n1 - 1 , n2 - 1 , n3 - 1 , dp); 
	          return dp[n1][n2][n3];
	        }
	        else {
	            int op1 = lcsM(A , B , C , n1 - 1 , n2 , n3 , dp) ;
	            int op2 = lcsM(A , B , C , n1 , n2 - 1 , n3 , dp) ;
	            int op3 = lcsM(A , B , C , n1 , n2 , n3 - 1 , dp) ;
	    
	            dp[n1][n2][n3] = Math.max(op1 , Math.max(op2 , op3));
	            return dp[n1][n2][n3];
	        }
	        
	    }

	 
	    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
	    { 
	        // code here
	        int dp[][][] = new int[n1 + 1][n2 + 1][n3 + 1];
	        for(int i = 1; i <= n1 ; i++) {
	            for(int j = 1; j <= n2 ; j++ ) {
	                for(int k = 1; k <= n3 ; k++ ) {
	                    dp[i][j][k] = -1;
	                }
	            }
	        }
	        
			return lcsM(A , B , C , n1 , n2 , n3 , dp) ;
	    }
	    
	    int LCSof3DP(String A, String B, String C, int n1, int n2, int n3) 
	    {
	        int dp[][][] = new int[n1+1][n2+1][n3+1];
			
			for(int i = 1; i <= n1 ; i++) {
				for(int j = 1; j <= n2 ; j++ ) {
		        	for(int k = 1; k <= n3 ; k++ ) {
			    	 	if(A.charAt(n1 - i) == B.charAt(n2 - j) && A.charAt(n1 - i) == C.charAt(n3 - k)) {
						dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
	    				} else {
	    					dp[i][j][k] = Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k],dp[i][j][k-1]));
	    				}   
				    }
				}
			} 
			
			return dp[n1][n2][n3]; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
