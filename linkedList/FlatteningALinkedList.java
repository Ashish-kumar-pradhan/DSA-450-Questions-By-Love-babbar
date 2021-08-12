package linkedList;

import java.util.ArrayList;

public class FlatteningALinkedList {

	
	void sort(ArrayList<Node> arr , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
               if(arr.get(j).data > arr.get(j + 1).data){
                   Node temp = arr.get(j);
                   arr.set(j , arr.get(j+1));
                   arr.set(j + 1 , temp);
               }
            }
        }
    }
    Node flatten(Node root)
    {
	// Your code here
    	
      // Sorting the top linked list 
        ArrayList<Node> arr = new ArrayList<Node>();
        Node temp = root;
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int n = arr.size();
        sort(arr , n);
        root = arr.get(0);
        temp = root;
        for(int i = 1 ; i < n ; i++){
            temp.next = arr.get(i);
            temp = temp.next;
        }
        temp.next = null;
        
        
    //   Main Code 
        
        Node cur = root;
        Node crN = root;
        Node crB = root;
       
        while(cur != null){
            crN = cur;
            crB = cur;
            while(crB.bottom != null){
                Node trav = crB.bottom;
                crB.bottom = crB.bottom.bottom;
                trav.bottom = null;
               
                
                while(crN.next != null && crN.next.data < trav.data){
                    crN = crN.next;
               }
               if(crN.next != null){
                  trav.next = crN.next; 
               }
               crN.next = trav;
            }
           
            cur = cur.next;
        }
        
        // Changing next pointer to bottom
        
        Node temp1 = root;
        while(temp1 != null){
          temp1.bottom = temp1.next;
          temp1 = temp1.next;
        }
        
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
