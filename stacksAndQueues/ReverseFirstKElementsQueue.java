package stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
	
	 public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
	    {
	      //add code here.
	      Queue<Integer> q1 = new LinkedList<>();
	      Stack<Integer> s1 = new Stack<>();
	      
	      int len = q.size() - k;
	      
	      while(q.size() > len){
	          s1.push(q.remove());
	      }
	      
	      while(q.size() > 0){
	          q1.add(q.remove());
	      }
	      
	      while(s1.size() > 0){
	          q.add(s1.pop());
	      }
	      
	      while(q1.size() > 0){
	          q.add(q1.remove());
	      }
	      
	      return q;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
