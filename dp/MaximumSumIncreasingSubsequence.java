package dp;

public class MaximumSumIncreasingSubsequence {
	
	public int maxSumIS(int arr[], int n)  
	{  
	    
	    int dp[] = new int[n];
	    dp[0] = arr[0];
	    for(int i = 1 ; i < n ; i++){
	        int maxSum = 0;
	        for(int j = 0 ; j < i ; j++){
	             if(arr[i] > arr[j] && maxSum < dp[j]){
	                maxSum = dp[j]; 
	             } 
	        }
	        dp[i] = maxSum + arr[i];
	    }
	    int max = 0;
	    for(int i = 0 ; i < n ; i++){
	        if(max < dp[i]) {
	            max = dp[i];
	        }
	    }
	    
	    return max;
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
