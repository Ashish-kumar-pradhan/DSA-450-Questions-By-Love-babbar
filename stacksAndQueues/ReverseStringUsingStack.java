package stacksAndQueues;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public String reverse(String S){
        //code here
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < S.length() ; i++){
            st.push(S.charAt(i));
        }
        
     StringBuffer sb = new StringBuffer();
      for(int i = 0 ; i < S.length() ; i++) {
         sb.append(st.pop());
      }
      String str = sb.toString();
      
      return str;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
