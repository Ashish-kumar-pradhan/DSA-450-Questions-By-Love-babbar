package linkedList;

public class RemoveDuplicatesSortedLL {
	
	public Node<Integer> removeDuplicates(Node<Integer> head)
    {
	// Your code here
	Node<Integer> temp = head;
	while(temp != null && temp.next != null){
	    if(temp.data == temp.next.data){
	        temp.next = temp.next.next;
	        
	    }
	    else{
	         temp = temp.next;
	    }
	   
	}
	
	return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
