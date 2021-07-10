package dp;

public class MaximizeTheCutSegments {
	
	int maximizeCutsM(int n, int x, int y, int z , int[] dp){
        if(n == 0 || n == 9999) return 0;
        if(dp[n] != -1) return dp[n];
       
       int op1 = Integer.MIN_VALUE;
       int op2 = Integer.MIN_VALUE;
       int op3 = Integer.MIN_VALUE;
       
       if(n >= x){
           op1 = maximizeCutsM(n - x , x, y, z , dp);
       }
       
       if(n >= y){
           op2 = maximizeCutsM(n - y , x, y, z , dp);
       }
       
       if(n >= z){
           op3 = maximizeCutsM(n - z , x, y, z , dp);
       }
       
       dp[n] = 1 + Math.max(op1 , Math.max(op2 , op3));
       return dp[n];
    }
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
       int dp[] = new int[n + 1];
       for(int i = 1 ; i <= n ; i++ ){
           dp[i] = -1;
       }
       int a = maximizeCutsM(n , x, y, z , dp);
       if(a < 0) return 0;
       return a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
