package dp;

public class NCr {
	
	static int nCr(int n, int r)
    {
        
        if(r > n){
            return 0;
        }
       r = Math.min(n-r , r);
       int dp[] = new int[r + 1];
       dp[0] = 1;
       for(int i = 1 ; i <= n ; i++){
           int endIndex = Math.min(i , r);
           for(int j = endIndex ; j > 0 ; j--){
              dp[j] = (dp[j] + dp[j - 1])%1000000007;
           }
       }
       
       return dp[r];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
