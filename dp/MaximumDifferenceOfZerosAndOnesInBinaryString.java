package dp;

public class MaximumDifferenceOfZerosAndOnesInBinaryString {
	
	  int maxSubstring(String S) {
	        int n = S.length();
	        int dp[] = new int[n + 1];
	        dp[0] = 0;
	        for(int i = 0 ; i < n ; i++){
	            if(S.charAt(i) == '0'){
	                if(dp[i] > 0){
	                    dp[i+1] = dp[i] + 1;
	                }
	                else{
	                    dp[i+1] = 1;
	                }
	            }
	            else{
	                dp[i+1] = dp[i] - 1;
	            }
	        }
	        int max = Integer.MIN_VALUE;
	        for(int i = 1 ; i <= n ; i++){
	            if(max < dp[i]) max = dp[i];
	        }
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
