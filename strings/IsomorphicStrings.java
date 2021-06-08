package strings;

import java.util.HashMap;

public class IsomorphicStrings {
	
	
	 public static boolean areIsomorphic(String str1,String str2)
	    {
	        // Your code here
	        
	        if(str1.length() != str2.length()){
	            return false;
	        }
	        
	        HashMap<Character,Character> m1 = new HashMap<>();
	        HashMap<Character ,Character> m2 = new HashMap<>();
	        
	        
	        for(int i = 0 ; i < str1.length() ; i++ ){
	            
	            if(m1.containsKey(str1.charAt(i)) && m1.get(str1.charAt(i)) != str2.charAt(i)){
	                return false;
	            }
	            
	            if(m2.containsKey(str2.charAt(i)) && m2.get(str2.charAt(i)) != str1.charAt(i)){
	                return false;
	            }
	            
	            m1.put(str1.charAt(i) , str2.charAt(i)); 
	            m2.put(str2.charAt(i) , str1.charAt(i)); 
	        }
	        
	        return true;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areIsomorphic("aabb" , "xxyx"));

	}

}
