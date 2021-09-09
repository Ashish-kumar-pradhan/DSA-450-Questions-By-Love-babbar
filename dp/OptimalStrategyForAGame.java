package dp;

public class OptimalStrategyForAGame {
	
	
	static long countMaximum(int arr[], int n)
    {
        // Your code here
        long dp[][] = new long[n][n];
        dp[0][0] = (long)arr[0];
        for(int i = 1 ; i < n ; i++){
            dp[i][i] = (long)arr[i];
            if(arr[i-1] > arr[i]) {
                dp[i-1][i] = (long)arr[i-1];
            }
            else {
                dp[i-1][i] = (long)arr[i];
            }
        }
        for(int i = 2 ; i < n ; i++){
            for(int j = 0 ; i + j < n ; j++){
                long op1 = (long)arr[i+j] + Math.min(dp[j+1][i+j-1] , dp[j][i+j-2]);
                long op2 = (long)arr[j] + Math.min(dp[j+1][i+j-1] , dp[j+2][i+j]);
                dp[j][i+j] = Math.max(op1 , op2);
            }
        }
        
        return dp[0][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
