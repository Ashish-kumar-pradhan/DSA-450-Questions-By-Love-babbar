package stacksAndQueues;

import java.util.Stack;

public class NextGreaterElement {
	
	public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long rt[] = new long[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < n - 1 ; i++){
            st.push(i);
            
            while(!st.isEmpty() && arr[i+1] > arr[st.peek()]){
                rt[st.pop()] = arr[i + 1];
            }
            
        }
        
        while(!st.isEmpty()){
                rt[st.pop()] = -1;
            }
            
            rt[n-1] = -1;
            
        return rt;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
