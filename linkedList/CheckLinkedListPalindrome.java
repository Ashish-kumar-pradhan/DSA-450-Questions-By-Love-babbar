package linkedList;

public class CheckLinkedListPalindrome {
	
	boolean isPalindrome(Node head) 
    {
        //Your code here
        
        Node temp = head;
        int i = 0;
        while(temp != null){
            temp =temp.next;
            i++;
        }
        if(i == 1){
            return true;
        }
        
        if(i == 2 ){
            return head.data == head.next.data;
        }
        
        if(i == 3 ){
            return head.data == head.next.next.data;
        }
        int j = i / 2;
        Node pre = head;
        Node cur = pre.next;
        
        while(j > 1 ){
            Node nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
            j--;
        }
        head.next = null;
        head = pre;
        
        if(i%2!=0){
            cur = cur.next;
        }
        
        while(cur != null && head != null){
            if(head.data != cur.data ){
                return false;
            }
            
            head = head.next;
            cur = cur.next;
        }
        
        return true;
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
