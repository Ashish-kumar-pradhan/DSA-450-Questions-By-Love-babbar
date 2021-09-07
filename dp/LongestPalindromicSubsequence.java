package dp;

public class LongestPalindromicSubsequence {
	
	public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        int dp[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = 1;
        }
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j + i < n ; j++){
                if(S.charAt(j) == S.charAt(i+j)){
                    dp[j][i+j] = dp[j+1][i+j-1] + 2;
                }
                else {
                    dp[j][i+j] = Math.max(dp[j+1][i+j] , dp[j][i+j-1]);
                }
            }
        }
        return dp[0][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
