package dp;

public class MinimumPointsToReachDestination {
	
	public int minPoints(int points[][],int M,int N) 
	{ 
	    // Your code goes here
	    int dp[][] = new int[M+1][N+1];

	    for(int i = 0; i < M - 1 ; i++){
	        dp[i][N] = -100000000;
	    }
	    
	    for(int i = 0 ; i < N - 1 ; i++){
	        dp[M][i] = -100000000;
	    }
	    
	    for(int i = M - 1 ; i >= 0 ; i--){
	        for(int j = N - 1 ; j >= 0 ; j--){
	            dp[i][j] = points[i][j] + Math.max(dp[i+1][j] , dp[i][j+1]);
	            if(dp[i][j] > 0) {
	                dp[i][j] = 0;
	            }
	        }
	    }
	    
	    
	    return 1 + Math.abs(dp[0][0]);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
