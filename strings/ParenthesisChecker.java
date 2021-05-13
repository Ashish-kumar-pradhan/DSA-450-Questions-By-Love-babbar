package strings;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
	
	 public static boolean ispar(String x){
		 Stack<Character> st = new Stack<>();
		 for(int i =0 ; i < x.length() ; i++) {
			 if( x.charAt(i) == '{' || x.charAt(i) == '(' || x.charAt(i) == '[') {
				 st.push(x.charAt(i));
			 }
			 else if( x.charAt(i) == '}') {
				 if(!st.isEmpty() && st.peek() == '{') {
					 st.pop();
				 }
				 else {
					 return false;
				 }
			 }
			 
			 else if( x.charAt(i) == ')') {
				 if(!st.isEmpty() && st.peek() == '(') {
					 st.pop();
				 }
				 else {
					 return false;
				 }
			 }
			 
			 else if( x.charAt(i) == ']') {
				 if(!st.isEmpty() && st.peek() == '[') {
					 st.pop();
				 }
				 else {
					 return false;
				 }
			 }
		 }
		 if(!st.isEmpty()) {
			 return false;
		 }
		 
		 return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String t[] = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			t[i] = s.next();
		}

		
		for(int i = 0 ; i < n ; i++) {
			if(ispar(t[i])) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}

//String S = "{([])}(";
//System.out.println(ispar(S));
