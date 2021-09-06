package dp;

public class KnapsackWithDuplicateItems {
	
	static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        int dp[] = new int[w+1];
        for(int i = 1 ; i <= w ; i++){
            int max = 0;
            for(int j = 0 ; j < n ; j++){
                int temp = 0; 
                if(i >= wt[j]){
                    temp = dp[i - wt[j]] + val[j]; 
                }
                if(temp > max) max = temp;
            }
            dp[i] = max;
        }
        
        
        return dp[w];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
