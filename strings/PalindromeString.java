package strings;

public class PalindromeString {
	
	public static int isPalindrome(String S) {
     
	    int ans = 1 ;
	 
	     for (int i = 0; i < S.length()/2; i++) {
	          if(S.charAt(i) != S.charAt(S.length()-i-1)) {
	          ans = 0;
	          break;
	          }
	        
	     }
	     
	     return ans ;
 
	}

	public static void main(String[] args) {
		
		String a = "ashhsa";
		System.out.println(isPalindrome(a));
		

	}

}
