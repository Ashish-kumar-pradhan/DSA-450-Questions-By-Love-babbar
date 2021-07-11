package dp;

public class LongestRepeatingSubsequence {
	
	public static int LongestRepeatingSubsequence(String s)
    {
        // code here
        int n = s.length();
        int storage[][] = new int[n+1][n+1];
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n ; j++ ) {
				if(s.charAt(n -i) == s.charAt(n - j) && j != i) {
					storage[i][j] = 1 + storage[i - 1][j -1];
				} else {
					storage[i][j] = Math.max(storage[i][j-1], storage[i-1][j]);
				}
			}
		} 
		
		return storage[n][n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
