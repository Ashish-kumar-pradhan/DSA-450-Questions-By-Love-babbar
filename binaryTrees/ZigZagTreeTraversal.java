package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZagTreeTraversal {
	
	ArrayList<Integer> zigZagTraversal(Node node)
	{
	    //Add your code here.
	    ArrayList <Integer> arr = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        int s = 0;
        while(!qu.isEmpty()){
            
            ArrayList <Integer> arr1 = new ArrayList<>();
            
            int n = qu.size();
            
            for(int i = 0 ; i < n ; i++ ){
               Node cur =  qu.remove();
                if(cur.left != null){
                    qu.add(cur.left);
                }
                if(cur.right != null){
                    qu.add(cur.right);
                }
                
                arr1.add(cur.data); 
            }
            
            for(int i = 0 ; i < n ; i++ ){
                if(s%2==0){
                    arr.add(arr1.get(i));
                }
                else{
                    arr.add(arr1.get(n-i-1));
                }
            }
            
            s += 1;
          
        }
        
        return arr;
	}

}
