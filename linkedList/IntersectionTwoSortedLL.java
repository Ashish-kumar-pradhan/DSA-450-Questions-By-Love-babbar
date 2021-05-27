package linkedList;

public class IntersectionTwoSortedLL {
	
	public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        
        Node L1 = head1;
        Node L2 = head2;
        
        Node head = null;
        Node temp = null;
        int i = 0;
        while(L1 != null && L2 != null){
             Node tp = null;
            if(L1.data == L2.data){
               tp = new Node(L1.data);
               tp.next = null;
               if(i==0){
                   head = tp;
                   temp = tp;
               }
               else{
                   temp.next = tp;
                   temp = tp;
               }
               L1 = L1.next;
               L2 = L2.next;
               i++;
            }
            else if(L1.data < L2.data){
                L1 = L1.next;
            }
            else{
                L2 = L2.next;
            }
            
        }
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
