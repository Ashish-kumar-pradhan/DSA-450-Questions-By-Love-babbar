package dp;

public class SubsetSumProblem {
	
	static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp = new boolean[N+1][sum+1];
        
        for(int i=0; i<=N; i++){
            dp[i][0] = true;
        }
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=sum; j++){
            
                if(arr[i-1] > j) {   
                    dp[i][j] = dp[i-1][j];
                }
                
                else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }        
        
        }
        return dp[N][sum];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
