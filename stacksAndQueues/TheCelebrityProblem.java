package stacksAndQueues;

import java.util.Stack;

public class TheCelebrityProblem {
	
	int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	for(int i = 0 ; i < n ; i++){
    	    st.push(i);
    	}
    	
    	int ans = 0;
    	
    	while(st.size() > 1){
    	    int first = st.pop();
    	    int second = st.pop();
    	    
    	    if(M[first][second] == 0){
    	    ans = first;
    	    st.push(first);
    	    }
    	    
    	    else if(M[first][second] == 1){
    	    ans = second;
    	    st.push(second);
    	    }
    	}
    	
    	for(int i = 0 ; i < n ; i++){
    	    if(M[ans][i] == 1 || M[i][ans] == 0){
    	        if(ans != i){
    	             return -1;
    	        }
    	    }
    	}
    	
    	return ans;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
