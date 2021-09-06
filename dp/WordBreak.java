package dp;

import java.util.ArrayList;

public class WordBreak {
	
	 public static boolean wb(String A, ArrayList<String> B){
	        for(int i = 0 ; i < B.size() ; i++){
	            if(B.get(i).equals(A)) return true;
	        }
	        return false;
	    }
	    public static int wordBreak(String A, ArrayList<String> B )
	    {
	        //code here
	        int n = A.length();
	        int dp[] = new int[n+1];
	        dp[0] = 1;
	        for(int i = 1 ; i <= n ; i++){
	            for(int j = 0 ; j < i ; j++){
	                if(wb(A.substring(j , i) , B)){
	                    dp[i] += dp[j];
	                }
	            }
	        }
	        
	        if(dp[n] == 0) return 0;
	        
	        return 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
