package dp;

public class LongestSubsequenceDifference1 {
	
	 static int longestSubsequence(int N, int A[])
	    {
	        
	        int dp[] = new int[N];
	        
	        for(int i = 1 ; i < N ; i++){
	            for(int j = 0 ; j < i ; j++){
	                if(Math.abs(A[i] - A[j]) == 1){
	                    dp[i] = Math.max(dp[i] , dp[j] + 1);
	                }
	            }
	        }
	        
	        int m = Integer.MIN_VALUE;
	        for(int i = 0 ; i < N ; i++){
	            if(m < dp[i]) m = dp[i];
	        }
	        
	        return m + 1 ;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
