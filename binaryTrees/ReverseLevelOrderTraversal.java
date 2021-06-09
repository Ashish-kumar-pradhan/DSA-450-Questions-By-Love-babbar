package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
	
	public ArrayList<Integer> reverseLevelOrderI(Node node) 
    {
        
        ArrayList <Integer> arr = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
          Node cur =  qu.remove();
            if(cur.right != null){
                qu.add(cur.right);
            }
            if(cur.left != null){
                qu.add(cur.left);
            }
            arr.add(cur.data);
        }
        
        for(int i = arr.size() - 1 ; i > -1 ; i--){
            arr2.add(arr.get(i));
        }
        return arr2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
