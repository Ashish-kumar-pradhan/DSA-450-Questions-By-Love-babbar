package strings;

public class IsTwoStringAreCircular {
	
	public static boolean is(String str1 , String str2) {
		
		  return (str1.length() == str2.length()) && 
	               ((str1 + str1).indexOf(str2) != -1); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdefg";
		String s2 = "fgabcde";
		
		System.out.println(is(s1 , s2));

	}

}
