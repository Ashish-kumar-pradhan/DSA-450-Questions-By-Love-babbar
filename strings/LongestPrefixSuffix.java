package strings;

public class LongestPrefixSuffix {
	
	public static int lps1(String s) {
		
		int n = s.length();
		
		for(int i = 1 ; i < n ; i++) {
			if(s.substring(0, n - i).equals(s.substring(i , n))) {
				return n - i;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "aaaa";
		System.out.println(lps1(S));

	}

}
