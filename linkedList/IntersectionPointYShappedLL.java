package linkedList;

public class IntersectionPointYShappedLL {
	
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         
         int i = 0;
         int j = 0;
         
         Node temp1 = head1;
         Node temp2 = head2;
         
        while(temp1 != null){
             temp1 = temp1.next;
             i++;
         }
         
         while(temp2 != null){
             temp2 = temp2.next;
             j++;
         }
         
         temp1 = head1;
         temp2 = head2;
         
         if(j < i){
            while(j != i){
                temp1 = temp1.next;
                i--;
            }
         }
         else{
              while(j != i){
                temp2 = temp2.next;
                j--;
            }
         }
         
         while(temp1 != null && temp2 != null){
             if(temp1 == temp2){
                 return temp1.data;
             }
            temp1 = temp1.next;
            temp2 = temp2.next;
         }
         
         return -1;
	}

}
