package linkedList;

public class CheckCircularLinkedList {
	
	boolean isCircular(Node head)
    {
	// Your code here
	Node fast = head;
	Node slow = head;
	
	while(fast != null && fast.next != null){
	    fast = fast.next.next;
	    slow = slow.next;
	    if(fast == slow){
	        return true;
	    }
	}
	
	return false;
	
    }

}
