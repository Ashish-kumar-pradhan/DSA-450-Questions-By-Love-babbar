package dp;

public class LargestSquareFormedInMatrix {
	
	static int maxSquare(int n, int m, int mat[][]){
        
        int dp[][] = new int[n][m];
        int max = 0;
        for(int i = 0 ; i < m ; i++){
            dp[n-1][i] = mat[n-1][i];
        }
        for(int i = 0 ; i < n ; i++){
            dp[i][m-1] = mat[i][m-1];
        }
        
        for(int i = n - 2 ; i >= 0 ; i--){
            for(int j = m - 2 ; j >= 0 ; j--){
                if(mat[i][j] != 0){
                    dp[i][j] = 1 + Math.min(dp[i+1][j+1] , Math.min(dp[i+1][j] , dp[i][j+1]));
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){ 
                if(dp[i][j] > max){
                    max = dp[i][j];
                } 
            }
        }
        
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
