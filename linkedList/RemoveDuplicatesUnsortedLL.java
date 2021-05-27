package linkedList;

import java.util.HashMap;

public class RemoveDuplicatesUnsortedLL {
	
	 public Node<Integer> removeDuplicates(Node<Integer> head) 
	    {
	         // Your code here
	        HashMap<Integer , Integer> hp = new HashMap<Integer , Integer>();
	        Node<Integer> temp = head;
		    while(temp != null && temp.next != null){
		    	if(temp.data == temp.next.data){
			        temp.next = temp.next.next;
			        
			    }
		    	if(hp.containsKey(temp.data)){
		    	    temp.next = temp.next.next;
		    	}
		    	else{
		    	    hp.put(temp.data , 1);
		    	    temp = temp.next;
		    	}
		   
		}
		
		return head;
		
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
