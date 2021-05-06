package strings;

public class ReverseString {
	
	 public static void reverseString(char[] s) {
	        
	        for(int i = 0 ; i < s.length /2 ; i++){
	            char temp = s[i];
	            s[i] = s[s.length - i - 1];
	            s[s.length - i - 1] = temp;
	            System.out.println(temp +"  "+ s[i] +"  " + s[s.length - i - 1] );
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String input = "Ashish";
//		 byte[] strAsByteArray = input.getBytes();
//		 
//	     byte[] result = new byte[strAsByteArray.length];
//	 
//	     for (int i = 0; i < strAsByteArray.length; i++) {
//	         result[i] = strAsByteArray[strAsByteArray.length - i - 1];
//	        }
//	        
//	     System.out.println(new String(strAsByteArray));
//	     System.out.println(new String(result));
		
		char a[] = {'a' , 'e' , 'd' , 'f' , 'j' , 'n' };
		reverseString(a);
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i] + " ");
		}
	     
	}

}
