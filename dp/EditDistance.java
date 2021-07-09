package dp;

public class EditDistance {
	
	int ed(String s, String t , int m , int n , int[][] dp) {
        if(m == -1) return n + 1;
        if(n == -1) return m + 1;
        
        if(dp[m][n] != -1) return dp[m][n];
        if(s.charAt(m) == t.charAt(n)) return ed(s , t , m - 1 , n - 1 , dp);
        
        int op1 = ed(s , t , m - 1 , n - 1 , dp);
        int op2 = ed(s , t , m , n - 1 , dp);
        int op3 = ed(s , t , m - 1 , n , dp);
        
        dp[m][n] = 1 + Math.min(op1 , Math.min(op2 , op3));
        return dp[m][n];
        
    }
    public int editDistance(String s, String t) {
        // Code here
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ; j++){
                dp[i][j] = -1;
            }
        }
        
        return ed(s , t , m - 1 , n - 1 , dp);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
