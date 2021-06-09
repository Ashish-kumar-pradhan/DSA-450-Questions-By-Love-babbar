package strings;

public class RemoveConsecutiveCharacters {
	
public static String removeConsecutiveCharacter(String S){
        
        String ans = "";
        char cur = '#';
        for(int i = 0 ; i < S.length() ; i ++) {
        	if(S.charAt(i) != cur) {
        		ans += S.charAt(i);
        		cur = S.charAt(i);
        	}
        }
        
        return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeConsecutiveCharacter("aabb"));

	}

}
