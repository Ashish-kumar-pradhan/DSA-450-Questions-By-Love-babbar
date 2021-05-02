package strings;

public class PalindromeString {
	
	public static int isPalindrome(String S) {
     
		byte[] array = S.getBytes();
	    int ans = 1 ;
	 
	     for (int i = 0; i < array.length/2; i++) {
	          if(array[i] != array[array.length - i - 1]) {
	          ans = 0;
	          break;
	          }
	        
	     }
	     
	     return ans ;
 
	}

	public static void main(String[] args) {
		
		String a = "ashish";
		System.out.println(isPalindrome(a));
		

	}

}
