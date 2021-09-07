package dp;

public class LongestPalindromeSubString {
	
	static String longestPalin(String S){
        // code here
        
        int n = S.length();
        int dp[][] = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = 1;
        }
        int max = 1;
        int maxS = 0;
        int maxE = 0;
        for(int i = 1 ; i < n ; i++){
            if(S.charAt(i-1) == S.charAt(i)){
                dp[i-1][i] = 2;
            }
            if(max < dp[i-1][i]) {
                max = dp[i-1][i];
                maxS = i-1;
                maxE = i;
            }
            
        }
        for(int i = 2 ; i < n ; i++){
            for(int j = 0 ; j + i < n ; j++){
                if(S.charAt(j) == S.charAt(i+j) && dp[j+1][i+j-1] != 0){
                    dp[j][i+j] = 2 + dp[j+1][i+j-1];
                }
                
                if(max < dp[j][i+j]) {
                    max = dp[j][i+j];
                    maxS = j;
                    maxE = i+j;
                }
            }
        }
        return S.substring(maxS , maxE + 1);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
