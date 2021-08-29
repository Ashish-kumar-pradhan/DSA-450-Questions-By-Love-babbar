package dp;

import java.util.Arrays;

public class PairsWithSpecificDifference {
	
	public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 
        Arrays.sort(arr);
        
        int dp[] = new int[N + 1];
        for(int i = 1 ; i < N ; i++){
            if(arr[i] - arr[i-1] < K){
                dp[i + 1] = Math.max(dp[i - 1] + arr[i] + arr[i-1], dp[i]);
            }
            else {
                dp[i + 1] = dp[i];
            }
        }
        
        return dp[N];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
