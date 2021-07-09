package dp;

public class FriendsPairingProblem {
	
	public static int countFriendsPairingsR(int n) 
    {
		if(n == 1 || n == 2) {
			return n;
		}
		
		return countFriendsPairingsR(n-1) + (n-1)*countFriendsPairingsR(n-2);
		
    }
	
	public static long countFriendsPairingsMHelper(int n , long dp[]) 
    {
		if(n == 0 ||n == 1 || n == 2) {
			dp[n] = n;
			return dp[n];
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		
		dp[n] = (countFriendsPairingsMHelper(n-1 , dp) + (n-1)*countFriendsPairingsMHelper(n-2, dp))%1000000007;
		return dp[n];
		
    }
	
	public static long countFriendsPairingsM(int n) {
		long dp[] = new long[n + 1];
		return countFriendsPairingsMHelper(n , dp);
    }
	
	public static long countFriendsPairingsDP(int n) {
		long dp[] = new long[n + 1];
		dp[0] = 1;
		dp[0] = 1;
		
		for(int i = 2 ; i <= n ; i++) {
			dp[i] = (dp[i-1] + (i-1)*dp[i - 2])%1000000007;
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countFriendsPairingsDP(5));

	}

}
