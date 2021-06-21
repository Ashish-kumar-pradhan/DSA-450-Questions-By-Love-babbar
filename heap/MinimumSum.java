package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class MinimumSum {
	
	String solve(int[] arr, int n) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : arr){
            pq.add(i);
        }
        Stack<Integer> st = new Stack<>();
        int carry = 0;
        while(!pq.isEmpty()){
            int fir = pq.remove();
            int sec ;
            if(!pq.isEmpty()){
                sec = pq.remove();
            }else{
                sec = 0;
            }
            int rem = (fir + sec + carry)%10;
            carry = (fir + sec + carry)/10;
            st.push(rem);
        }
        st.push(carry);
        boolean checkZero = true;
        String ans = "";
        while(!st.isEmpty()){
            if(st.peek() == 0 && checkZero){
                 st.pop();
            }else{
                ans = ans + st.pop();
                checkZero = false;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
