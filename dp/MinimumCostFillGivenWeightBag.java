package dp;

public class MinimumCostFillGivenWeightBag {
	
	public int minimumCost(int cost[], int n,int w)
	{
		// Your code goes here
    	int dp[][] = new int[n+1][w+1];
    
    	for(int i=0;i<=w;i++){
    	       dp[0][i]=1000000;
    	}
    
    	for(int i=1;i<=n;i++){
    	  for(int j=1;j<=w;j++){
             if(i>j||cost[i-1]==-1){
    	           dp[i][j]=dp[i-1][j];
    	     }
    
	         else{
	            dp[i][j]= Math.min(cost[i-1]+dp[i][j-i],dp[i-1][j]);
	         }
    	  }
    	}
    	   return dp[n][w]>=1000000?-1:dp[n][w];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
