package heap;

public class MergeKSortedLL {
	
	Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < K ; i++){
            Node temp = arr[i];
            while(temp != null){
                pq.add(temp.data);
                temp = temp.next;
            }
                
        }
        int n = pq.size();
        
        Node head = new Node(pq.remove());
        Node pre = head;
        
        for(int i = 1 ; i < n ; i++){
            Node cur = new Node(pq.remove());
            pre.next = cur;
            pre = cur;
        }
        return head;
        
    }

}
