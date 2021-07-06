package dp;

public class KnapsackProblem {
	
	static int knapSack(int W, int wt[], int val[], int n) 
    { 
         
         int[][] dp = new int[n + 1][W + 1];
         
         for(int i = 1 ; i <= n ; i++){
             for(int j = 1 ; j <= W ; j++){
                 int canPut = 0;
                 int oldWeight = 0;
                 if(wt[i-1] <= j){
                     canPut = val[i-1];
                     oldWeight = dp[i-1][j-wt[i-1]];
                 }
                 
                 dp[i][j] = Math.max(canPut + oldWeight , dp[i-1][j]);
            }
         }
         
         return dp[n][W];
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
