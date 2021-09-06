package dp;

public class LongestCommonSubstring {
	
	int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        int dp[][] = new int[n+1][m+1];
        int max = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                if(dp[i][j] > max) max = dp[i][j];
            }
        }
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
