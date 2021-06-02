package stacksAndQueues;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	private static void insertAtBottom(Stack<Integer> S , int elem){
		
		if(S.isEmpty()) {
			S.push(elem) ;
			return;
		}
		
		int topElem = S.pop();
		insertAtBottom(S , elem);
		S.push(topElem);
	}
	
	public static void reverse(Stack<Integer> S){
		
		if(S.isEmpty()) {
			return ;
		}
		int top = S.pop();
		reverse(S);
		
		insertAtBottom(S , top);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<>();
		
		int i = 0;
		while(i < 10) {
			st.push(i+1);
			i++;
		}
		
		reverse(st);
		reverse(st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
