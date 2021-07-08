package dp;

public class PartitionEqualSubsetSum {
	
	static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return 0;
        }
        
        sum = sum/2;
        
        int[][] dp = new int[N+1][sum+1];
        
        for(int i=1; i<=N; i++)
        for(int j=1; j<=sum; j++)
        {
            
            if(arr[i-1] > j) {   
                dp[i][j] = dp[i-1][j];
            }
            else if(arr[i-1]==j){
                dp[i][j] = 1;
            }
            else{
                dp[i][j] = (dp[i-1][j] | dp[i-1][j-arr[i-1]]);
            }
        }        
        return dp[N][sum];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
