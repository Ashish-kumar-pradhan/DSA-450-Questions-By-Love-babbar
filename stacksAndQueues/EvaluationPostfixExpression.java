package stacksAndQueues;

import java.util.Stack;

public class EvaluationPostfixExpression {
	
	public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i) == '+'){
                int first = st.pop();
                int second = st.pop();
                ans = second + first;
                st.push(ans);
            }
            else if(S.charAt(i) == '-'){
                int first = st.pop();
                int second = st.pop();
                ans = second - first;
                st.push(ans);
            }
            
             else if(S.charAt(i) == '*'){
                int first = st.pop();
                int second = st.pop();
                ans = second*first;
                st.push(ans);
            }
            
             else if(S.charAt(i) == '/'){
                int first = st.pop();
                int second = st.pop();
                ans = second/first;
                st.push(ans);
            }
            else {
                 ans = S.charAt(i) - '0';
                st.push(ans);
            }
        }
        
        return st.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
