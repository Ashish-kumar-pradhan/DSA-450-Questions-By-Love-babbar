package dp;

public class MaximumPathSumInMatrix {
	
	static int maximumPath(int N, int Matrix[][])
    {
        int[][] dp = new int[N][N];
        for(int i = 0 ; i < N ; i++){
            dp[0][i] = Matrix[0][i];
           
        }
        for(int i = 1 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                
                 int op1 = 0;
                 int op2 = dp[i-1][j];
                 int op3 = 0;
                 
                 if(j > 0){
                     op1 = dp[i-1][j-1];
                 }
                 if(j < N-1){
                     op3 =dp[i-1][j + 1];
                 }
                 
                 dp[i][j] = Matrix[i][j] + Math.max(op1 , Math.max(op2 , op3));
            }
        }
        
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            if(max < dp[N-1][i]) max = dp[N-1][i];
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
