package stacksAndQueues;

import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
	
	public Queue<Integer> revI(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
             
        return q;
    }
	
	public void revR(Queue<Integer> q){
		if(q.isEmpty()) {
			return;
		}
		int elem = q.remove();
		revR(q);
		q.add(elem);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
