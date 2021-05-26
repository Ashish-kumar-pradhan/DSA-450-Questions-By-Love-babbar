package dp;

public class CoinChange {
	
	public static long count(int S[], int m, int n) { 
	      int dp[] = new int[n+1];
	      dp[0] = 1;
	      for (int i = 1 ; i <= n ; i++) {
	    	  dp[i] = 0;
	      } 
	      
	      for (int j = 1 ; j < m ; j++) {
	    	  for (int i = j ; i <= n ; i++) {
	    		  if(S[j] == i) {
	    			  dp[i] = dp[i] + 1;
	    		  }
	    		  else if (S[j] > i) {
	    		  }
	    		  else {
	    			  dp[i] = dp[i] + dp[i - j];
	    		  }
	    		  System.out.print(dp[i] + " ");
	    	  }
	    	  System.out.println();
	      }
	      return dp[n];
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S[] ={1,2,5};
		System.out.println(count(S , 3 , 5));

	}

}
