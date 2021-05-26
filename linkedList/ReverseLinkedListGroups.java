package linkedList;

import java.util.Scanner;

public class ReverseLinkedListGroups {
	
	public static Node<Integer> takeInput(){
		Node <Integer> head = null , tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			} else {
				
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {

		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	 public static Node<Integer> reverseR(Node<Integer> head, int k)
	    {
	       
	        int i = 0;
	        Node<Integer> nxt = null;
	        Node<Integer> pre = null;
	        Node<Integer> cur = head;
	        while(i < k && cur != null){
	             nxt = cur.next;
	             cur.next = pre;
	             pre = cur;
	             cur = nxt;
	            i++;
	        }
	        if(nxt != null){
	            head.next = reverseR(nxt , k);
	        }
	        
	        
	        return pre;
	    }
	
//	 public static Node<Integer> reverseI(Node<Integer> head, int k)
//	    {
//	        //Your code here
//	        Node<Integer> temp = head;
//	        int size = 0;
//	        while(temp != null){
//	            temp = temp.next;
//	            size++;
//	        }
//	        // System.out.println(size);
//	        int r = (size-1)/k + 1;
//	        int i = 0;
//	        Node<Integer> pre = head;
//	        Node<Integer> cur = head;
//	        Node<Integer> some = head;
//	        while (i != r){
//	            int j = k-1;
//	            Node<Integer> end = pre;
//	            pre = cur;
//	            cur = cur.next;
//	            while(j != 0 && cur != null){
//	                 Node<Integer> nxt = cur.next;
//	                 cur.next = pre;
//	                 pre = cur;
//	                 cur = nxt;
//	                j--;
//	            }
//	            if (i == 0){
//	                head = pre;
//	            }
//	            else{
//	            	System.out.println(end.data +" "+);
//	            	end.next = pre;
//	            }
//	            
//	            some = end;
//	            i++;
//	        }
//
//	        System.out.println(pre.data +" "+ some.data);
//	        System.out.println(head.data + " " + head.next.next.data);
//	        
//	        return head;
//	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		head = reverseR(head , 4);
		print(head);

	}

}
