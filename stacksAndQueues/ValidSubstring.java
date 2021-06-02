package stacksAndQueues;

import java.util.Stack;

public class ValidSubstring {
	
	static int findMaxLen(String S) {
	
		Stack<Character> st = new Stack<>();
	    Stack<Integer> stI = new Stack<>();
	    int ans = 0;
	    int te = 0;
	    
	    for(int i = 0 ; i < S.length() ; i++){
	        if(S.charAt(i) == '('){
	            st.push(S.charAt(i));
	            stI.push(i);
	        }
	        
	        else if(S.charAt(i) == ')'){
	            if(!st.isEmpty() && st.peek() == '('){
	                st.pop();
	                stI.pop();
	                te = te + 2;
	            }
	            else{
	                 te = 0;
	            }
	        }
	        
	        if(st.isEmpty() && ans < te){
	                    ans = te;
	                }
	    }
	    
	    
	    int temp = S.length() - 1;
	    if(S.charAt(S.length() - 1) == ')'){
	        temp += 1;
	    }
	    
	    while(!stI.isEmpty()){
	        int top = stI.pop();
	        if(ans < temp-top-1){
	            ans = temp-top-1;
	        }
	        temp = top;
	    }
	    
	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
